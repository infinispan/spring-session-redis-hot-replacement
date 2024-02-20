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
public class LibrariesForLibsInPluginsBlock extends AbstractExternalDependencyFactory {

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
    public LibrariesForLibsInPluginsBlock(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Returns the group of libraries at ch
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ChLibraryAccessors getCh() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForChLibraryAccessors;
    }

    /**
     * Returns the group of libraries at com
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ComLibraryAccessors getCom() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForComLibraryAccessors;
    }

    /**
     * Returns the group of libraries at edu
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public EduLibraryAccessors getEdu() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForEduLibraryAccessors;
    }

    /**
     * Returns the group of libraries at io
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public IoLibraryAccessors getIo() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForIoLibraryAccessors;
    }

    /**
     * Returns the group of libraries at jakarta
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public JakartaLibraryAccessors getJakarta() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForJakartaLibraryAccessors;
    }

    /**
     * Returns the group of libraries at mysql
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public MysqlLibraryAccessors getMysql() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForMysqlLibraryAccessors;
    }

    /**
     * Returns the group of libraries at nz
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public NzLibraryAccessors getNz() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForNzLibraryAccessors;
    }

    /**
     * Returns the group of libraries at org
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public OrgLibraryAccessors getOrg() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
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
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public BundleAccessors getBundles() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ChLibraryAccessors extends SubDependencyFactory {
        private final ChQosLibraryAccessors laccForChQosLibraryAccessors = new ChQosLibraryAccessors(owner);

        public ChLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at ch.qos
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ChQosLibraryAccessors getQos() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForChQosLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ChQosLibraryAccessors extends SubDependencyFactory {
        private final ChQosLogbackLibraryAccessors laccForChQosLogbackLibraryAccessors = new ChQosLogbackLibraryAccessors(owner);

        public ChQosLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at ch.qos.logback
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ChQosLogbackLibraryAccessors getLogback() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForChQosLogbackLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ChQosLogbackLibraryAccessors extends SubDependencyFactory {
        private final ChQosLogbackLogbackLibraryAccessors laccForChQosLogbackLogbackLibraryAccessors = new ChQosLogbackLogbackLibraryAccessors(owner);

        public ChQosLogbackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at ch.qos.logback.logback
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ChQosLogbackLogbackLibraryAccessors getLogback() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForChQosLogbackLogbackLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ChQosLogbackLogbackLibraryAccessors extends SubDependencyFactory {

        public ChQosLogbackLogbackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for classic (ch.qos.logback:logback-classic)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getClassic() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("ch.qos.logback.logback.classic");
        }

            /**
             * Creates a dependency provider for core (ch.qos.logback:logback-core)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("ch.qos.logback.logback.core");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getHazelcast() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("com.hazelcast");
        }

        /**
         * Returns the group of libraries at com.fasterxml
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlLibraryAccessors getFasterxml() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.google
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGoogleLibraryAccessors getGoogle() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGoogleLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.h2database
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComH2databaseLibraryAccessors getH2database() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComH2databaseLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.ibm
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComIbmLibraryAccessors getIbm() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComIbmLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.maxmind
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComMaxmindLibraryAccessors getMaxmind() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComMaxmindLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.microsoft
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComMicrosoftLibraryAccessors getMicrosoft() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComMicrosoftLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.oracle
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComOracleLibraryAccessors getOracle() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComOracleLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.squareup
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComSquareupLibraryAccessors getSquareup() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComSquareupLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.zaxxer
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComZaxxerLibraryAccessors getZaxxer() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComZaxxerLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonLibraryAccessors laccForComFasterxmlJacksonLibraryAccessors = new ComFasterxmlJacksonLibraryAccessors(owner);

        public ComFasterxmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.fasterxml.jackson
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonLibraryAccessors getJackson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonCoreLibraryAccessors laccForComFasterxmlJacksonCoreLibraryAccessors = new ComFasterxmlJacksonCoreLibraryAccessors(owner);
        private final ComFasterxmlJacksonJacksonLibraryAccessors laccForComFasterxmlJacksonJacksonLibraryAccessors = new ComFasterxmlJacksonJacksonLibraryAccessors(owner);

        public ComFasterxmlJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.fasterxml.jackson.core
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonCoreLibraryAccessors getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonCoreLibraryAccessors;
        }

        /**
         * Returns the group of libraries at com.fasterxml.jackson.jackson
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonJacksonLibraryAccessors getJackson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonJacksonLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonCoreLibraryAccessors extends SubDependencyFactory {
        private final ComFasterxmlJacksonCoreJacksonLibraryAccessors laccForComFasterxmlJacksonCoreJacksonLibraryAccessors = new ComFasterxmlJacksonCoreJacksonLibraryAccessors(owner);

        public ComFasterxmlJacksonCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.fasterxml.jackson.core.jackson
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComFasterxmlJacksonCoreJacksonLibraryAccessors getJackson() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComFasterxmlJacksonCoreJacksonLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonCoreJacksonLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlJacksonCoreJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for databind (com.fasterxml.jackson.core:jackson-databind)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getDatabind() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("com.fasterxml.jackson.core.jackson.databind");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComFasterxmlJacksonJacksonLibraryAccessors extends SubDependencyFactory {

        public ComFasterxmlJacksonJacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (com.fasterxml.jackson:jackson-bom)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getBom() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("com.fasterxml.jackson.jackson.bom");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGoogleLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleCodeLibraryAccessors laccForComGoogleCodeLibraryAccessors = new ComGoogleCodeLibraryAccessors(owner);

        public ComGoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.code
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGoogleCodeLibraryAccessors getCode() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGoogleCodeLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGoogleCodeLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleCodeFindbugsLibraryAccessors laccForComGoogleCodeFindbugsLibraryAccessors = new ComGoogleCodeFindbugsLibraryAccessors(owner);

        public ComGoogleCodeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.code.findbugs
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComGoogleCodeFindbugsLibraryAccessors getFindbugs() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComGoogleCodeFindbugsLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComGoogleCodeFindbugsLibraryAccessors extends SubDependencyFactory {

        public ComGoogleCodeFindbugsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jsr305 (com.google.code.findbugs:jsr305)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getJsr305() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("com.google.code.findbugs.jsr305");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComH2databaseLibraryAccessors extends SubDependencyFactory {

        public ComH2databaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for h2 (com.h2database:h2)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getH2() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("com.h2database.h2");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComIbmLibraryAccessors extends SubDependencyFactory {
        private final ComIbmDb2LibraryAccessors laccForComIbmDb2LibraryAccessors = new ComIbmDb2LibraryAccessors(owner);

        public ComIbmLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.ibm.db2
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComIbmDb2LibraryAccessors getDb2() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComIbmDb2LibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComIbmDb2LibraryAccessors extends SubDependencyFactory {

        public ComIbmDb2LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jcc (com.ibm.db2:jcc)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getJcc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("com.ibm.db2.jcc");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComMaxmindLibraryAccessors extends SubDependencyFactory {

        public ComMaxmindLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for geoip2 (com.maxmind.geoip2:geoip2)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getGeoip2() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("com.maxmind.geoip2");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComMicrosoftLibraryAccessors extends SubDependencyFactory {
        private final ComMicrosoftSqlserverLibraryAccessors laccForComMicrosoftSqlserverLibraryAccessors = new ComMicrosoftSqlserverLibraryAccessors(owner);

        public ComMicrosoftLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.microsoft.sqlserver
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComMicrosoftSqlserverLibraryAccessors getSqlserver() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComMicrosoftSqlserverLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComMicrosoftSqlserverLibraryAccessors extends SubDependencyFactory {
        private final ComMicrosoftSqlserverMssqlLibraryAccessors laccForComMicrosoftSqlserverMssqlLibraryAccessors = new ComMicrosoftSqlserverMssqlLibraryAccessors(owner);

        public ComMicrosoftSqlserverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.microsoft.sqlserver.mssql
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComMicrosoftSqlserverMssqlLibraryAccessors getMssql() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComMicrosoftSqlserverMssqlLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComMicrosoftSqlserverMssqlLibraryAccessors extends SubDependencyFactory {

        public ComMicrosoftSqlserverMssqlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jdbc (com.microsoft.sqlserver:mssql-jdbc)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getJdbc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("com.microsoft.sqlserver.mssql.jdbc");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComOracleLibraryAccessors extends SubDependencyFactory {
        private final ComOracleDatabaseLibraryAccessors laccForComOracleDatabaseLibraryAccessors = new ComOracleDatabaseLibraryAccessors(owner);

        public ComOracleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.oracle.database
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComOracleDatabaseLibraryAccessors getDatabase() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComOracleDatabaseLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComOracleDatabaseLibraryAccessors extends SubDependencyFactory {
        private final ComOracleDatabaseJdbcLibraryAccessors laccForComOracleDatabaseJdbcLibraryAccessors = new ComOracleDatabaseJdbcLibraryAccessors(owner);

        public ComOracleDatabaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.oracle.database.jdbc
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComOracleDatabaseJdbcLibraryAccessors getJdbc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComOracleDatabaseJdbcLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComOracleDatabaseJdbcLibraryAccessors extends SubDependencyFactory {

        public ComOracleDatabaseJdbcLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ojdbc8 (com.oracle.database.jdbc:ojdbc8)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getOjdbc8() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("com.oracle.database.jdbc.ojdbc8");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComSquareupLibraryAccessors extends SubDependencyFactory {
        private final ComSquareupOkhttp3LibraryAccessors laccForComSquareupOkhttp3LibraryAccessors = new ComSquareupOkhttp3LibraryAccessors(owner);

        public ComSquareupLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.squareup.okhttp3
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComSquareupOkhttp3LibraryAccessors getOkhttp3() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComSquareupOkhttp3LibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComSquareupOkhttp3LibraryAccessors extends SubDependencyFactory {

        public ComSquareupOkhttp3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for okhttp (com.squareup.okhttp3:okhttp)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getOkhttp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("com.squareup.okhttp3.okhttp");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComZaxxerLibraryAccessors extends SubDependencyFactory {

        public ComZaxxerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for HikariCP (com.zaxxer:HikariCP)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getHikariCP() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("com.zaxxer.HikariCP");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class EduLibraryAccessors extends SubDependencyFactory {
        private final EduUmdLibraryAccessors laccForEduUmdLibraryAccessors = new EduUmdLibraryAccessors(owner);

        public EduLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at edu.umd
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public EduUmdLibraryAccessors getUmd() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForEduUmdLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class EduUmdLibraryAccessors extends SubDependencyFactory {
        private final EduUmdCsLibraryAccessors laccForEduUmdCsLibraryAccessors = new EduUmdCsLibraryAccessors(owner);

        public EduUmdLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at edu.umd.cs
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public EduUmdCsLibraryAccessors getCs() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForEduUmdCsLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class EduUmdCsLibraryAccessors extends SubDependencyFactory {
        private final EduUmdCsMtcLibraryAccessors laccForEduUmdCsMtcLibraryAccessors = new EduUmdCsMtcLibraryAccessors(owner);

        public EduUmdCsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at edu.umd.cs.mtc
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public EduUmdCsMtcLibraryAccessors getMtc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForEduUmdCsMtcLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class EduUmdCsMtcLibraryAccessors extends SubDependencyFactory {

        public EduUmdCsMtcLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for multithreadedtc (edu.umd.cs.mtc:multithreadedtc)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getMultithreadedtc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("edu.umd.cs.mtc.multithreadedtc");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoLibraryAccessors extends SubDependencyFactory {
        private final IoLettuceLibraryAccessors laccForIoLettuceLibraryAccessors = new IoLettuceLibraryAccessors(owner);
        private final IoProjectreactorLibraryAccessors laccForIoProjectreactorLibraryAccessors = new IoProjectreactorLibraryAccessors(owner);
        private final IoSpringLibraryAccessors laccForIoSpringLibraryAccessors = new IoSpringLibraryAccessors(owner);

        public IoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.lettuce
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoLettuceLibraryAccessors getLettuce() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoLettuceLibraryAccessors;
        }

        /**
         * Returns the group of libraries at io.projectreactor
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoProjectreactorLibraryAccessors getProjectreactor() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoProjectreactorLibraryAccessors;
        }

        /**
         * Returns the group of libraries at io.spring
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoSpringLibraryAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoSpringLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoLettuceLibraryAccessors extends SubDependencyFactory {
        private final IoLettuceLettuceLibraryAccessors laccForIoLettuceLettuceLibraryAccessors = new IoLettuceLettuceLibraryAccessors(owner);

        public IoLettuceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.lettuce.lettuce
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoLettuceLettuceLibraryAccessors getLettuce() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoLettuceLettuceLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoLettuceLettuceLibraryAccessors extends SubDependencyFactory {

        public IoLettuceLettuceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (io.lettuce:lettuce-core)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("io.lettuce.lettuce.core");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoProjectreactorLibraryAccessors extends SubDependencyFactory {
        private final IoProjectreactorReactorLibraryAccessors laccForIoProjectreactorReactorLibraryAccessors = new IoProjectreactorReactorLibraryAccessors(owner);

        public IoProjectreactorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.projectreactor.reactor
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoProjectreactorReactorLibraryAccessors getReactor() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoProjectreactorReactorLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoProjectreactorReactorLibraryAccessors extends SubDependencyFactory {

        public IoProjectreactorReactorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (io.projectreactor:reactor-bom)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getBom() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("io.projectreactor.reactor.bom");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoSpringLibraryAccessors extends SubDependencyFactory {
        private final IoSpringJavaformatLibraryAccessors laccForIoSpringJavaformatLibraryAccessors = new IoSpringJavaformatLibraryAccessors(owner);
        private final IoSpringNohttpLibraryAccessors laccForIoSpringNohttpLibraryAccessors = new IoSpringNohttpLibraryAccessors(owner);

        public IoSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.spring.javaformat
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoSpringJavaformatLibraryAccessors getJavaformat() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoSpringJavaformatLibraryAccessors;
        }

        /**
         * Returns the group of libraries at io.spring.nohttp
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoSpringNohttpLibraryAccessors getNohttp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoSpringNohttpLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoSpringJavaformatLibraryAccessors extends SubDependencyFactory {
        private final IoSpringJavaformatSpringLibraryAccessors laccForIoSpringJavaformatSpringLibraryAccessors = new IoSpringJavaformatSpringLibraryAccessors(owner);

        public IoSpringJavaformatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.spring.javaformat.spring
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoSpringJavaformatSpringLibraryAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoSpringJavaformatSpringLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoSpringJavaformatSpringLibraryAccessors extends SubDependencyFactory {
        private final IoSpringJavaformatSpringJavaformatLibraryAccessors laccForIoSpringJavaformatSpringJavaformatLibraryAccessors = new IoSpringJavaformatSpringJavaformatLibraryAccessors(owner);

        public IoSpringJavaformatSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.spring.javaformat.spring.javaformat
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoSpringJavaformatSpringJavaformatLibraryAccessors getJavaformat() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoSpringJavaformatSpringJavaformatLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoSpringJavaformatSpringJavaformatLibraryAccessors extends SubDependencyFactory {

        public IoSpringJavaformatSpringJavaformatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for checkstyle (io.spring.javaformat:spring-javaformat-checkstyle)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getCheckstyle() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("io.spring.javaformat.spring.javaformat.checkstyle");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoSpringNohttpLibraryAccessors extends SubDependencyFactory {
        private final IoSpringNohttpNohttpLibraryAccessors laccForIoSpringNohttpNohttpLibraryAccessors = new IoSpringNohttpNohttpLibraryAccessors(owner);

        public IoSpringNohttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.spring.nohttp.nohttp
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoSpringNohttpNohttpLibraryAccessors getNohttp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoSpringNohttpNohttpLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoSpringNohttpNohttpLibraryAccessors extends SubDependencyFactory {

        public IoSpringNohttpNohttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for checkstyle (io.spring.nohttp:nohttp-checkstyle)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getCheckstyle() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("io.spring.nohttp.nohttp.checkstyle");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletLibraryAccessors laccForJakartaServletLibraryAccessors = new JakartaServletLibraryAccessors(owner);
        private final JakartaWebsocketLibraryAccessors laccForJakartaWebsocketLibraryAccessors = new JakartaWebsocketLibraryAccessors(owner);

        public JakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaServletLibraryAccessors getServlet() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaServletLibraryAccessors;
        }

        /**
         * Returns the group of libraries at jakarta.websocket
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaWebsocketLibraryAccessors getWebsocket() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaWebsocketLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaServletLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJakartaLibraryAccessors laccForJakartaServletJakartaLibraryAccessors = new JakartaServletJakartaLibraryAccessors(owner);
        private final JakartaServletJspLibraryAccessors laccForJakartaServletJspLibraryAccessors = new JakartaServletJspLibraryAccessors(owner);

        public JakartaServletLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jakarta
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaServletJakartaLibraryAccessors getJakarta() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaServletJakartaLibraryAccessors;
        }

        /**
         * Returns the group of libraries at jakarta.servlet.jsp
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaServletJspLibraryAccessors getJsp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaServletJspLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaServletJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJakartaServletLibraryAccessors laccForJakartaServletJakartaServletLibraryAccessors = new JakartaServletJakartaServletLibraryAccessors(owner);

        public JakartaServletJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jakarta.servlet
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaServletJakartaServletLibraryAccessors getServlet() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaServletJakartaServletLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaServletJakartaServletLibraryAccessors extends SubDependencyFactory {

        public JakartaServletJakartaServletLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (jakarta.servlet:jakarta.servlet-api)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("jakarta.servlet.jakarta.servlet.api");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaServletJspLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJspJstlLibraryAccessors laccForJakartaServletJspJstlLibraryAccessors = new JakartaServletJspJstlLibraryAccessors(owner);

        public JakartaServletJspLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jsp.jstl
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaServletJspJstlLibraryAccessors getJstl() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaServletJspJstlLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaServletJspJstlLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJspJstlJakartaLibraryAccessors laccForJakartaServletJspJstlJakartaLibraryAccessors = new JakartaServletJspJstlJakartaLibraryAccessors(owner);

        public JakartaServletJspJstlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jsp.jstl.jakarta
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaServletJspJstlJakartaLibraryAccessors getJakarta() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaServletJspJstlJakartaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaServletJspJstlJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJspJstlJakartaServletLibraryAccessors laccForJakartaServletJspJstlJakartaServletLibraryAccessors = new JakartaServletJspJstlJakartaServletLibraryAccessors(owner);

        public JakartaServletJspJstlJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jsp.jstl.jakarta.servlet
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaServletJspJstlJakartaServletLibraryAccessors getServlet() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaServletJspJstlJakartaServletLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaServletJspJstlJakartaServletLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJspJstlJakartaServletJspLibraryAccessors laccForJakartaServletJspJstlJakartaServletJspLibraryAccessors = new JakartaServletJspJstlJakartaServletJspLibraryAccessors(owner);

        public JakartaServletJspJstlJakartaServletLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jsp.jstl.jakarta.servlet.jsp
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaServletJspJstlJakartaServletJspLibraryAccessors getJsp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaServletJspJstlJakartaServletJspLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaServletJspJstlJakartaServletJspLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJspJstlJakartaServletJspJstlLibraryAccessors laccForJakartaServletJspJstlJakartaServletJspJstlLibraryAccessors = new JakartaServletJspJstlJakartaServletJspJstlLibraryAccessors(owner);

        public JakartaServletJspJstlJakartaServletJspLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.servlet.jsp.jstl.jakarta.servlet.jsp.jstl
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaServletJspJstlJakartaServletJspJstlLibraryAccessors getJstl() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaServletJspJstlJakartaServletJspJstlLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaServletJspJstlJakartaServletJspJstlLibraryAccessors extends SubDependencyFactory {

        public JakartaServletJspJstlJakartaServletJspJstlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("jakarta.servlet.jsp.jstl.jakarta.servlet.jsp.jstl.api");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaWebsocketLibraryAccessors extends SubDependencyFactory {
        private final JakartaWebsocketJakartaLibraryAccessors laccForJakartaWebsocketJakartaLibraryAccessors = new JakartaWebsocketJakartaLibraryAccessors(owner);

        public JakartaWebsocketLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.websocket.jakarta
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaWebsocketJakartaLibraryAccessors getJakarta() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaWebsocketJakartaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaWebsocketJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaWebsocketJakartaWebsocketLibraryAccessors laccForJakartaWebsocketJakartaWebsocketLibraryAccessors = new JakartaWebsocketJakartaWebsocketLibraryAccessors(owner);

        public JakartaWebsocketJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at jakarta.websocket.jakarta.websocket
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaWebsocketJakartaWebsocketLibraryAccessors getWebsocket() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaWebsocketJakartaWebsocketLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaWebsocketJakartaWebsocketLibraryAccessors extends SubDependencyFactory {
        private final JakartaWebsocketJakartaWebsocketClientLibraryAccessors laccForJakartaWebsocketJakartaWebsocketClientLibraryAccessors = new JakartaWebsocketJakartaWebsocketClientLibraryAccessors(owner);

        public JakartaWebsocketJakartaWebsocketLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (jakarta.websocket:jakarta.websocket-api)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("jakarta.websocket.jakarta.websocket.api");
        }

        /**
         * Returns the group of libraries at jakarta.websocket.jakarta.websocket.client
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaWebsocketJakartaWebsocketClientLibraryAccessors getClient() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaWebsocketJakartaWebsocketClientLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaWebsocketJakartaWebsocketClientLibraryAccessors extends SubDependencyFactory {

        public JakartaWebsocketJakartaWebsocketClientLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (jakarta.websocket:jakarta.websocket-client-api)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("jakarta.websocket.jakarta.websocket.client.api");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class MysqlLibraryAccessors extends SubDependencyFactory {
        private final MysqlMysqlLibraryAccessors laccForMysqlMysqlLibraryAccessors = new MysqlMysqlLibraryAccessors(owner);

        public MysqlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at mysql.mysql
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public MysqlMysqlLibraryAccessors getMysql() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForMysqlMysqlLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class MysqlMysqlLibraryAccessors extends SubDependencyFactory {
        private final MysqlMysqlConnectorLibraryAccessors laccForMysqlMysqlConnectorLibraryAccessors = new MysqlMysqlConnectorLibraryAccessors(owner);

        public MysqlMysqlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at mysql.mysql.connector
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public MysqlMysqlConnectorLibraryAccessors getConnector() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForMysqlMysqlConnectorLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class MysqlMysqlConnectorLibraryAccessors extends SubDependencyFactory {

        public MysqlMysqlConnectorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for java (mysql:mysql-connector-java)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getJava() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("mysql.mysql.connector.java");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class NzLibraryAccessors extends SubDependencyFactory {
        private final NzNetLibraryAccessors laccForNzNetLibraryAccessors = new NzNetLibraryAccessors(owner);

        public NzLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at nz.net
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public NzNetLibraryAccessors getNet() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForNzNetLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class NzNetLibraryAccessors extends SubDependencyFactory {
        private final NzNetUltraqLibraryAccessors laccForNzNetUltraqLibraryAccessors = new NzNetUltraqLibraryAccessors(owner);

        public NzNetLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at nz.net.ultraq
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public NzNetUltraqLibraryAccessors getUltraq() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForNzNetUltraqLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class NzNetUltraqLibraryAccessors extends SubDependencyFactory {
        private final NzNetUltraqThymeleafLibraryAccessors laccForNzNetUltraqThymeleafLibraryAccessors = new NzNetUltraqThymeleafLibraryAccessors(owner);

        public NzNetUltraqLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at nz.net.ultraq.thymeleaf
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public NzNetUltraqThymeleafLibraryAccessors getThymeleaf() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForNzNetUltraqThymeleafLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class NzNetUltraqThymeleafLibraryAccessors extends SubDependencyFactory {
        private final NzNetUltraqThymeleafThymeleafLibraryAccessors laccForNzNetUltraqThymeleafThymeleafLibraryAccessors = new NzNetUltraqThymeleafThymeleafLibraryAccessors(owner);

        public NzNetUltraqThymeleafLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at nz.net.ultraq.thymeleaf.thymeleaf
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public NzNetUltraqThymeleafThymeleafLibraryAccessors getThymeleaf() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForNzNetUltraqThymeleafThymeleafLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class NzNetUltraqThymeleafThymeleafLibraryAccessors extends SubDependencyFactory {
        private final NzNetUltraqThymeleafThymeleafLayoutLibraryAccessors laccForNzNetUltraqThymeleafThymeleafLayoutLibraryAccessors = new NzNetUltraqThymeleafThymeleafLayoutLibraryAccessors(owner);

        public NzNetUltraqThymeleafThymeleafLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at nz.net.ultraq.thymeleaf.thymeleaf.layout
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public NzNetUltraqThymeleafThymeleafLayoutLibraryAccessors getLayout() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForNzNetUltraqThymeleafThymeleafLayoutLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class NzNetUltraqThymeleafThymeleafLayoutLibraryAccessors extends SubDependencyFactory {

        public NzNetUltraqThymeleafThymeleafLayoutLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for dialect (nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getDialect() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("nz.net.ultraq.thymeleaf.thymeleaf.layout.dialect");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
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
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getHamcrest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.hamcrest");
        }

            /**
             * Creates a dependency provider for hsqldb (org.hsqldb:hsqldb)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getHsqldb() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.hsqldb");
        }

            /**
             * Creates a dependency provider for postgresql (org.postgresql:postgresql)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getPostgresql() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.postgresql");
        }

        /**
         * Returns the group of libraries at org.apache
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheLibraryAccessors getApache() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.aspectj
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgAspectjLibraryAccessors getAspectj() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgAspectjLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.assertj
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgAssertjLibraryAccessors getAssertj() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgAssertjLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.junit
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJunitLibraryAccessors getJunit() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJunitLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.mariadb
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMariadbLibraryAccessors getMariadb() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMariadbLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.mockito
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMockitoLibraryAccessors getMockito() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMockitoLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.mongodb
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMongodbLibraryAccessors getMongodb() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMongodbLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.seleniumhq
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSeleniumhqLibraryAccessors getSeleniumhq() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSeleniumhqLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.skyscreamer
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSkyscreamerLibraryAccessors getSkyscreamer() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSkyscreamerLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.slf4j
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSlf4jLibraryAccessors getSlf4j() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSlf4jLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.springframework
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkLibraryAccessors getSpringframework() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.testcontainers
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgTestcontainersLibraryAccessors getTestcontainers() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgTestcontainersLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheDerbyLibraryAccessors laccForOrgApacheDerbyLibraryAccessors = new OrgApacheDerbyLibraryAccessors(owner);
        private final OrgApacheHttpcomponentsLibraryAccessors laccForOrgApacheHttpcomponentsLibraryAccessors = new OrgApacheHttpcomponentsLibraryAccessors(owner);
        private final OrgApacheLoggingLibraryAccessors laccForOrgApacheLoggingLibraryAccessors = new OrgApacheLoggingLibraryAccessors(owner);

        public OrgApacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.apache.derby
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheDerbyLibraryAccessors getDerby() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheDerbyLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.apache.httpcomponents
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheHttpcomponentsLibraryAccessors getHttpcomponents() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheHttpcomponentsLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.apache.logging
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheLoggingLibraryAccessors getLogging() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheLoggingLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheDerbyLibraryAccessors extends SubDependencyFactory {

        public OrgApacheDerbyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for derby (org.apache.derby:derby)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getDerby() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.apache.derby.derby");
        }

            /**
             * Creates a dependency provider for derbytools (org.apache.derby:derbytools)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getDerbytools() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.apache.derby.derbytools");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheHttpcomponentsLibraryAccessors extends SubDependencyFactory {

        public OrgApacheHttpcomponentsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for httpclient (org.apache.httpcomponents:httpclient)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getHttpclient() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.apache.httpcomponents.httpclient");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheLoggingLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheLoggingLog4jLibraryAccessors laccForOrgApacheLoggingLog4jLibraryAccessors = new OrgApacheLoggingLog4jLibraryAccessors(owner);

        public OrgApacheLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.apache.logging.log4j
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheLoggingLog4jLibraryAccessors getLog4j() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheLoggingLog4jLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheLoggingLog4jLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheLoggingLog4jLog4jLibraryAccessors laccForOrgApacheLoggingLog4jLog4jLibraryAccessors = new OrgApacheLoggingLog4jLog4jLibraryAccessors(owner);

        public OrgApacheLoggingLog4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.apache.logging.log4j.log4j
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgApacheLoggingLog4jLog4jLibraryAccessors getLog4j() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgApacheLoggingLog4jLog4jLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgApacheLoggingLog4jLog4jLibraryAccessors extends SubDependencyFactory {

        public OrgApacheLoggingLog4jLog4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.apache.logging.log4j:log4j-core)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.apache.logging.log4j.log4j.core");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgAspectjLibraryAccessors extends SubDependencyFactory {

        public OrgAspectjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for aspectjweaver (org.aspectj:aspectjweaver)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getAspectjweaver() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.aspectj.aspectjweaver");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgAssertjLibraryAccessors extends SubDependencyFactory {
        private final OrgAssertjAssertjLibraryAccessors laccForOrgAssertjAssertjLibraryAccessors = new OrgAssertjAssertjLibraryAccessors(owner);

        public OrgAssertjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.assertj.assertj
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgAssertjAssertjLibraryAccessors getAssertj() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgAssertjAssertjLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgAssertjAssertjLibraryAccessors extends SubDependencyFactory {

        public OrgAssertjAssertjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.assertj:assertj-core)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.assertj.assertj.core");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJunitLibraryAccessors extends SubDependencyFactory {
        private final OrgJunitJunitLibraryAccessors laccForOrgJunitJunitLibraryAccessors = new OrgJunitJunitLibraryAccessors(owner);

        public OrgJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.junit.junit
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgJunitJunitLibraryAccessors getJunit() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgJunitJunitLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgJunitJunitLibraryAccessors extends SubDependencyFactory {

        public OrgJunitJunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (org.junit:junit-bom)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getBom() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.junit.junit.bom");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMariadbLibraryAccessors extends SubDependencyFactory {
        private final OrgMariadbJdbcLibraryAccessors laccForOrgMariadbJdbcLibraryAccessors = new OrgMariadbJdbcLibraryAccessors(owner);

        public OrgMariadbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mariadb.jdbc
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMariadbJdbcLibraryAccessors getJdbc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMariadbJdbcLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMariadbJdbcLibraryAccessors extends SubDependencyFactory {
        private final OrgMariadbJdbcMariadbLibraryAccessors laccForOrgMariadbJdbcMariadbLibraryAccessors = new OrgMariadbJdbcMariadbLibraryAccessors(owner);

        public OrgMariadbJdbcLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mariadb.jdbc.mariadb
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMariadbJdbcMariadbLibraryAccessors getMariadb() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMariadbJdbcMariadbLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMariadbJdbcMariadbLibraryAccessors extends SubDependencyFactory {
        private final OrgMariadbJdbcMariadbJavaLibraryAccessors laccForOrgMariadbJdbcMariadbJavaLibraryAccessors = new OrgMariadbJdbcMariadbJavaLibraryAccessors(owner);

        public OrgMariadbJdbcMariadbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mariadb.jdbc.mariadb.java
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMariadbJdbcMariadbJavaLibraryAccessors getJava() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMariadbJdbcMariadbJavaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMariadbJdbcMariadbJavaLibraryAccessors extends SubDependencyFactory {

        public OrgMariadbJdbcMariadbJavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for client (org.mariadb.jdbc:mariadb-java-client)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getClient() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.mariadb.jdbc.mariadb.java.client");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMockitoLibraryAccessors extends SubDependencyFactory {
        private final OrgMockitoMockitoLibraryAccessors laccForOrgMockitoMockitoLibraryAccessors = new OrgMockitoMockitoLibraryAccessors(owner);

        public OrgMockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mockito.mockito
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMockitoMockitoLibraryAccessors getMockito() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMockitoMockitoLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMockitoMockitoLibraryAccessors extends SubDependencyFactory {

        public OrgMockitoMockitoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (org.mockito:mockito-bom)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getBom() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.mockito.mockito.bom");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMongodbLibraryAccessors extends SubDependencyFactory {
        private final OrgMongodbMongodbLibraryAccessors laccForOrgMongodbMongodbLibraryAccessors = new OrgMongodbMongodbLibraryAccessors(owner);

        public OrgMongodbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mongodb.mongodb
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMongodbMongodbLibraryAccessors getMongodb() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMongodbMongodbLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMongodbMongodbLibraryAccessors extends SubDependencyFactory {
        private final OrgMongodbMongodbDriverLibraryAccessors laccForOrgMongodbMongodbDriverLibraryAccessors = new OrgMongodbMongodbDriverLibraryAccessors(owner);

        public OrgMongodbMongodbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.mongodb.mongodb.driver
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgMongodbMongodbDriverLibraryAccessors getDriver() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgMongodbMongodbDriverLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgMongodbMongodbDriverLibraryAccessors extends SubDependencyFactory {

        public OrgMongodbMongodbDriverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.mongodb:mongodb-driver-core)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.mongodb.mongodb.driver.core");
        }

            /**
             * Creates a dependency provider for reactivestreams (org.mongodb:mongodb-driver-reactivestreams)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getReactivestreams() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.mongodb.mongodb.driver.reactivestreams");
        }

            /**
             * Creates a dependency provider for sync (org.mongodb:mongodb-driver-sync)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getSync() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.mongodb.mongodb.driver.sync");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSeleniumhqLibraryAccessors extends SubDependencyFactory {
        private final OrgSeleniumhqSeleniumLibraryAccessors laccForOrgSeleniumhqSeleniumLibraryAccessors = new OrgSeleniumhqSeleniumLibraryAccessors(owner);

        public OrgSeleniumhqLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.seleniumhq.selenium
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSeleniumhqSeleniumLibraryAccessors getSelenium() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSeleniumhqSeleniumLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSeleniumhqSeleniumLibraryAccessors extends SubDependencyFactory {
        private final OrgSeleniumhqSeleniumHtmlunitLibraryAccessors laccForOrgSeleniumhqSeleniumHtmlunitLibraryAccessors = new OrgSeleniumhqSeleniumHtmlunitLibraryAccessors(owner);
        private final OrgSeleniumhqSeleniumSeleniumLibraryAccessors laccForOrgSeleniumhqSeleniumSeleniumLibraryAccessors = new OrgSeleniumhqSeleniumSeleniumLibraryAccessors(owner);

        public OrgSeleniumhqSeleniumLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.seleniumhq.selenium.htmlunit
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSeleniumhqSeleniumHtmlunitLibraryAccessors getHtmlunit() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSeleniumhqSeleniumHtmlunitLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.seleniumhq.selenium.selenium
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSeleniumhqSeleniumSeleniumLibraryAccessors getSelenium() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSeleniumhqSeleniumSeleniumLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSeleniumhqSeleniumHtmlunitLibraryAccessors extends SubDependencyFactory {

        public OrgSeleniumhqSeleniumHtmlunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for driver (org.seleniumhq.selenium:htmlunit-driver)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getDriver() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.seleniumhq.selenium.htmlunit.driver");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSeleniumhqSeleniumSeleniumLibraryAccessors extends SubDependencyFactory {

        public OrgSeleniumhqSeleniumSeleniumLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for support (org.seleniumhq.selenium:selenium-support)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getSupport() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.seleniumhq.selenium.selenium.support");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSkyscreamerLibraryAccessors extends SubDependencyFactory {

        public OrgSkyscreamerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jsonassert (org.skyscreamer:jsonassert)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getJsonassert() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.skyscreamer.jsonassert");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSlf4jLibraryAccessors extends SubDependencyFactory {
        private final OrgSlf4jJclLibraryAccessors laccForOrgSlf4jJclLibraryAccessors = new OrgSlf4jJclLibraryAccessors(owner);
        private final OrgSlf4jLog4jLibraryAccessors laccForOrgSlf4jLog4jLibraryAccessors = new OrgSlf4jLog4jLibraryAccessors(owner);
        private final OrgSlf4jSlf4jLibraryAccessors laccForOrgSlf4jSlf4jLibraryAccessors = new OrgSlf4jSlf4jLibraryAccessors(owner);

        public OrgSlf4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.slf4j.jcl
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSlf4jJclLibraryAccessors getJcl() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSlf4jJclLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.slf4j.log4j
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSlf4jLog4jLibraryAccessors getLog4j() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSlf4jLog4jLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.slf4j.slf4j
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSlf4jSlf4jLibraryAccessors getSlf4j() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSlf4jSlf4jLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSlf4jJclLibraryAccessors extends SubDependencyFactory {
        private final OrgSlf4jJclOverLibraryAccessors laccForOrgSlf4jJclOverLibraryAccessors = new OrgSlf4jJclOverLibraryAccessors(owner);

        public OrgSlf4jJclLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.slf4j.jcl.over
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSlf4jJclOverLibraryAccessors getOver() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSlf4jJclOverLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSlf4jJclOverLibraryAccessors extends SubDependencyFactory {

        public OrgSlf4jJclOverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for slf4j (org.slf4j:jcl-over-slf4j)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getSlf4j() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.slf4j.jcl.over.slf4j");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSlf4jLog4jLibraryAccessors extends SubDependencyFactory {
        private final OrgSlf4jLog4jOverLibraryAccessors laccForOrgSlf4jLog4jOverLibraryAccessors = new OrgSlf4jLog4jOverLibraryAccessors(owner);

        public OrgSlf4jLog4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.slf4j.log4j.over
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSlf4jLog4jOverLibraryAccessors getOver() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSlf4jLog4jOverLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSlf4jLog4jOverLibraryAccessors extends SubDependencyFactory {

        public OrgSlf4jLog4jOverLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for slf4j (org.slf4j:log4j-over-slf4j)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getSlf4j() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.slf4j.log4j.over.slf4j");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSlf4jSlf4jLibraryAccessors extends SubDependencyFactory {

        public OrgSlf4jSlf4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (org.slf4j:slf4j-api)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.slf4j.slf4j.api");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootLibraryAccessors laccForOrgSpringframeworkBootLibraryAccessors = new OrgSpringframeworkBootLibraryAccessors(owner);
        private final OrgSpringframeworkDataLibraryAccessors laccForOrgSpringframeworkDataLibraryAccessors = new OrgSpringframeworkDataLibraryAccessors(owner);
        private final OrgSpringframeworkSecurityLibraryAccessors laccForOrgSpringframeworkSecurityLibraryAccessors = new OrgSpringframeworkSecurityLibraryAccessors(owner);
        private final OrgSpringframeworkSpringLibraryAccessors laccForOrgSpringframeworkSpringLibraryAccessors = new OrgSpringframeworkSpringLibraryAccessors(owner);

        public OrgSpringframeworkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.boot
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkBootLibraryAccessors getBoot() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkBootLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.springframework.data
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkDataLibraryAccessors getData() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkDataLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.springframework.security
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkSecurityLibraryAccessors getSecurity() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkSecurityLibraryAccessors;
        }

        /**
         * Returns the group of libraries at org.springframework.spring
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkSpringLibraryAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkSpringLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkBootLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringLibraryAccessors laccForOrgSpringframeworkBootSpringLibraryAccessors = new OrgSpringframeworkBootSpringLibraryAccessors(owner);

        public OrgSpringframeworkBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.boot.spring
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkBootSpringLibraryAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkBootSpringLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkBootSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringBootLibraryAccessors laccForOrgSpringframeworkBootSpringBootLibraryAccessors = new OrgSpringframeworkBootSpringBootLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.boot.spring.boot
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkBootSpringBootLibraryAccessors getBoot() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkBootSpringBootLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkBootSpringBootLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringBootGradleLibraryAccessors laccForOrgSpringframeworkBootSpringBootGradleLibraryAccessors = new OrgSpringframeworkBootSpringBootGradleLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for dependencies (org.springframework.boot:spring-boot-dependencies)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getDependencies() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.springframework.boot.spring.boot.dependencies");
        }

        /**
         * Returns the group of libraries at org.springframework.boot.spring.boot.gradle
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkBootSpringBootGradleLibraryAccessors getGradle() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkBootSpringBootGradleLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkBootSpringBootGradleLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkBootSpringBootGradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (org.springframework.boot:spring-boot-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getPlugin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.springframework.boot.spring.boot.gradle.plugin");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkDataLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkDataSpringLibraryAccessors laccForOrgSpringframeworkDataSpringLibraryAccessors = new OrgSpringframeworkDataSpringLibraryAccessors(owner);

        public OrgSpringframeworkDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.data.spring
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkDataSpringLibraryAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkDataSpringLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkDataSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkDataSpringDataLibraryAccessors laccForOrgSpringframeworkDataSpringDataLibraryAccessors = new OrgSpringframeworkDataSpringDataLibraryAccessors(owner);

        public OrgSpringframeworkDataSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.data.spring.data
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkDataSpringDataLibraryAccessors getData() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkDataSpringDataLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkDataSpringDataLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkDataSpringDataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (org.springframework.data:spring-data-bom)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getBom() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.springframework.data.spring.data.bom");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkSecurityLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkSecuritySpringLibraryAccessors laccForOrgSpringframeworkSecuritySpringLibraryAccessors = new OrgSpringframeworkSecuritySpringLibraryAccessors(owner);

        public OrgSpringframeworkSecurityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.security.spring
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkSecuritySpringLibraryAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkSecuritySpringLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkSecuritySpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkSecuritySpringSecurityLibraryAccessors laccForOrgSpringframeworkSecuritySpringSecurityLibraryAccessors = new OrgSpringframeworkSecuritySpringSecurityLibraryAccessors(owner);

        public OrgSpringframeworkSecuritySpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.security.spring.security
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkSecuritySpringSecurityLibraryAccessors getSecurity() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkSecuritySpringSecurityLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkSecuritySpringSecurityLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkSecuritySpringSecurityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (org.springframework.security:spring-security-bom)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getBom() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.springframework.security.spring.security.bom");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkSpringFrameworkLibraryAccessors laccForOrgSpringframeworkSpringFrameworkLibraryAccessors = new OrgSpringframeworkSpringFrameworkLibraryAccessors(owner);

        public OrgSpringframeworkSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.springframework.spring.framework
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkSpringFrameworkLibraryAccessors getFramework() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkSpringFrameworkLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkSpringFrameworkLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkSpringFrameworkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (org.springframework:spring-framework-bom)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getBom() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("org.springframework.spring.framework.bom");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgTestcontainersLibraryAccessors extends SubDependencyFactory {
        private final OrgTestcontainersTestcontainersLibraryAccessors laccForOrgTestcontainersTestcontainersLibraryAccessors = new OrgTestcontainersTestcontainersLibraryAccessors(owner);

        public OrgTestcontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.testcontainers.testcontainers
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgTestcontainersTestcontainersLibraryAccessors getTestcontainers() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgTestcontainersTestcontainersLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgTestcontainersTestcontainersLibraryAccessors extends SubDependencyFactory {

        public OrgTestcontainersTestcontainersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for bom (org.testcontainers:testcontainers-bom)
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getBom() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
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

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
