package org.chromium.net;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: org.chromium.net.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C28224b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114005a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f114006b;

    public /* synthetic */ C28224b(Object obj, int i13) {
        this.f114005a = i13;
        this.f114006b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m85491a(JSONObject jSONObject) throws JSONException {
        switch (this.f114005a) {
            case 0:
                DnsOptions dnsOptions = (DnsOptions) this.f114006b;
                JSONObject jSONObjectM85492a = C28225c.m85492a("AsyncDNS", jSONObject);
                if (dnsOptions.getUseBuiltInDnsResolver() != null) {
                    jSONObjectM85492a.put("enable", dnsOptions.getUseBuiltInDnsResolver());
                }
                JSONObject jSONObjectM85492a2 = C28225c.m85492a("StaleDNS", jSONObject);
                if (dnsOptions.getEnableStaleDns() != null) {
                    jSONObjectM85492a2.put("enable", dnsOptions.getEnableStaleDns());
                }
                if (dnsOptions.getPersistHostCache() != null) {
                    jSONObjectM85492a2.put("persist_to_disk", dnsOptions.getPersistHostCache());
                }
                if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
                    jSONObjectM85492a2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
                }
                if (dnsOptions.getStaleDnsOptions() != null) {
                    DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
                    if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                        jSONObjectM85492a2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
                    }
                    if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                        jSONObjectM85492a2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
                    }
                    if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                        jSONObjectM85492a2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
                    }
                    if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                        jSONObjectM85492a2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
                    }
                }
                JSONObject jSONObjectM85492a3 = C28225c.m85492a("QUIC", jSONObject);
                if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
                    jSONObjectM85492a3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
                    return;
                }
                return;
            case 1:
                ConnectionMigrationOptions connectionMigrationOptions = (ConnectionMigrationOptions) this.f114006b;
                JSONObject jSONObjectM85492a4 = C28225c.m85492a("QUIC", jSONObject);
                if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
                    jSONObjectM85492a4.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
                }
                if (connectionMigrationOptions.getAllowServerMigration() != null) {
                    jSONObjectM85492a4.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
                }
                if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
                    jSONObjectM85492a4.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
                }
                if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
                    jSONObjectM85492a4.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
                }
                if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
                    jSONObjectM85492a4.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
                }
                if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
                    jSONObjectM85492a4.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
                }
                if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
                    jSONObjectM85492a4.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
                }
                if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
                    jSONObjectM85492a4.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
                }
                if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
                    boolean zBooleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
                    if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                        boolean zBooleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                        if (!zBooleanValue && zBooleanValue2) {
                            throw new IllegalArgumentException("Unable to turn on non-default network usage without path degradation migration!");
                        }
                        if (zBooleanValue && zBooleanValue2) {
                            jSONObjectM85492a4.put("migrate_sessions_early_v2", true);
                            return;
                        }
                        jSONObjectM85492a4.put("migrate_sessions_early_v2", false);
                    }
                    jSONObjectM85492a4.put("allow_port_migration", zBooleanValue);
                    return;
                }
                return;
            default:
                QuicOptions quicOptions = (QuicOptions) this.f114006b;
                JSONObject jSONObjectM85492a5 = C28225c.m85492a("QUIC", jSONObject);
                if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
                    jSONObjectM85492a5.put("host_whitelist", String.join(",", quicOptions.getQuicHostAllowlist()));
                }
                if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
                    jSONObjectM85492a5.put("quic_version", String.join(",", quicOptions.getEnabledQuicVersions()));
                }
                if (!quicOptions.getConnectionOptions().isEmpty()) {
                    jSONObjectM85492a5.put("connection_options", String.join(",", quicOptions.getConnectionOptions()));
                }
                if (!quicOptions.getClientConnectionOptions().isEmpty()) {
                    jSONObjectM85492a5.put("client_connection_options", String.join(",", quicOptions.getClientConnectionOptions()));
                }
                if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
                    jSONObjectM85492a5.put("set_quic_flags", String.join(",", quicOptions.getExtraQuicheFlags()));
                }
                if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
                    jSONObjectM85492a5.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
                }
                if (quicOptions.getHandshakeUserAgent() != null) {
                    jSONObjectM85492a5.put("user_agent_id", quicOptions.getHandshakeUserAgent());
                }
                if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
                    jSONObjectM85492a5.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
                }
                if (quicOptions.getEnableTlsZeroRtt() != null) {
                    jSONObjectM85492a5.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
                }
                if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
                    jSONObjectM85492a5.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
                }
                if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
                    jSONObjectM85492a5.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
                }
                if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
                    jSONObjectM85492a5.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
                }
                if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
                    jSONObjectM85492a5.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
                }
                if (quicOptions.getCloseSessionsOnIpChange() != null) {
                    jSONObjectM85492a5.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
                }
                if (quicOptions.getGoawaySessionsOnIpChange() != null) {
                    jSONObjectM85492a5.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
                }
                if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
                    jSONObjectM85492a5.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
                }
                if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
                    jSONObjectM85492a5.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
                }
                if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
                    jSONObjectM85492a5.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
                    return;
                }
                return;
        }
    }
}
