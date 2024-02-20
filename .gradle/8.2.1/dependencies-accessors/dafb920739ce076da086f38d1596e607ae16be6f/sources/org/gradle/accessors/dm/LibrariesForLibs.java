package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final ChLibraryAccessors laccForChLibraryAccessors = new ChLibraryAccessors(owner);
    private final ComLibraryAccessors laccForComLibraryAccessors = new ComLibraryAccessors(owner);
    private final EduLibraryAccessors laccForEduLibraryAccessors = new EduLibraryAccessors(owner);
    private final IoLibraryAccessors laccForIoLibraryAccessors = new IoLibraryAccessors(owner);
    private final JakartaLibraryAccessors laccForJakartaLibraryAccessors = new JakartaLibraryAccessors(owner);
    private final MysqlLibraryAccessors laccForMysqlLibraryAccessors = new MysqlLibraryAccessors(owner);
    private final NzLibraryAccessors laccForNzLibraryAccessors = new NzLibraryAccessors(owner);
    private final OrgLibraryAccessors laccForOrgLibraryAccessors = new OrgLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Returns the group of libraries at ch
     */
    public ChLibraryAccessors getCh() {
        return laccForChLibraryAccessors;
    }

    /**
     * Returns the group of libraries at com
     */
    public ComLibraryAccessors getCom() {
        return laccForComLibraryAccessors;
    }

    /**
     * Returns the group of libraries at edu
     */
    public EduLibraryAccessors getEdu() {
        return laccForEduLibraryAccessors;
    }

    /**
     * Returns the group of libraries at io
     */
    public IoLibraryAccessors getIo() {
        return laccForIoLibraryAccessors;
    }

    /**
     * Returns the group of libraries at jakarta
     */
    public JakartaLibraryAccessors getJakarta() {
        return laccForJakartaLibraryAccessors;
    }

    /**
     * Returns the group of libraries at mysql
     */
    public MysqlLibraryAccessors getMysql() {
        return laccForMysqlLibraryAccessors;
    }

    /**
     * Returns the group of libraries at nz
     */
    public NzLibraryAccessors getNz() {
        return laccForNzLibraryAccessors;
    }

    /**
     * Returns the group of libraries at org
     */
    public OrgLibraryAccessors getOrg() {
        return laccForOrgLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class ChLibraryAccessors extends SubDependencyFactory {
        private final ChQosLibraryAccessors laccForChQosLibraryAccessors = new ChQosLibraryAccessors(owner);

        public ChLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at ch.qos
         */
        public ChQosLibraryAccessors getQos() {
            return laccForChQosLibraryAccessors;
        }

    }

    public static class ChQosLibraryAccessors extends SubDependencyFactory {
        private final ChQosLogbackLibraryAccessors laccForChQosLogbackLibraryAccessors = new ChQosLogbackLibraryAccessors(owner);

        public ChQosLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at ch.qos.logback
         */
        public ChQosLogbackLibraryAccessors getLogback() {
            return laccForChQosLogbackLibraryAccessors;
        }

    }

    public static class ChQosLogbackLibraryAccessors extends SubDependencyFactory {
        private final ChQosLogbackLogbackLibraryAccessors laccForChQosLogbackLogbackLibraryAccessors = new ChQosLogbackLogbackLibraryAccessors(owner);

        public ChQosLogbackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at ch.qos.logback.logback
         */
        public ChQosLogbackLogbackLibraryAccessors getLogback() {
            return laccForChQosLogbackLogbackLibraryAccessors;
        }

    }

    public static class ChQosLogbackLogbackLibraryAccessors extends SubDependencyFactory {

        public ChQosLogbackLogbackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for classic (ch.qos.logback:logback-classic)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getClassic() {
                return create("ch.qos.logback.logback.classic");
        }

            /**
             * Creates a dependency provider for core (ch.qos.logback:logback-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("ch.qos.logback.logback.core");
        }

    }

    public static class ComLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlLibraryAccessors laccForComFasterxmlLibraryAccessors = new ComFasterxmlLibraryAccessors(owner);
        private final ComGoogleLibraryAccessors laccForComGoogleLibraryAccessors = new ComGoogleLibraryAccessors(owner);
        private final ComH2databaseLibraryAccessors laccForComH2databaseLibraryAccessors = new ComH2databaseLibraryAccessors(owner);
        private final ComIbmLibraryAccessors laccForComIbmLibraryAccessors = new ComIbmLibraryAccessors(owner);
        private final ComMaxmindLibraryAccessors laccForComMaxmindLibraryAccessors = new ComMaxmindLibraryAccessors(owner);
        private final ComMicrosoftLibraryAccessors laccForComMicrosoftLibraryAccessors = new ComMicrosoftLibraryAccessors(owner);
        private final ComOracleLibraryAccessors laccForComOracleLibraryAccessors = new ComOracleLibraryAccessors(owner);
        private final ComSquareupLibraryAccessors laccForComSquareupLibraryAccessors = new ComSquareupLibraryAccessors(owner);
        private final ComZaxxerLibraryAccessors laccForComZaxxerLibraryAccessors = new ComZaxxerLibraryAccessors(owner);

        public ComLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for hazelcast (com.hazelcast:hazelcast)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHazelcast() {
                return create("com.hazelcast");
        }

        /**
         * Returns the group of libraries at com.fasterxml
         */
        public ComFasterxmlLibraryAccessors getFasterxml() {
            return laccForComFasterxmlLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.google
         */
        public ComGoogleLibraryAccessors getGoogle() {
            return laccForComGoogleLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.h2database
         */
        public ComH2databaseLibraryAccessors getH2database() {
            return laccForComH2databaseLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.ibm
         */
        public ComIbmLibraryAccessors getIbm() {
            return laccForComIbmLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.maxmind
         */
        public ComMaxmindLibraryAccessors getMaxmind() {
            return laccForComMaxmindLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.microsoft
         */
        public ComMicrosoftLibraryAccessors getMicrosoft() {
            return laccForComMicrosoftLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.oracle
         */
        public ComOracleLibraryAccessors getOracle() {
            return laccForComOracleLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.squareup
         */
        public ComSquareupLibraryAccessors getSquareup() {
            return laccForComSquareupLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.zaxxer
         */
        public ComZaxxerLibraryAccessors getZaxxer() {
            return laccForComZaxxerLibraryAccessors;
        }

    }

    public static class ComFasterxmlLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonLibraryAccessors laccForComFasterxmlJacksonLibraryAccessors = new ComFasterxmlJacksonLibraryAccessors(owner);

        public ComFasterxmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.fasterxml.jackson
         */
        public ComFasterxmlJacksonLibraryAccessors getJackson() {
            return laccForComFasterxmlJacksonLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonCoreLibraryAccessors laccForComFasterxmlJacksonCoreLibraryAccessors = new ComFasterxmlJacksonCoreLibraryAccessors(owner);
        private final ComFasterxmlJacksonJacksonLibraryAccessors laccForComFasterxmlJacksonJacksonLibraryAccessors = new ComFasterxmlJacksonJacksonLibraryAccessors(owner);

        public ComFasterxmlJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.fasterxml.jackson.core
         */
        public ComFasterxmlJacksonCoreLibraryAccessors getCore() {
            return laccForComFasterxmlJacksonCoreLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.fasterxml.jackson.jackson
         */
        public ComFasterxmlJacksonJacksonLibraryAccessors getJackson() {
            return laccForComFasterxmlJacksonJacksonLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonCoreLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonCoreJacksonLibraryAccessors laccForComFasterxmlJacksonCoreJacksonLibraryAccessors = new ComFasterxmlJacksonCoreJacksonLibraryAccessors(owner);

        public ComFasterxmlJacksonCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.fasterxml.jackson.core.jackson
         */
        public ComFasterxmlJacksonCoreJacksonLibraryAccessors getJackson() {
            return laccForComFasterxmlJacksonCoreJacksonLibraryAccessors;
        }

    }

    public static class ComFasterxmlJacksonCoreJacksonLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlJacksonCoreJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for databind (com.fasterxml.jackson.core:jackson-databind)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatabind() {
                return create("com.fasterxml.jackson.core.jackson.databind");
        }

    }

    public static class ComFasterxmlJacksonJacksonLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlJacksonJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (com.fasterxml.jackson:jackson-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("com.fasterxml.jackson.jackson.bom");
        }

    }

    public static class ComGoogleLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleCodeLibraryAccessors laccForComGoogleCodeLibraryAccessors = new ComGoogleCodeLibraryAccessors(owner);

        public ComGoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.code
         */
        public ComGoogleCodeLibraryAccessors getCode() {
            return laccForComGoogleCodeLibraryAccessors;
        }

    }

    public static class ComGoogleCodeLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleCodeFindbugsLibraryAccessors laccForComGoogleCodeFindbugsLibraryAccessors = new ComGoogleCodeFindbugsLibraryAccessors(owner);

        public ComGoogleCodeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.code.findbugs
         */
        public ComGoogleCodeFindbugsLibraryAccessors getFindbugs() {
            return laccForComGoogleCodeFindbugsLibraryAccessors;
        }

    }

    public static class ComGoogleCodeFindbugsLibraryAccessors extends SubDependencyFactory {

        public ComGoogleCodeFindbugsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jsr305 (com.google.code.findbugs:jsr305)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJsr305() {
                return create("com.google.code.findbugs.jsr305");
        }

    }

    public static class ComH2databaseLibraryAccessors extends SubDependencyFactory {

        public ComH2databaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for h2 (com.h2database:h2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getH2() {
                return create("com.h2database.h2");
        }

    }

    public static class ComIbmLibraryAccessors extends SubDependencyFactory {
        private final ComIbmDb2LibraryAccessors laccForComIbmDb2LibraryAccessors = new ComIbmDb2LibraryAccessors(owner);

        public ComIbmLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.ibm.db2
         */
        public ComIbmDb2LibraryAccessors getDb2() {
            return laccForComIbmDb2LibraryAccessors;
        }

    }

    public static class ComIbmDb2LibraryAccessors extends SubDependencyFactory {

        public ComIbmDb2LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jcc (com.ibm.db2:jcc)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJcc() {
                return create("com.ibm.db2.jcc");
        }

    }

    public static class ComMaxmindLibraryAccessors extends SubDependencyFactory {

        public ComMaxmindLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for geoip2 (com.maxmind.geoip2:geoip2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGeoip2() {
                return create("com.maxmind.geoip2");
        }

    }

    public static class ComMicrosoftLibraryAccessors extends SubDependencyFactory {
        private final ComMicrosoftSqlserverLibraryAccessors laccForComMicrosoftSqlserverLibraryAccessors = new ComMicrosoftSqlserverLibraryAccessors(owner);

        public ComMicrosoftLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.microsoft.sqlserver
         */
        public ComMicrosoftSqlserverLibraryAccessors getSqlserver() {
            return laccForComMicrosoftSqlserverLibraryAccessors;
        }

    }

    public static class ComMicrosoftSqlserverLibraryAccessors extends SubDependencyFactory {
        private final ComMicrosoftSqlserverMssqlLibraryAccessors laccForComMicrosoftSqlserverMssqlLibraryAccessors = new ComMicrosoftSqlserverMssqlLibraryAccessors(owner);

        public ComMicrosoftSqlserverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.microsoft.sqlserver.mssql
         */
        public ComMicrosoftSqlserverMssqlLibraryAccessors getMssql() {
            return laccForComMicrosoftSqlserverMssqlLibraryAccessors;
        }

    }

    public static class ComMicrosoftSqlserverMssqlLibraryAccessors extends SubDependencyFactory {

        public ComMicrosoftSqlserverMssqlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jdbc (com.microsoft.sqlserver:mssql-jdbc)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdbc() {
                return create("com.microsoft.sqlserver.mssql.jdbc");
        }

    }

    public static class ComOracleLibraryAccessors extends SubDependencyFactory {
        private final ComOracleDatabaseLibraryAccessors laccForComOracleDatabaseLibraryAccessors = new ComOracleDatabaseLibraryAccessors(owner);

        public ComOracleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.oracle.database
         */
        public ComOracleDatabaseLibraryAccessors getDatabase() {
            return laccForComOracleDatabaseLibraryAccessors;
        }

    }

    public static class ComOracleDatabaseLibraryAccessors extends SubDependencyFactory {
        private final ComOracleDatabaseJdbcLibraryAccessors laccForComOracleDatabaseJdbcLibraryAccessors = new ComOracleDatabaseJdbcLibraryAccessors(owner);

        public ComOracleDatabaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.oracle.database.jdbc
         */
        public ComOracleDatabaseJdbcLibraryAccessors getJdbc() {
            return laccForComOracleDatabaseJdbcLibraryAccessors;
        }

    }

    public static class ComOracleDatabaseJdbcLibraryAccessors extends SubDependencyFactory {

        public ComOracleDatabaseJdbcLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ojdbc8 (com.oracle.database.jdbc:ojdbc8)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOjdbc8() {
                return create("com.oracle.database.jdbc.ojdbc8");
        }

    }

    public static class ComSquareupLibraryAccessors extends SubDependencyFactory {
        private final ComSquareupOkhttp3LibraryAccessors laccForComSquareupOkhttp3LibraryAccessors = new ComSquareupOkhttp3LibraryAccessors(owner);

        public ComSquareupLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.squareup.okhttp3
         */
        public ComSquareupOkhttp3LibraryAccessors getOkhttp3() {
            return laccForComSquareupOkhttp3LibraryAccessors;
        }

    }

    public static class ComSquareupOkhttp3LibraryAccessors extends SubDependencyFactory {

        public ComSquareupOkhttp3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for okhttp (com.squareup.okhttp3:okhttp)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOkhttp() {
                return create("com.squareup.okhttp3.okhttp");
        }

    }

    public static class ComZaxxerLibraryAccessors extends SubDependencyFactory {

        public ComZaxxerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for HikariCP (com.zaxxer:HikariCP)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHikariCP() {
                return create("com.zaxxer.HikariCP");
        }

    }

    public static class EduLibraryAccessors extends SubDependencyFactory {
        private final EduUmdLibraryAccessors laccForEduUmdLibraryAccessors = new EduUmdLibraryAccessors(owner);

        public EduLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at edu.umd
         */
        public EduUmdLibraryAccessors getUmd() {
            return laccForEduUmdLibraryAccessors;
        }

    }

    public static class EduUmdLibraryAccessors extends SubDependencyFactory {
        private final EduUmdCsLibraryAccessors laccForEduUmdCsLibraryAccessors = new EduUmdCsLibraryAccessors(owner);

        public EduUmdLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at edu.umd.cs
         */
        public EduUmdCsLibraryAccessors getCs() {
            return laccForEduUmdCsLibraryAccessors;
        }

    }

    public static class EduUmdCsLibraryAccessors extends SubDependencyFactory {
        private final EduUmdCsMtcLibraryAccessors laccForEduUmdCsMtcLibraryAccessors = new EduUmdCsMtcLibraryAccessors(owner);

        public EduUmdCsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at edu.umd.cs.mtc
         */
        public EduUmdCsMtcLibraryAccessors getMtc() {
            return laccForEduUmdCsMtcLibraryAccessors;
        }

    }

    public static class EduUmdCsMtcLibraryAccessors extends SubDependencyFactory {

        public EduUmdCsMtcLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for multithreadedtc (edu.umd.cs.mtc:multithreadedtc)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMultithreadedtc() {
                return create("edu.umd.cs.mtc.multithreadedtc");
        }

    }

    public static class IoLibraryAccessors extends SubDependencyFactory {
        private final IoLettuceLibraryAccessors laccForIoLettuceLibraryAccessors = new IoLettuceLibraryAccessors(owner);
        private final IoProjectreactorLibraryAccessors laccForIoProjectreactorLibraryAccessors = new IoProjectreactorLibraryAccessors(owner);
        private final IoSpringLibraryAccessors laccForIoSpringLibraryAccessors = new IoSpringLibraryAccessors(owner);

        public IoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.lettuce
         */
        public IoLettuceLibraryAccessors getLettuce() {
            return laccForIoLettuceLibraryAccessors;
        }

        /**
         * Returns the group of libraries at io.projectreactor
         */
        public IoProjectreactorLibraryAccessors getProjectreactor() {
            return laccForIoProjectreactorLibraryAccessors;
        }

        /**
         * Returns the group of libraries at io.spring
         */
        public IoSpringLibraryAccessors getSpring() {
            return laccForIoSpringLibraryAccessors;
        }

    }

    public static class IoLettuceLibraryAccessors extends SubDependencyFactory {
        private final IoLettuceLettuceLibraryAccessors laccForIoLettuceLettuceLibraryAccessors = new IoLettuceLettuceLibraryAccessors(owner);

        public IoLettuceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.lettuce.lettuce
         */
        public IoLettuceLettuceLibraryAccessors getLettuce() {
            return laccForIoLettuceLettuceLibraryAccessors;
        }

    }

    public static class IoLettuceLettuceLibraryAccessors extends SubDependencyFactory {

        public IoLettuceLettuceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (io.lettuce:lettuce-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("io.lettuce.lettuce.core");
        }

    }

    public static class IoProjectreactorLibraryAccessors extends SubDependencyFactory {
        private final IoProjectreactorReactorLibraryAccessors laccForIoProjectreactorReactorLibraryAccessors = new IoProjectreactorReactorLibraryAccessors(owner);

        public IoProjectreactorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.projectreactor.reactor
         */
        public IoProjectreactorReactorLibraryAccessors getReactor() {
            return laccForIoProjectreactorReactorLibraryAccessors;
        }

    }

    public static class IoProjectreactorReactorLibraryAccessors extends SubDependencyFactory {

        public IoProjectreactorReactorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (io.projectreactor:reactor-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("io.projectreactor.reactor.bom");
        }

    }

    public static class IoSpringLibraryAccessors extends SubDependencyFactory {
        private final IoSpringJavaformatLibraryAccessors laccForIoSpringJavaformatLibraryAccessors = new IoSpringJavaformatLibraryAccessors(owner);
        private final IoSpringNohttpLibraryAccessors laccForIoSpringNohttpLibraryAccessors = new IoSpringNohttpLibraryAccessors(owner);

        public IoSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.spring.javaformat
         */
        public IoSpringJavaformatLibraryAccessors getJavaformat() {
            return laccForIoSpringJavaformatLibraryAccessors;
        }

        /**
         * Returns the group of libraries at io.spring.nohttp
         */
        public IoSpringNohttpLibraryAccessors getNohttp() {
            return laccForIoSpringNohttpLibraryAccessors;
        }

    }

    public static class IoSpringJavaformatLibraryAccessors extends SubDependencyFactory {
        private final IoSpringJavaformatSpringLibraryAccessors laccForIoSpringJavaformatSpringLibraryAccessors = new IoSpringJavaformatSpringLibraryAccessors(owner);

        public IoSpringJavaformatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.spring.javaformat.spring
         */
        public IoSpringJavaformatSpringLibraryAccessors getSpring() {
            return laccForIoSpringJavaformatSpringLibraryAccessors;
        }

    }

    public static class IoSpringJavaformatSpringLibraryAccessors extends SubDependencyFactory {
        private final IoSpringJavaformatSpringJavaformatLibraryAccessors laccForIoSpringJavaformatSpringJavaformatLibraryAccessors = new IoSpringJavaformatSpringJavaformatLibraryAccessors(owner);

        public IoSpringJavaformatSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.spring.javaformat.spring.javaformat
         */
        public IoSpringJavaformatSpringJavaformatLibraryAccessors getJavaformat() {
            return laccForIoSpringJavaformatSpringJavaformatLibraryAccessors;
        }

    }

    public static class IoSpringJavaformatSpringJavaformatLibraryAccessors extends SubDependencyFactory {

        public IoSpringJavaformatSpringJavaformatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for checkstyle (io.spring.javaformat:spring-javaformat-checkstyle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCheckstyle() {
                return create("io.spring.javaformat.spring.javaformat.checkstyle");
        }

    }

    public static class IoSpringNohttpLibraryAccessors extends SubDependencyFactory {
        private final IoSpringNohttpNohttpLibraryAccessors laccForIoSpringNohttpNohttpLibraryAccessors = new IoSpringNohttpNohttpLibraryAccessors(owner);

        public IoSpringNohttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.spring.nohttp.nohttp
         */
        public IoSpringNohttpNohttpLibraryAccessors getNohttp() {
            return laccForIoSpringNohttpNohttpLibraryAccessors;
        }

    }

    public static class IoSpringNohttpNohttpLibraryAccessors extends SubDependencyFactory {

        public IoSpringNohttpNohttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for checkstyle (io.spring.nohttp:nohttp-checkstyle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCheckstyle() {
                return create("io.spring.nohttp.nohttp.checkstyle");
        }

    }

    public static class JakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletLibraryAccessors laccForJakartaServletLibraryAccessors = new JakartaServletLibraryAccessors(owner);
        private final JakartaWebsocketLibraryAccessors laccForJakartaWebsocketLibraryAccessors = new JakartaWebsocketLibraryAccessors(owner);

        public JakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet
         */
        public JakartaServletLibraryAccessors getServlet() {
            return laccForJakartaServletLibraryAccessors;
        }

        /**
         * Returns the group of libraries at jakarta.websocket
         */
        public JakartaWebsocketLibraryAccessors getWebsocket() {
            return laccForJakartaWebsocketLibraryAccessors;
        }

    }

    public static class JakartaServletLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJakartaLibraryAccessors laccForJakartaServletJakartaLibraryAccessors = new JakartaServletJakartaLibraryAccessors(owner);
        private final JakartaServletJspLibraryAccessors laccForJakartaServletJspLibraryAccessors = new JakartaServletJspLibraryAccessors(owner);

        public JakartaServletLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jakarta
         */
        public JakartaServletJakartaLibraryAccessors getJakarta() {
            return laccForJakartaServletJakartaLibraryAccessors;
        }

        /**
         * Returns the group of libraries at jakarta.servlet.jsp
         */
        public JakartaServletJspLibraryAccessors getJsp() {
            return laccForJakartaServletJspLibraryAccessors;
        }

    }

    public static class JakartaServletJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJakartaServletLibraryAccessors laccForJakartaServletJakartaServletLibraryAccessors = new JakartaServletJakartaServletLibraryAccessors(owner);

        public JakartaServletJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jakarta.servlet
         */
        public JakartaServletJakartaServletLibraryAccessors getServlet() {
            return laccForJakartaServletJakartaServletLibraryAccessors;
        }

    }

    public static class JakartaServletJakartaServletLibraryAccessors extends SubDependencyFactory {

        public JakartaServletJakartaServletLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (jakarta.servlet:jakarta.servlet-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() {
                return create("jakarta.servlet.jakarta.servlet.api");
        }

    }

    public static class JakartaServletJspLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJspJstlLibraryAccessors laccForJakartaServletJspJstlLibraryAccessors = new JakartaServletJspJstlLibraryAccessors(owner);

        public JakartaServletJspLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jsp.jstl
         */
        public JakartaServletJspJstlLibraryAccessors getJstl() {
            return laccForJakartaServletJspJstlLibraryAccessors;
        }

    }

    public static class JakartaServletJspJstlLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJspJstlJakartaLibraryAccessors laccForJakartaServletJspJstlJakartaLibraryAccessors = new JakartaServletJspJstlJakartaLibraryAccessors(owner);

        public JakartaServletJspJstlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jsp.jstl.jakarta
         */
        public JakartaServletJspJstlJakartaLibraryAccessors getJakarta() {
            return laccForJakartaServletJspJstlJakartaLibraryAccessors;
        }

    }

    public static class JakartaServletJspJstlJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJspJstlJakartaServletLibraryAccessors laccForJakartaServletJspJstlJakartaServletLibraryAccessors = new JakartaServletJspJstlJakartaServletLibraryAccessors(owner);

        public JakartaServletJspJstlJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jsp.jstl.jakarta.servlet
         */
        public JakartaServletJspJstlJakartaServletLibraryAccessors getServlet() {
            return laccForJakartaServletJspJstlJakartaServletLibraryAccessors;
        }

    }

    public static class JakartaServletJspJstlJakartaServletLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJspJstlJakartaServletJspLibraryAccessors laccForJakartaServletJspJstlJakartaServletJspLibraryAccessors = new JakartaServletJspJstlJakartaServletJspLibraryAccessors(owner);

        public JakartaServletJspJstlJakartaServletLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jsp.jstl.jakarta.servlet.jsp
         */
        public JakartaServletJspJstlJakartaServletJspLibraryAccessors getJsp() {
            return laccForJakartaServletJspJstlJakartaServletJspLibraryAccessors;
        }

    }

    public static class JakartaServletJspJstlJakartaServletJspLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJspJstlJakartaServletJspJstlLibraryAccessors laccForJakartaServletJspJstlJakartaServletJspJstlLibraryAccessors = new JakartaServletJspJstlJakartaServletJspJstlLibraryAccessors(owner);

        public JakartaServletJspJstlJakartaServletJspLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jsp.jstl.jakarta.servlet.jsp.jstl
         */
        public JakartaServletJspJstlJakartaServletJspJstlLibraryAccessors getJstl() {
            return laccForJakartaServletJspJstlJakartaServletJspJstlLibraryAccessors;
        }

    }

    public static class JakartaServletJspJstlJakartaServletJspJstlLibraryAccessors extends SubDependencyFactory {

        public JakartaServletJspJstlJakartaServletJspJstlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() {
                return create("jakarta.servlet.jsp.jstl.jakarta.servlet.jsp.jstl.api");
        }

    }

    public static class JakartaWebsocketLibraryAccessors extends SubDependencyFactory {
        private final JakartaWebsocketJakartaLibraryAccessors laccForJakartaWebsocketJakartaLibraryAccessors = new JakartaWebsocketJakartaLibraryAccessors(owner);

        public JakartaWebsocketLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.websocket.jakarta
         */
        public JakartaWebsocketJakartaLibraryAccessors getJakarta() {
            return laccForJakartaWebsocketJakartaLibraryAccessors;
        }

    }

    public static class JakartaWebsocketJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaWebsocketJakartaWebsocketLibraryAccessors laccForJakartaWebsocketJakartaWebsocketLibraryAccessors = new JakartaWebsocketJakartaWebsocketLibraryAccessors(owner);

        public JakartaWebsocketJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.websocket.jakarta.websocket
         */
        public JakartaWebsocketJakartaWebsocketLibraryAccessors getWebsocket() {
            return laccForJakartaWebsocketJakartaWebsocketLibraryAccessors;
        }

    }

    public static class JakartaWebsocketJakartaWebsocketLibraryAccessors extends SubDependencyFactory {
        private final JakartaWebsocketJakartaWebsocketClientLibraryAccessors laccForJakartaWebsocketJakartaWebsocketClientLibraryAccessors = new JakartaWebsocketJakartaWebsocketClientLibraryAccessors(owner);

        public JakartaWebsocketJakartaWebsocketLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (jakarta.websocket:jakarta.websocket-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() {
                return create("jakarta.websocket.jakarta.websocket.api");
        }

        /**
         * Returns the group of libraries at jakarta.websocket.jakarta.websocket.client
         */
        public JakartaWebsocketJakartaWebsocketClientLibraryAccessors getClient() {
            return laccForJakartaWebsocketJakartaWebsocketClientLibraryAccessors;
        }

    }

    public static class JakartaWebsocketJakartaWebsocketClientLibraryAccessors extends SubDependencyFactory {

        public JakartaWebsocketJakartaWebsocketClientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (jakarta.websocket:jakarta.websocket-client-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() {
                return create("jakarta.websocket.jakarta.websocket.client.api");
        }

    }

    public static class MysqlLibraryAccessors extends SubDependencyFactory {
        private final MysqlMysqlLibraryAccessors laccForMysqlMysqlLibraryAccessors = new MysqlMysqlLibraryAccessors(owner);

        public MysqlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at mysql.mysql
         */
        public MysqlMysqlLibraryAccessors getMysql() {
            return laccForMysqlMysqlLibraryAccessors;
        }

    }

    public static class MysqlMysqlLibraryAccessors extends SubDependencyFactory {
        private final MysqlMysqlConnectorLibraryAccessors laccForMysqlMysqlConnectorLibraryAccessors = new MysqlMysqlConnectorLibraryAccessors(owner);

        public MysqlMysqlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at mysql.mysql.connector
         */
        public MysqlMysqlConnectorLibraryAccessors getConnector() {
            return laccForMysqlMysqlConnectorLibraryAccessors;
        }

    }

    public static class MysqlMysqlConnectorLibraryAccessors extends SubDependencyFactory {

        public MysqlMysqlConnectorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for java (mysql:mysql-connector-java)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJava() {
                return create("mysql.mysql.connector.java");
        }

    }

    public static class NzLibraryAccessors extends SubDependencyFactory {
        private final NzNetLibraryAccessors laccForNzNetLibraryAccessors = new NzNetLibraryAccessors(owner);

        public NzLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at nz.net
         */
        public NzNetLibraryAccessors getNet() {
            return laccForNzNetLibraryAccessors;
        }

    }

    public static class NzNetLibraryAccessors extends SubDependencyFactory {
        private final NzNetUltraqLibraryAccessors laccForNzNetUltraqLibraryAccessors = new NzNetUltraqLibraryAccessors(owner);

        public NzNetLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at nz.net.ultraq
         */
        public NzNetUltraqLibraryAccessors getUltraq() {
            return laccForNzNetUltraqLibraryAccessors;
        }

    }

    public static class NzNetUltraqLibraryAccessors extends SubDependencyFactory {
        private final NzNetUltraqThymeleafLibraryAccessors laccForNzNetUltraqThymeleafLibraryAccessors = new NzNetUltraqThymeleafLibraryAccessors(owner);

        public NzNetUltraqLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at nz.net.ultraq.thymeleaf
         */
        public NzNetUltraqThymeleafLibraryAccessors getThymeleaf() {
            return laccForNzNetUltraqThymeleafLibraryAccessors;
        }

    }

    public static class NzNetUltraqThymeleafLibraryAccessors extends SubDependencyFactory {
        private final NzNetUltraqThymeleafThymeleafLibraryAccessors laccForNzNetUltraqThymeleafThymeleafLibraryAccessors = new NzNetUltraqThymeleafThymeleafLibraryAccessors(owner);

        public NzNetUltraqThymeleafLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at nz.net.ultraq.thymeleaf.thymeleaf
         */
        public NzNetUltraqThymeleafThymeleafLibraryAccessors getThymeleaf() {
            return laccForNzNetUltraqThymeleafThymeleafLibraryAccessors;
        }

    }

    public static class NzNetUltraqThymeleafThymeleafLibraryAccessors extends SubDependencyFactory {
        private final NzNetUltraqThymeleafThymeleafLayoutLibraryAccessors laccForNzNetUltraqThymeleafThymeleafLayoutLibraryAccessors = new NzNetUltraqThymeleafThymeleafLayoutLibraryAccessors(owner);

        public NzNetUltraqThymeleafThymeleafLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at nz.net.ultraq.thymeleaf.thymeleaf.layout
         */
        public NzNetUltraqThymeleafThymeleafLayoutLibraryAccessors getLayout() {
            return laccForNzNetUltraqThymeleafThymeleafLayoutLibraryAccessors;
        }

    }

    public static class NzNetUltraqThymeleafThymeleafLayoutLibraryAccessors extends SubDependencyFactory {

        public NzNetUltraqThymeleafThymeleafLayoutLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for dialect (nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDialect() {
                return create("nz.net.ultraq.thymeleaf.thymeleaf.layout.dialect");
        }

    }

    public static class OrgLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheLibraryAccessors laccForOrgApacheLibraryAccessors = new OrgApacheLibraryAccessors(owner);
        private final OrgAspectjLibraryAccessors laccForOrgAspectjLibraryAccessors = new OrgAspectjLibraryAccessors(owner);
        private final OrgAssertjLibraryAccessors laccForOrgAssertjLibraryAccessors = new OrgAssertjLibraryAccessors(owner);
        private final OrgJunitLibraryAccessors laccForOrgJunitLibraryAccessors = new OrgJunitLibraryAccessors(owner);
        private final OrgMariadbLibraryAccessors laccForOrgMariadbLibraryAccessors = new OrgMariadbLibraryAccessors(owner);
        private final OrgMockitoLibraryAccessors laccForOrgMockitoLibraryAccessors = new OrgMockitoLibraryAccessors(owner);
        private final OrgMongodbLibraryAccessors laccForOrgMongodbLibraryAccessors = new OrgMongodbLibraryAccessors(owner);
        private final OrgSeleniumhqLibraryAccessors laccForOrgSeleniumhqLibraryAccessors = new OrgSeleniumhqLibraryAccessors(owner);
        private final OrgSkyscreamerLibraryAccessors laccForOrgSkyscreamerLibraryAccessors = new OrgSkyscreamerLibraryAccessors(owner);
        private final OrgSlf4jLibraryAccessors laccForOrgSlf4jLibraryAccessors = new OrgSlf4jLibraryAccessors(owner);
        private final OrgSpringframeworkLibraryAccessors laccForOrgSpringframeworkLibraryAccessors = new OrgSpringframeworkLibraryAccessors(owner);
        private final OrgTestcontainersLibraryAccessors laccForOrgTestcontainersLibraryAccessors = new OrgTestcontainersLibraryAccessors(owner);

        public OrgLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for hamcrest (org.hamcrest:hamcrest)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHamcrest() {
                return create("org.hamcrest");
        }

            /**
             * Creates a dependency provider for hsqldb (org.hsqldb:hsqldb)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHsqldb() {
                return create("org.hsqldb");
        }

            /**
             * Creates a dependency provider for postgresql (org.postgresql:postgresql)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPostgresql() {
                return create("org.postgresql");
        }

        /**
         * Returns the group of libraries at org.apache
         */
        public OrgApacheLibraryAccessors getApache() {
            return laccForOrgApacheLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.aspectj
         */
        public OrgAspectjLibraryAccessors getAspectj() {
            return laccForOrgAspectjLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.assertj
         */
        public OrgAssertjLibraryAccessors getAssertj() {
            return laccForOrgAssertjLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.junit
         */
        public OrgJunitLibraryAccessors getJunit() {
            return laccForOrgJunitLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.mariadb
         */
        public OrgMariadbLibraryAccessors getMariadb() {
            return laccForOrgMariadbLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.mockito
         */
        public OrgMockitoLibraryAccessors getMockito() {
            return laccForOrgMockitoLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.mongodb
         */
        public OrgMongodbLibraryAccessors getMongodb() {
            return laccForOrgMongodbLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.seleniumhq
         */
        public OrgSeleniumhqLibraryAccessors getSeleniumhq() {
            return laccForOrgSeleniumhqLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.skyscreamer
         */
        public OrgSkyscreamerLibraryAccessors getSkyscreamer() {
            return laccForOrgSkyscreamerLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.slf4j
         */
        public OrgSlf4jLibraryAccessors getSlf4j() {
            return laccForOrgSlf4jLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.springframework
         */
        public OrgSpringframeworkLibraryAccessors getSpringframework() {
            return laccForOrgSpringframeworkLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.testcontainers
         */
        public OrgTestcontainersLibraryAccessors getTestcontainers() {
            return laccForOrgTestcontainersLibraryAccessors;
        }

    }

    public static class OrgApacheLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheDerbyLibraryAccessors laccForOrgApacheDerbyLibraryAccessors = new OrgApacheDerbyLibraryAccessors(owner);
        private final OrgApacheHttpcomponentsLibraryAccessors laccForOrgApacheHttpcomponentsLibraryAccessors = new OrgApacheHttpcomponentsLibraryAccessors(owner);
        private final OrgApacheLoggingLibraryAccessors laccForOrgApacheLoggingLibraryAccessors = new OrgApacheLoggingLibraryAccessors(owner);

        public OrgApacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.apache.derby
         */
        public OrgApacheDerbyLibraryAccessors getDerby() {
            return laccForOrgApacheDerbyLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.apache.httpcomponents
         */
        public OrgApacheHttpcomponentsLibraryAccessors getHttpcomponents() {
            return laccForOrgApacheHttpcomponentsLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.apache.logging
         */
        public OrgApacheLoggingLibraryAccessors getLogging() {
            return laccForOrgApacheLoggingLibraryAccessors;
        }

    }

    public static class OrgApacheDerbyLibraryAccessors extends SubDependencyFactory {

        public OrgApacheDerbyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for derby (org.apache.derby:derby)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDerby() {
                return create("org.apache.derby.derby");
        }

            /**
             * Creates a dependency provider for derbytools (org.apache.derby:derbytools)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDerbytools() {
                return create("org.apache.derby.derbytools");
        }

    }

    public static class OrgApacheHttpcomponentsLibraryAccessors extends SubDependencyFactory {

        public OrgApacheHttpcomponentsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for httpclient (org.apache.httpcomponents:httpclient)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHttpclient() {
                return create("org.apache.httpcomponents.httpclient");
        }

    }

    public static class OrgApacheLoggingLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheLoggingLog4jLibraryAccessors laccForOrgApacheLoggingLog4jLibraryAccessors = new OrgApacheLoggingLog4jLibraryAccessors(owner);

        public OrgApacheLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.apache.logging.log4j
         */
        public OrgApacheLoggingLog4jLibraryAccessors getLog4j() {
            return laccForOrgApacheLoggingLog4jLibraryAccessors;
        }

    }

    public static class OrgApacheLoggingLog4jLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheLoggingLog4jLog4jLibraryAccessors laccForOrgApacheLoggingLog4jLog4jLibraryAccessors = new OrgApacheLoggingLog4jLog4jLibraryAccessors(owner);

        public OrgApacheLoggingLog4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.apache.logging.log4j.log4j
         */
        public OrgApacheLoggingLog4jLog4jLibraryAccessors getLog4j() {
            return laccForOrgApacheLoggingLog4jLog4jLibraryAccessors;
        }

    }

    public static class OrgApacheLoggingLog4jLog4jLibraryAccessors extends SubDependencyFactory {

        public OrgApacheLoggingLog4jLog4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.apache.logging.log4j:log4j-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("org.apache.logging.log4j.log4j.core");
        }

    }

    public static class OrgAspectjLibraryAccessors extends SubDependencyFactory {

        public OrgAspectjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for aspectjweaver (org.aspectj:aspectjweaver)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAspectjweaver() {
                return create("org.aspectj.aspectjweaver");
        }

    }

    public static class OrgAssertjLibraryAccessors extends SubDependencyFactory {
        private final OrgAssertjAssertjLibraryAccessors laccForOrgAssertjAssertjLibraryAccessors = new OrgAssertjAssertjLibraryAccessors(owner);

        public OrgAssertjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.assertj.assertj
         */
        public OrgAssertjAssertjLibraryAccessors getAssertj() {
            return laccForOrgAssertjAssertjLibraryAccessors;
        }

    }

    public static class OrgAssertjAssertjLibraryAccessors extends SubDependencyFactory {

        public OrgAssertjAssertjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.assertj:assertj-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("org.assertj.assertj.core");
        }

    }

    public static class OrgJunitLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitJunitLibraryAccessors laccForOrgJunitJunitLibraryAccessors = new OrgJunitJunitLibraryAccessors(owner);

        public OrgJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.junit.junit
         */
        public OrgJunitJunitLibraryAccessors getJunit() {
            return laccForOrgJunitJunitLibraryAccessors;
        }

    }

    public static class OrgJunitJunitLibraryAccessors extends SubDependencyFactory {

        public OrgJunitJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (org.junit:junit-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("org.junit.junit.bom");
        }

    }

    public static class OrgMariadbLibraryAccessors extends SubDependencyFactory {
        private final OrgMariadbJdbcLibraryAccessors laccForOrgMariadbJdbcLibraryAccessors = new OrgMariadbJdbcLibraryAccessors(owner);

        public OrgMariadbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mariadb.jdbc
         */
        public OrgMariadbJdbcLibraryAccessors getJdbc() {
            return laccForOrgMariadbJdbcLibraryAccessors;
        }

    }

    public static class OrgMariadbJdbcLibraryAccessors extends SubDependencyFactory {
        private final OrgMariadbJdbcMariadbLibraryAccessors laccForOrgMariadbJdbcMariadbLibraryAccessors = new OrgMariadbJdbcMariadbLibraryAccessors(owner);

        public OrgMariadbJdbcLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mariadb.jdbc.mariadb
         */
        public OrgMariadbJdbcMariadbLibraryAccessors getMariadb() {
            return laccForOrgMariadbJdbcMariadbLibraryAccessors;
        }

    }

    public static class OrgMariadbJdbcMariadbLibraryAccessors extends SubDependencyFactory {
        private final OrgMariadbJdbcMariadbJavaLibraryAccessors laccForOrgMariadbJdbcMariadbJavaLibraryAccessors = new OrgMariadbJdbcMariadbJavaLibraryAccessors(owner);

        public OrgMariadbJdbcMariadbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mariadb.jdbc.mariadb.java
         */
        public OrgMariadbJdbcMariadbJavaLibraryAccessors getJava() {
            return laccForOrgMariadbJdbcMariadbJavaLibraryAccessors;
        }

    }

    public static class OrgMariadbJdbcMariadbJavaLibraryAccessors extends SubDependencyFactory {

        public OrgMariadbJdbcMariadbJavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for client (org.mariadb.jdbc:mariadb-java-client)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getClient() {
                return create("org.mariadb.jdbc.mariadb.java.client");
        }

    }

    public static class OrgMockitoLibraryAccessors extends SubDependencyFactory {
        private final OrgMockitoMockitoLibraryAccessors laccForOrgMockitoMockitoLibraryAccessors = new OrgMockitoMockitoLibraryAccessors(owner);

        public OrgMockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mockito.mockito
         */
        public OrgMockitoMockitoLibraryAccessors getMockito() {
            return laccForOrgMockitoMockitoLibraryAccessors;
        }

    }

    public static class OrgMockitoMockitoLibraryAccessors extends SubDependencyFactory {

        public OrgMockitoMockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (org.mockito:mockito-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("org.mockito.mockito.bom");
        }

    }

    public static class OrgMongodbLibraryAccessors extends SubDependencyFactory {
        private final OrgMongodbMongodbLibraryAccessors laccForOrgMongodbMongodbLibraryAccessors = new OrgMongodbMongodbLibraryAccessors(owner);

        public OrgMongodbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mongodb.mongodb
         */
        public OrgMongodbMongodbLibraryAccessors getMongodb() {
            return laccForOrgMongodbMongodbLibraryAccessors;
        }

    }

    public static class OrgMongodbMongodbLibraryAccessors extends SubDependencyFactory {
        private final OrgMongodbMongodbDriverLibraryAccessors laccForOrgMongodbMongodbDriverLibraryAccessors = new OrgMongodbMongodbDriverLibraryAccessors(owner);

        public OrgMongodbMongodbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mongodb.mongodb.driver
         */
        public OrgMongodbMongodbDriverLibraryAccessors getDriver() {
            return laccForOrgMongodbMongodbDriverLibraryAccessors;
        }

    }

    public static class OrgMongodbMongodbDriverLibraryAccessors extends SubDependencyFactory {

        public OrgMongodbMongodbDriverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.mongodb:mongodb-driver-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("org.mongodb.mongodb.driver.core");
        }

            /**
             * Creates a dependency provider for reactivestreams (org.mongodb:mongodb-driver-reactivestreams)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getReactivestreams() {
                return create("org.mongodb.mongodb.driver.reactivestreams");
        }

            /**
             * Creates a dependency provider for sync (org.mongodb:mongodb-driver-sync)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSync() {
                return create("org.mongodb.mongodb.driver.sync");
        }

    }

    public static class OrgSeleniumhqLibraryAccessors extends SubDependencyFactory {
        private final OrgSeleniumhqSeleniumLibraryAccessors laccForOrgSeleniumhqSeleniumLibraryAccessors = new OrgSeleniumhqSeleniumLibraryAccessors(owner);

        public OrgSeleniumhqLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.seleniumhq.selenium
         */
        public OrgSeleniumhqSeleniumLibraryAccessors getSelenium() {
            return laccForOrgSeleniumhqSeleniumLibraryAccessors;
        }

    }

    public static class OrgSeleniumhqSeleniumLibraryAccessors extends SubDependencyFactory {
        private final OrgSeleniumhqSeleniumHtmlunitLibraryAccessors laccForOrgSeleniumhqSeleniumHtmlunitLibraryAccessors = new OrgSeleniumhqSeleniumHtmlunitLibraryAccessors(owner);
        private final OrgSeleniumhqSeleniumSeleniumLibraryAccessors laccForOrgSeleniumhqSeleniumSeleniumLibraryAccessors = new OrgSeleniumhqSeleniumSeleniumLibraryAccessors(owner);

        public OrgSeleniumhqSeleniumLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.seleniumhq.selenium.htmlunit
         */
        public OrgSeleniumhqSeleniumHtmlunitLibraryAccessors getHtmlunit() {
            return laccForOrgSeleniumhqSeleniumHtmlunitLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.seleniumhq.selenium.selenium
         */
        public OrgSeleniumhqSeleniumSeleniumLibraryAccessors getSelenium() {
            return laccForOrgSeleniumhqSeleniumSeleniumLibraryAccessors;
        }

    }

    public static class OrgSeleniumhqSeleniumHtmlunitLibraryAccessors extends SubDependencyFactory {

        public OrgSeleniumhqSeleniumHtmlunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for driver (org.seleniumhq.selenium:htmlunit-driver)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDriver() {
                return create("org.seleniumhq.selenium.htmlunit.driver");
        }

    }

    public static class OrgSeleniumhqSeleniumSeleniumLibraryAccessors extends SubDependencyFactory {

        public OrgSeleniumhqSeleniumSeleniumLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for support (org.seleniumhq.selenium:selenium-support)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSupport() {
                return create("org.seleniumhq.selenium.selenium.support");
        }

    }

    public static class OrgSkyscreamerLibraryAccessors extends SubDependencyFactory {

        public OrgSkyscreamerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jsonassert (org.skyscreamer:jsonassert)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJsonassert() {
                return create("org.skyscreamer.jsonassert");
        }

    }

    public static class OrgSlf4jLibraryAccessors extends SubDependencyFactory {
        private final OrgSlf4jJclLibraryAccessors laccForOrgSlf4jJclLibraryAccessors = new OrgSlf4jJclLibraryAccessors(owner);
        private final OrgSlf4jLog4jLibraryAccessors laccForOrgSlf4jLog4jLibraryAccessors = new OrgSlf4jLog4jLibraryAccessors(owner);
        private final OrgSlf4jSlf4jLibraryAccessors laccForOrgSlf4jSlf4jLibraryAccessors = new OrgSlf4jSlf4jLibraryAccessors(owner);

        public OrgSlf4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.slf4j.jcl
         */
        public OrgSlf4jJclLibraryAccessors getJcl() {
            return laccForOrgSlf4jJclLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.slf4j.log4j
         */
        public OrgSlf4jLog4jLibraryAccessors getLog4j() {
            return laccForOrgSlf4jLog4jLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.slf4j.slf4j
         */
        public OrgSlf4jSlf4jLibraryAccessors getSlf4j() {
            return laccForOrgSlf4jSlf4jLibraryAccessors;
        }

    }

    public static class OrgSlf4jJclLibraryAccessors extends SubDependencyFactory {
        private final OrgSlf4jJclOverLibraryAccessors laccForOrgSlf4jJclOverLibraryAccessors = new OrgSlf4jJclOverLibraryAccessors(owner);

        public OrgSlf4jJclLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.slf4j.jcl.over
         */
        public OrgSlf4jJclOverLibraryAccessors getOver() {
            return laccForOrgSlf4jJclOverLibraryAccessors;
        }

    }

    public static class OrgSlf4jJclOverLibraryAccessors extends SubDependencyFactory {

        public OrgSlf4jJclOverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for slf4j (org.slf4j:jcl-over-slf4j)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSlf4j() {
                return create("org.slf4j.jcl.over.slf4j");
        }

    }

    public static class OrgSlf4jLog4jLibraryAccessors extends SubDependencyFactory {
        private final OrgSlf4jLog4jOverLibraryAccessors laccForOrgSlf4jLog4jOverLibraryAccessors = new OrgSlf4jLog4jOverLibraryAccessors(owner);

        public OrgSlf4jLog4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.slf4j.log4j.over
         */
        public OrgSlf4jLog4jOverLibraryAccessors getOver() {
            return laccForOrgSlf4jLog4jOverLibraryAccessors;
        }

    }

    public static class OrgSlf4jLog4jOverLibraryAccessors extends SubDependencyFactory {

        public OrgSlf4jLog4jOverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for slf4j (org.slf4j:log4j-over-slf4j)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSlf4j() {
                return create("org.slf4j.log4j.over.slf4j");
        }

    }

    public static class OrgSlf4jSlf4jLibraryAccessors extends SubDependencyFactory {

        public OrgSlf4jSlf4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (org.slf4j:slf4j-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() {
                return create("org.slf4j.slf4j.api");
        }

    }

    public static class OrgSpringframeworkLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootLibraryAccessors laccForOrgSpringframeworkBootLibraryAccessors = new OrgSpringframeworkBootLibraryAccessors(owner);
        private final OrgSpringframeworkDataLibraryAccessors laccForOrgSpringframeworkDataLibraryAccessors = new OrgSpringframeworkDataLibraryAccessors(owner);
        private final OrgSpringframeworkSecurityLibraryAccessors laccForOrgSpringframeworkSecurityLibraryAccessors = new OrgSpringframeworkSecurityLibraryAccessors(owner);
        private final OrgSpringframeworkSpringLibraryAccessors laccForOrgSpringframeworkSpringLibraryAccessors = new OrgSpringframeworkSpringLibraryAccessors(owner);

        public OrgSpringframeworkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.boot
         */
        public OrgSpringframeworkBootLibraryAccessors getBoot() {
            return laccForOrgSpringframeworkBootLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.springframework.data
         */
        public OrgSpringframeworkDataLibraryAccessors getData() {
            return laccForOrgSpringframeworkDataLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.springframework.security
         */
        public OrgSpringframeworkSecurityLibraryAccessors getSecurity() {
            return laccForOrgSpringframeworkSecurityLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.springframework.spring
         */
        public OrgSpringframeworkSpringLibraryAccessors getSpring() {
            return laccForOrgSpringframeworkSpringLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringLibraryAccessors laccForOrgSpringframeworkBootSpringLibraryAccessors = new OrgSpringframeworkBootSpringLibraryAccessors(owner);

        public OrgSpringframeworkBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.boot.spring
         */
        public OrgSpringframeworkBootSpringLibraryAccessors getSpring() {
            return laccForOrgSpringframeworkBootSpringLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringBootLibraryAccessors laccForOrgSpringframeworkBootSpringBootLibraryAccessors = new OrgSpringframeworkBootSpringBootLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.boot.spring.boot
         */
        public OrgSpringframeworkBootSpringBootLibraryAccessors getBoot() {
            return laccForOrgSpringframeworkBootSpringBootLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringBootLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringBootGradleLibraryAccessors laccForOrgSpringframeworkBootSpringBootGradleLibraryAccessors = new OrgSpringframeworkBootSpringBootGradleLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for dependencies (org.springframework.boot:spring-boot-dependencies)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDependencies() {
                return create("org.springframework.boot.spring.boot.dependencies");
        }

        /**
         * Returns the group of libraries at org.springframework.boot.spring.boot.gradle
         */
        public OrgSpringframeworkBootSpringBootGradleLibraryAccessors getGradle() {
            return laccForOrgSpringframeworkBootSpringBootGradleLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringBootGradleLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkBootSpringBootGradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (org.springframework.boot:spring-boot-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() {
                return create("org.springframework.boot.spring.boot.gradle.plugin");
        }

    }

    public static class OrgSpringframeworkDataLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkDataSpringLibraryAccessors laccForOrgSpringframeworkDataSpringLibraryAccessors = new OrgSpringframeworkDataSpringLibraryAccessors(owner);

        public OrgSpringframeworkDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.data.spring
         */
        public OrgSpringframeworkDataSpringLibraryAccessors getSpring() {
            return laccForOrgSpringframeworkDataSpringLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkDataSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkDataSpringDataLibraryAccessors laccForOrgSpringframeworkDataSpringDataLibraryAccessors = new OrgSpringframeworkDataSpringDataLibraryAccessors(owner);

        public OrgSpringframeworkDataSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.data.spring.data
         */
        public OrgSpringframeworkDataSpringDataLibraryAccessors getData() {
            return laccForOrgSpringframeworkDataSpringDataLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkDataSpringDataLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkDataSpringDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (org.springframework.data:spring-data-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("org.springframework.data.spring.data.bom");
        }

    }

    public static class OrgSpringframeworkSecurityLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkSecuritySpringLibraryAccessors laccForOrgSpringframeworkSecuritySpringLibraryAccessors = new OrgSpringframeworkSecuritySpringLibraryAccessors(owner);

        public OrgSpringframeworkSecurityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.security.spring
         */
        public OrgSpringframeworkSecuritySpringLibraryAccessors getSpring() {
            return laccForOrgSpringframeworkSecuritySpringLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkSecuritySpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkSecuritySpringSecurityLibraryAccessors laccForOrgSpringframeworkSecuritySpringSecurityLibraryAccessors = new OrgSpringframeworkSecuritySpringSecurityLibraryAccessors(owner);

        public OrgSpringframeworkSecuritySpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.security.spring.security
         */
        public OrgSpringframeworkSecuritySpringSecurityLibraryAccessors getSecurity() {
            return laccForOrgSpringframeworkSecuritySpringSecurityLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkSecuritySpringSecurityLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkSecuritySpringSecurityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (org.springframework.security:spring-security-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("org.springframework.security.spring.security.bom");
        }

    }

    public static class OrgSpringframeworkSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkSpringFrameworkLibraryAccessors laccForOrgSpringframeworkSpringFrameworkLibraryAccessors = new OrgSpringframeworkSpringFrameworkLibraryAccessors(owner);

        public OrgSpringframeworkSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.spring.framework
         */
        public OrgSpringframeworkSpringFrameworkLibraryAccessors getFramework() {
            return laccForOrgSpringframeworkSpringFrameworkLibraryAccessors;
        }

    }

    public static class OrgSpringframeworkSpringFrameworkLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkSpringFrameworkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (org.springframework:spring-framework-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("org.springframework.spring.framework.bom");
        }

    }

    public static class OrgTestcontainersLibraryAccessors extends SubDependencyFactory {
        private final OrgTestcontainersTestcontainersLibraryAccessors laccForOrgTestcontainersTestcontainersLibraryAccessors = new OrgTestcontainersTestcontainersLibraryAccessors(owner);

        public OrgTestcontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.testcontainers.testcontainers
         */
        public OrgTestcontainersTestcontainersLibraryAccessors getTestcontainers() {
            return laccForOrgTestcontainersTestcontainersLibraryAccessors;
        }

    }

    public static class OrgTestcontainersTestcontainersLibraryAccessors extends SubDependencyFactory {

        public OrgTestcontainersTestcontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (org.testcontainers:testcontainers-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("org.testcontainers.testcontainers.bom");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final ChVersionAccessors vaccForChVersionAccessors = new ChVersionAccessors(providers, config);
        private final JakartaVersionAccessors vaccForJakartaVersionAccessors = new JakartaVersionAccessors(providers, config);
        private final OrgVersionAccessors vaccForOrgVersionAccessors = new OrgVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.ch
         */
        public ChVersionAccessors getCh() {
            return vaccForChVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.jakarta
         */
        public JakartaVersionAccessors getJakarta() {
            return vaccForJakartaVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org
         */
        public OrgVersionAccessors getOrg() {
            return vaccForOrgVersionAccessors;
        }

    }

    public static class ChVersionAccessors extends VersionFactory  {

        private final ChQosVersionAccessors vaccForChQosVersionAccessors = new ChQosVersionAccessors(providers, config);
        public ChVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.ch.qos
         */
        public ChQosVersionAccessors getQos() {
            return vaccForChQosVersionAccessors;
        }

    }

    public static class ChQosVersionAccessors extends VersionFactory  {

        public ChQosVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: ch.qos.logback (1.4.14)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLogback() { return getVersion("ch.qos.logback"); }

    }

    public static class JakartaVersionAccessors extends VersionFactory  {

        public JakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: jakarta.websocket (2.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getWebsocket() { return getVersion("jakarta.websocket"); }

    }

    public static class OrgVersionAccessors extends VersionFactory  {

        private final OrgApacheVersionAccessors vaccForOrgApacheVersionAccessors = new OrgApacheVersionAccessors(providers, config);
        private final OrgCodehausVersionAccessors vaccForOrgCodehausVersionAccessors = new OrgCodehausVersionAccessors(providers, config);
        private final OrgSeleniumhqVersionAccessors vaccForOrgSeleniumhqVersionAccessors = new OrgSeleniumhqVersionAccessors(providers, config);
        private final OrgSpringframeworkVersionAccessors vaccForOrgSpringframeworkVersionAccessors = new OrgSpringframeworkVersionAccessors(providers, config);
        public OrgVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.gretty (4.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGretty() { return getVersion("org.gretty"); }

            /**
             * Returns the version associated to this alias: org.mockito (5.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMockito() { return getVersion("org.mockito"); }

            /**
             * Returns the version associated to this alias: org.mongodb (4.11.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMongodb() { return getVersion("org.mongodb"); }

            /**
             * Returns the version associated to this alias: org.slf4j (2.0.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSlf4j() { return getVersion("org.slf4j"); }

            /**
             * Returns the version associated to this alias: org.testcontainers (1.18.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTestcontainers() { return getVersion("org.testcontainers"); }

        /**
         * Returns the group of versions at versions.org.apache
         */
        public OrgApacheVersionAccessors getApache() {
            return vaccForOrgApacheVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org.codehaus
         */
        public OrgCodehausVersionAccessors getCodehaus() {
            return vaccForOrgCodehausVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org.seleniumhq
         */
        public OrgSeleniumhqVersionAccessors getSeleniumhq() {
            return vaccForOrgSeleniumhqVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.org.springframework
         */
        public OrgSpringframeworkVersionAccessors getSpringframework() {
            return vaccForOrgSpringframeworkVersionAccessors;
        }

    }

    public static class OrgApacheVersionAccessors extends VersionFactory  {

        public OrgApacheVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.apache.derby (10.16.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDerby() { return getVersion("org.apache.derby"); }

    }

    public static class OrgCodehausVersionAccessors extends VersionFactory  {

        public OrgCodehausVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.codehaus.groovy (3.0.19)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGroovy() { return getVersion("org.codehaus.groovy"); }

    }

    public static class OrgSeleniumhqVersionAccessors extends VersionFactory  {

        public OrgSeleniumhqVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.seleniumhq.selenium (4.8.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSelenium() { return getVersion("org.seleniumhq.selenium"); }

    }

    public static class OrgSpringframeworkVersionAccessors extends VersionFactory  {

        public OrgSpringframeworkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.springframework.boot (3.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getBoot() { return getVersion("org.springframework.boot"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
