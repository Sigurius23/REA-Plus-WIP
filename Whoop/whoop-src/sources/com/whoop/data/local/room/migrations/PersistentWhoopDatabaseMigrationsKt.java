package com.whoop.data.local.room.migrations;

import hc3.AbstractC17176i;
import p325mb.AbstractC25380b;
import p518ub.InterfaceC34728a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0003\b\u008a\u0001\n\u0002\u0010\u0011\n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u0017\u0010\r\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0004\"\u0017\u0010\u000f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0011\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0004\"\u0017\u0010\u0013\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0004\"\u0017\u0010\u0015\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u0017\u0010\u0017\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0004\"\u0017\u0010\u0019\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0004\"\u0017\u0010\u001b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0004\"\u0017\u0010\u001d\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u0004\"\u0017\u0010\u001f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0004\"\u0017\u0010!\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u0004\"\u0017\u0010#\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010\u0004\"\u0017\u0010%\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0004\"\u0017\u0010'\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0004\"\u0017\u0010)\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b)\u0010\u0002\u001a\u0004\b*\u0010\u0004\"\u0017\u0010+\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0004\"\u0017\u0010-\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010\u0004\"\u0017\u0010/\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b/\u0010\u0002\u001a\u0004\b0\u0010\u0004\"\u0017\u00101\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b1\u0010\u0002\u001a\u0004\b2\u0010\u0004\"\u0017\u00103\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0004\"\u0017\u00105\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b5\u0010\u0002\u001a\u0004\b6\u0010\u0004\"\u0017\u00107\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b7\u0010\u0002\u001a\u0004\b8\u0010\u0004\"\u0017\u00109\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b9\u0010\u0002\u001a\u0004\b:\u0010\u0004\"\u0017\u0010;\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b;\u0010\u0002\u001a\u0004\b<\u0010\u0004\"\u0017\u0010=\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b=\u0010\u0002\u001a\u0004\b>\u0010\u0004\"\u0017\u0010?\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0004\"\u0017\u0010A\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bA\u0010\u0002\u001a\u0004\bB\u0010\u0004\"\u0017\u0010C\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bC\u0010\u0002\u001a\u0004\bD\u0010\u0004\"\u0017\u0010E\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bE\u0010\u0002\u001a\u0004\bF\u0010\u0004\"\u0017\u0010G\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bG\u0010\u0002\u001a\u0004\bH\u0010\u0004\"\u0017\u0010I\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bI\u0010\u0002\u001a\u0004\bJ\u0010\u0004\"\u0017\u0010K\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\u0004\"\u0017\u0010M\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bM\u0010\u0002\u001a\u0004\bN\u0010\u0004\"\u0017\u0010O\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bO\u0010\u0002\u001a\u0004\bP\u0010\u0004\"\u0017\u0010Q\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bQ\u0010\u0002\u001a\u0004\bR\u0010\u0004\"\u0017\u0010S\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bS\u0010\u0002\u001a\u0004\bT\u0010\u0004\"\u0017\u0010U\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bU\u0010\u0002\u001a\u0004\bV\u0010\u0004\"\u0017\u0010W\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bW\u0010\u0002\u001a\u0004\bX\u0010\u0004\"\u0017\u0010Y\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bY\u0010\u0002\u001a\u0004\bZ\u0010\u0004\"\u0017\u0010[\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b[\u0010\u0002\u001a\u0004\b\\\u0010\u0004\"\u0017\u0010]\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b]\u0010\u0002\u001a\u0004\b^\u0010\u0004\"\u0017\u0010_\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b_\u0010\u0002\u001a\u0004\b`\u0010\u0004\"\u0017\u0010a\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\ba\u0010\u0002\u001a\u0004\bb\u0010\u0004\"\u0017\u0010c\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bc\u0010\u0002\u001a\u0004\bd\u0010\u0004\"\u0017\u0010e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\be\u0010\u0002\u001a\u0004\bf\u0010\u0004\"\u0017\u0010g\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bg\u0010\u0002\u001a\u0004\bh\u0010\u0004\"\u0017\u0010i\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bi\u0010\u0002\u001a\u0004\bj\u0010\u0004\"\u0017\u0010k\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bk\u0010\u0002\u001a\u0004\bl\u0010\u0004\"\u0017\u0010m\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bm\u0010\u0002\u001a\u0004\bn\u0010\u0004\"\u0017\u0010o\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bo\u0010\u0002\u001a\u0004\bp\u0010\u0004\"\u0017\u0010q\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bq\u0010\u0002\u001a\u0004\br\u0010\u0004\"\u0017\u0010s\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bs\u0010\u0002\u001a\u0004\bt\u0010\u0004\"\u0017\u0010u\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bu\u0010\u0002\u001a\u0004\bv\u0010\u0004\"\u0017\u0010w\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bw\u0010\u0002\u001a\u0004\bx\u0010\u0004\"\u0017\u0010y\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\by\u0010\u0002\u001a\u0004\bz\u0010\u0004\"\u0017\u0010{\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b{\u0010\u0002\u001a\u0004\b|\u0010\u0004\"\u0017\u0010}\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b}\u0010\u0002\u001a\u0004\b~\u0010\u0004\"\u0018\u0010\u007f\u001a\u00020\u00008\u0006¢\u0006\r\n\u0004\b\u007f\u0010\u0002\u001a\u0005\b\u0080\u0001\u0010\u0004\"\u001a\u0010\u0081\u0001\u001a\u00020\u00008\u0006¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0002\u001a\u0005\b\u0082\u0001\u0010\u0004\"\u001a\u0010\u0083\u0001\u001a\u00020\u00008\u0006¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0002\u001a\u0005\b\u0084\u0001\u0010\u0004\"\u001a\u0010\u0085\u0001\u001a\u00020\u00008\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0002\u001a\u0005\b\u0086\u0001\u0010\u0004\"\u001a\u0010\u0087\u0001\u001a\u00020\u00008\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0002\u001a\u0005\b\u0088\u0001\u0010\u0004\"\u001a\u0010\u0089\u0001\u001a\u00020\u00008\u0006¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0002\u001a\u0005\b\u008a\u0001\u0010\u0004\"#\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u008b\u00018\u0006¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0090\u0001"}, m65681d2 = {"Lmb/b;", "DB_MIGRATION_1_2", "Lmb/b;", "getDB_MIGRATION_1_2", "()Lmb/b;", "DB_MIGRATION_2_3", "getDB_MIGRATION_2_3", "DB_MIGRATION_3_4", "getDB_MIGRATION_3_4", "DB_MIGRATION_4_5", "getDB_MIGRATION_4_5", "DB_MIGRATION_5_6", "getDB_MIGRATION_5_6", "DB_MIGRATION_6_7", "getDB_MIGRATION_6_7", "DB_MIGRATION_7_8", "getDB_MIGRATION_7_8", "DB_MIGRATION_8_9", "getDB_MIGRATION_8_9", "DB_MIGRATION_9_10", "getDB_MIGRATION_9_10", "DB_MIGRATION_10_11", "getDB_MIGRATION_10_11", "DB_MIGRATION_11_12", "getDB_MIGRATION_11_12", "DB_MIGRATION_12_13", "getDB_MIGRATION_12_13", "DB_MIGRATION_13_14", "getDB_MIGRATION_13_14", "DB_MIGRATION_14_15", "getDB_MIGRATION_14_15", "DB_MIGRATION_15_16", "getDB_MIGRATION_15_16", "DB_MIGRATION_16_17", "getDB_MIGRATION_16_17", "DB_MIGRATION_17_18", "getDB_MIGRATION_17_18", "DB_MIGRATION_18_19", "getDB_MIGRATION_18_19", "DB_MIGRATION_19_20", "getDB_MIGRATION_19_20", "DB_MIGRATION_20_21", "getDB_MIGRATION_20_21", "DB_MIGRATION_21_22", "getDB_MIGRATION_21_22", "DB_MIGRATION_22_23", "getDB_MIGRATION_22_23", "DB_MIGRATION_23_24", "getDB_MIGRATION_23_24", "DB_MIGRATION_24_25", "getDB_MIGRATION_24_25", "DB_MIGRATION_25_26", "getDB_MIGRATION_25_26", "DB_MIGRATION_26_27", "getDB_MIGRATION_26_27", "DB_MIGRATION_27_28", "getDB_MIGRATION_27_28", "DB_MIGRATION_28_29", "getDB_MIGRATION_28_29", "DB_MIGRATION_29_30", "getDB_MIGRATION_29_30", "DB_MIGRATION_30_31", "getDB_MIGRATION_30_31", "DB_MIGRATION_31_32", "getDB_MIGRATION_31_32", "DB_MIGRATION_32_33", "getDB_MIGRATION_32_33", "DB_MIGRATION_33_34", "getDB_MIGRATION_33_34", "DB_MIGRATION_34_35", "getDB_MIGRATION_34_35", "DB_MIGRATION_35_36", "getDB_MIGRATION_35_36", "DB_MIGRATION_36_37", "getDB_MIGRATION_36_37", "DB_MIGRATION_37_38", "getDB_MIGRATION_37_38", "DB_MIGRATION_38_39", "getDB_MIGRATION_38_39", "DB_MIGRATION_39_40", "getDB_MIGRATION_39_40", "DB_MIGRATION_40_41", "getDB_MIGRATION_40_41", "DB_MIGRATION_41_42", "getDB_MIGRATION_41_42", "DB_MIGRATION_42_43", "getDB_MIGRATION_42_43", "DB_MIGRATION_43_44", "getDB_MIGRATION_43_44", "DB_MIGRATION_44_45", "getDB_MIGRATION_44_45", "DB_MIGRATION_45_46", "getDB_MIGRATION_45_46", "DB_MIGRATION_46_47", "getDB_MIGRATION_46_47", "DB_MIGRATION_47_48", "getDB_MIGRATION_47_48", "DB_MIGRATION_48_49", "getDB_MIGRATION_48_49", "DB_MIGRATION_49_50", "getDB_MIGRATION_49_50", "DB_MIGRATION_50_51", "getDB_MIGRATION_50_51", "DB_MIGRATION_51_52", "getDB_MIGRATION_51_52", "DB_MIGRATION_52_53", "getDB_MIGRATION_52_53", "DB_MIGRATION_53_54", "getDB_MIGRATION_53_54", "DB_MIGRATION_54_55", "getDB_MIGRATION_54_55", "DB_MIGRATION_55_56", "getDB_MIGRATION_55_56", "DB_MIGRATION_56_57", "getDB_MIGRATION_56_57", "DB_MIGRATION_57_58", "getDB_MIGRATION_57_58", "DB_MIGRATION_58_59", "getDB_MIGRATION_58_59", "DB_MIGRATION_59_60", "getDB_MIGRATION_59_60", "DB_MIGRATION_60_61", "getDB_MIGRATION_60_61", "DB_MIGRATION_61_62", "getDB_MIGRATION_61_62", "DB_MIGRATION_62_63", "getDB_MIGRATION_62_63", "DB_MIGRATION_63_64", "getDB_MIGRATION_63_64", "DB_MIGRATION_64_65", "getDB_MIGRATION_64_65", "DB_MIGRATION_65_66", "getDB_MIGRATION_65_66", "DB_MIGRATION_66_67", "getDB_MIGRATION_66_67", "DB_MIGRATION_67_68", "getDB_MIGRATION_67_68", "DB_MIGRATION_68_69", "getDB_MIGRATION_68_69", "", "ALL_MIGRATIONS", "[Lmb/b;", "getALL_MIGRATIONS", "()[Lmb/b;", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PersistentWhoopDatabaseMigrationsKt {
    private static final AbstractC25380b[] ALL_MIGRATIONS;
    private static final AbstractC25380b DB_MIGRATION_10_11;
    private static final AbstractC25380b DB_MIGRATION_11_12;
    private static final AbstractC25380b DB_MIGRATION_12_13;
    private static final AbstractC25380b DB_MIGRATION_13_14;
    private static final AbstractC25380b DB_MIGRATION_14_15;
    private static final AbstractC25380b DB_MIGRATION_15_16;
    private static final AbstractC25380b DB_MIGRATION_16_17;
    private static final AbstractC25380b DB_MIGRATION_17_18;
    private static final AbstractC25380b DB_MIGRATION_18_19;
    private static final AbstractC25380b DB_MIGRATION_19_20;
    private static final AbstractC25380b DB_MIGRATION_1_2;
    private static final AbstractC25380b DB_MIGRATION_20_21;
    private static final AbstractC25380b DB_MIGRATION_21_22;
    private static final AbstractC25380b DB_MIGRATION_22_23;
    private static final AbstractC25380b DB_MIGRATION_23_24;
    private static final AbstractC25380b DB_MIGRATION_24_25;
    private static final AbstractC25380b DB_MIGRATION_25_26;
    private static final AbstractC25380b DB_MIGRATION_26_27;
    private static final AbstractC25380b DB_MIGRATION_27_28;
    private static final AbstractC25380b DB_MIGRATION_28_29;
    private static final AbstractC25380b DB_MIGRATION_29_30;
    private static final AbstractC25380b DB_MIGRATION_2_3;
    private static final AbstractC25380b DB_MIGRATION_30_31;
    private static final AbstractC25380b DB_MIGRATION_31_32;
    private static final AbstractC25380b DB_MIGRATION_32_33;
    private static final AbstractC25380b DB_MIGRATION_33_34;
    private static final AbstractC25380b DB_MIGRATION_34_35;
    private static final AbstractC25380b DB_MIGRATION_35_36;
    private static final AbstractC25380b DB_MIGRATION_36_37;
    private static final AbstractC25380b DB_MIGRATION_37_38;
    private static final AbstractC25380b DB_MIGRATION_38_39;
    private static final AbstractC25380b DB_MIGRATION_39_40;
    private static final AbstractC25380b DB_MIGRATION_3_4;
    private static final AbstractC25380b DB_MIGRATION_40_41;
    private static final AbstractC25380b DB_MIGRATION_41_42;
    private static final AbstractC25380b DB_MIGRATION_42_43;
    private static final AbstractC25380b DB_MIGRATION_43_44;
    private static final AbstractC25380b DB_MIGRATION_44_45;
    private static final AbstractC25380b DB_MIGRATION_45_46;
    private static final AbstractC25380b DB_MIGRATION_46_47;
    private static final AbstractC25380b DB_MIGRATION_47_48;
    private static final AbstractC25380b DB_MIGRATION_48_49;
    private static final AbstractC25380b DB_MIGRATION_49_50;
    private static final AbstractC25380b DB_MIGRATION_4_5;
    private static final AbstractC25380b DB_MIGRATION_50_51;
    private static final AbstractC25380b DB_MIGRATION_51_52;
    private static final AbstractC25380b DB_MIGRATION_52_53;
    private static final AbstractC25380b DB_MIGRATION_53_54;
    private static final AbstractC25380b DB_MIGRATION_54_55;
    private static final AbstractC25380b DB_MIGRATION_55_56;
    private static final AbstractC25380b DB_MIGRATION_56_57;
    private static final AbstractC25380b DB_MIGRATION_57_58;
    private static final AbstractC25380b DB_MIGRATION_58_59;
    private static final AbstractC25380b DB_MIGRATION_59_60;
    private static final AbstractC25380b DB_MIGRATION_5_6;
    private static final AbstractC25380b DB_MIGRATION_60_61;
    private static final AbstractC25380b DB_MIGRATION_61_62;
    private static final AbstractC25380b DB_MIGRATION_62_63;
    private static final AbstractC25380b DB_MIGRATION_63_64;
    private static final AbstractC25380b DB_MIGRATION_64_65;
    private static final AbstractC25380b DB_MIGRATION_65_66;
    private static final AbstractC25380b DB_MIGRATION_66_67;
    private static final AbstractC25380b DB_MIGRATION_67_68;
    private static final AbstractC25380b DB_MIGRATION_68_69;
    private static final AbstractC25380b DB_MIGRATION_6_7;
    private static final AbstractC25380b DB_MIGRATION_7_8;
    private static final AbstractC25380b DB_MIGRATION_8_9;
    private static final AbstractC25380b DB_MIGRATION_9_10;

    static {
        AbstractC25380b abstractC25380b = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_1_2$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC17176i.m48517s(database, "database", "CREATE TABLE table_smart_alarm_triggered (composite_id TEXT NOT NULL,PRIMARY KEY(composite_id))", "CREATE TABLE smart_alarm_user_info_table (user_id INTEGER NOT NULL,lower_time_bound TEXT NOT NULL,upper_time_bound TEXT NOT NULL,last_triggered_at TEXT NULL,sleep_score_goal INTEGER NULL,recovery_score_goal INTEGER NULL,last_updated_at INTEGER NOT NULL,PRIMARY KEY(user_id))", "DROP TABLE table_console_packets");
            }
        };
        DB_MIGRATION_1_2 = abstractC25380b;
        AbstractC25380b abstractC25380b2 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_2_3$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE smart_alarm_user_info_table ADD COLUMN goal TEXT DEFAULT 'EXACT_TIME_PEAK' NOT NULL");
                database.mo109660E("ALTER TABLE smart_alarm_user_info_table ADD COLUMN enabled INTEGER DEFAULT 0 NOT NULL");
            }
        };
        DB_MIGRATION_2_3 = abstractC25380b2;
        AbstractC25380b abstractC25380b3 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_3_4$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC17176i.m48517s(database, "database", "ALTER TABLE smart_alarm_user_info_table RENAME TO smart_alarm_user_info_table_old", "CREATE TABLE smart_alarm_user_info_table (user_id INTEGER NOT NULL,window_minutes INTEGER DEFAULT 300 NOT NULL,upper_time_bound TEXT NOT NULL,last_triggered_at TEXT NULL,sleep_score_goal INTEGER NULL,recovery_score_goal INTEGER NULL,last_updated_at INTEGER NOT NULL,goal TEXT DEFAULT 'EXACT_TIME_PEAK' NOT NULL,enabled INTEGER DEFAULT 0 NOT NULL,PRIMARY KEY(user_id))", "INSERT INTO smart_alarm_user_info_table (user_id, upper_time_bound, last_triggered_at, sleep_score_goal, recovery_score_goal, last_updated_at, goal, enabled) SELECT user_id, upper_time_bound, last_triggered_at, sleep_score_goal, recovery_score_goal, last_updated_at, goal, enabled FROM smart_alarm_user_info_table_old");
                database.mo109660E("DROP TABLE smart_alarm_user_info_table_old");
            }
        };
        DB_MIGRATION_3_4 = abstractC25380b3;
        AbstractC25380b abstractC25380b4 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_4_5$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE whoop_labs_study (study_id INTEGER NOT NULL,start_time TEXT NULL,end_time TEXT NULL,activity TEXT NULL,hr_device_connected INTEGER NOT NULL,sensor_position_id INTEGER NULL,status TEXT NOT NULL,PRIMARY KEY(study_id))");
                database.mo109660E("CREATE TABLE whoop_labs_hr_device (hr_device_id TEXT NOT NULL,device_name TEXT NULL,hr_file_path TEXT NULL,PRIMARY KEY(hr_device_id))");
            }
        };
        DB_MIGRATION_4_5 = abstractC25380b4;
        AbstractC25380b abstractC25380b5 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_5_6$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE whoop_labs_study ADD campaign_id INTEGER DEFAULT 0 NOT NULL");
            }
        };
        DB_MIGRATION_5_6 = abstractC25380b5;
        AbstractC25380b abstractC25380b6 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_6_7$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE optimal_strain_mapping_table (\n                recovery INTEGER NOT NULL PRIMARY KEY,\n                lower_optimal_strain REAL NOT NULL,\n                optimal_strain REAL NOT NULL,\n                upper_optimal_strain REAL NOT NULL,\n                cycle_id INTEGER NOT NULL )");
            }
        };
        DB_MIGRATION_6_7 = abstractC25380b6;
        AbstractC25380b abstractC25380b7 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_7_8$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC17176i.m48517s(database, "database", "CREATE TABLE labs_campaign (campaign_id INTEGER NOT NULL,name TEXT NOT NULL,description TEXT NOT NULL,PRIMARY KEY(campaign_id))", "DELETE from whoop_labs_study", "DELETE from whoop_labs_hr_device");
            }
        };
        DB_MIGRATION_7_8 = abstractC25380b7;
        AbstractC25380b abstractC25380b8 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_8_9$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE sensor_positions (position_id INTEGER NOT NULL,tag TEXT NOT NULL,display_string TEXT NOT NULL,PRIMARY KEY(position_id))");
                database.mo109660E("CREATE TABLE sensor_position_to_campaign (campaign_id INTEGER NOT NULL, position_id INTEGER NOT NULL, PRIMARY KEY(campaign_id, position_id))");
            }
        };
        DB_MIGRATION_8_9 = abstractC25380b8;
        AbstractC25380b abstractC25380b9 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_9_10$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC17176i.m48517s(database, "database", "ALTER TABLE labs_campaign ADD protocol_id INTEGER", "ALTER TABLE labs_campaign ADD protocol_name TEXT", "ALTER TABLE labs_campaign ADD pdf_url TEXT");
                database.mo109660E("ALTER TABLE whoop_labs_study ADD pdf_file_name TEXT");
            }
        };
        DB_MIGRATION_9_10 = abstractC25380b9;
        AbstractC25380b abstractC25380b10 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_10_11$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE table_configurations (configuration_key TEXT NOT NULL,configuration_value TEXT NOT NULL, PRIMARY KEY (configuration_key))");
            }
        };
        DB_MIGRATION_10_11 = abstractC25380b10;
        AbstractC25380b abstractC25380b11 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_11_12$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE whoop_labs_study_tag (tag_id INTEGER NOT NULL,timestamp TEXT NOT NULL,note TEXT NULL, PRIMARY KEY (tag_id))");
            }
        };
        DB_MIGRATION_11_12 = abstractC25380b11;
        AbstractC25380b abstractC25380b12 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_12_13$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE smart_alarm_user_info_table ADD COLUMN schedule_enabled INTEGER DEFAULT 0 NOT NULL");
                database.mo109660E("ALTER TABLE smart_alarm_user_info_table ADD COLUMN day_of_week TEXT NULL");
            }
        };
        DB_MIGRATION_12_13 = abstractC25380b12;
        AbstractC25380b abstractC25380b13 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_13_14$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE table_onboarding_status (type TEXT NOT NULL,isCompleted INTEGER DEFAULT 0 NOT NULL, PRIMARY KEY (type))");
            }
        };
        DB_MIGRATION_13_14 = abstractC25380b13;
        AbstractC25380b abstractC25380b14 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_14_15$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE protocol_step (step_id INTEGER NOT NULL,text TEXT ,typeform_url TEXT ,image_url TEXT ,is_bp INTEGER NOT NULL,PRIMARY KEY(step_id))");
                database.mo109660E("CREATE TABLE protocol_step_to_campaign (campaign_id INTEGER NOT NULL, step_id INTEGER NOT NULL, PRIMARY KEY(campaign_id, step_id))");
            }
        };
        DB_MIGRATION_14_15 = abstractC25380b14;
        AbstractC25380b abstractC25380b15 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_15_16$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE whoop_labs_bp_reading (id INTEGER NOT NULL,systolic INTEGER NOT NULL,diastolic INTEGER NOT NULL,timestamp TEXT NOT NULL,PRIMARY KEY (id))");
            }
        };
        DB_MIGRATION_15_16 = abstractC25380b15;
        AbstractC25380b abstractC25380b16 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_16_17$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC17176i.m48517s(database, "database", "CREATE TABLE whoop_labs_protocol_step_result (result_id INTEGER NOT NULL,start_timestamp TEXT,end_timestamp TEXT,PRIMARY KEY (result_id))", "ALTER TABLE whoop_labs_study ADD COLUMN 'protocol_step' INTEGER NOT NULL DEFAULT 0", "ALTER TABLE whoop_labs_study ADD COLUMN 'protocol_completed' INTEGER NOT NULL DEFAULT 0");
            }
        };
        DB_MIGRATION_16_17 = abstractC25380b16;
        AbstractC25380b abstractC25380b17 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_17_18$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE table_activities_list (internal_name TEXT NOT NULL,display_name TEXT NOT NULL,icon_url TEXT NOT NULL,deleted INTEGER DEFAULT 0 NOT NULL,category TEXT NOT NULL,score_type TEXT NOT NULL,has_gps INTEGER DEFAULT 0 NOT NULL,PRIMARY KEY (internal_name))");
            }
        };
        DB_MIGRATION_17_18 = abstractC25380b17;
        AbstractC25380b abstractC25380b18 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_18_19$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE labs_campaign ADD COLUMN 'advanced_edc' INTEGER NOT NULL DEFAULT 0");
            }
        };
        DB_MIGRATION_18_19 = abstractC25380b18;
        AbstractC25380b abstractC25380b19 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_19_20$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC17176i.m48517s(database, "database", "ALTER TABLE whoop_labs_protocol_step_result ADD COLUMN 'timestamp' TEXT ", "ALTER TABLE whoop_labs_protocol_step_result ADD COLUMN 'systolic' INTEGER ", "ALTER TABLE whoop_labs_protocol_step_result ADD COLUMN 'diastolic' INTEGER ");
                database.mo109660E("ALTER TABLE whoop_labs_protocol_step_result ADD COLUMN 'heart_rate' INTEGER ");
            }
        };
        DB_MIGRATION_19_20 = abstractC25380b19;
        AbstractC25380b abstractC25380b20 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_20_21$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE whoop_labs_legal_ducment (legal_id INTEGER NOT NULL,name TEXT NOT NULL,pdf_url TEXT NOT NULL,PRIMARY KEY (legal_id))");
                database.mo109660E("CREATE TABLE legal_document_to_campaign (campaign_id INTEGER NOT NULL, legal_id INTEGER NOT NULL, PRIMARY KEY(campaign_id, legal_id))");
            }
        };
        DB_MIGRATION_20_21 = abstractC25380b20;
        AbstractC25380b abstractC25380b21 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_21_22$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE whoop_labs_protocol_step_result ADD COLUMN 'typeform_submitted' INTEGER NOT NULL DEFAULT 0");
            }
        };
        DB_MIGRATION_21_22 = abstractC25380b21;
        AbstractC25380b abstractC25380b22 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_22_23$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE labs_campaign ADD COLUMN 'additional_collection_length' INTEGER DEFAULT NULL");
            }
        };
        DB_MIGRATION_22_23 = abstractC25380b22;
        AbstractC25380b abstractC25380b23 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_23_24$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE whoop_labs_legal_ducment ADD COLUMN 'pdf_file_name' TEXT");
            }
        };
        DB_MIGRATION_23_24 = abstractC25380b23;
        AbstractC25380b abstractC25380b24 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_24_25$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE table_recent_activities (internal_name TEXT NOT NULL,display_name TEXT NOT NULL,icon_url TEXT NOT NULL,deleted INTEGER DEFAULT 0 NOT NULL,category TEXT NOT NULL,score_type TEXT NOT NULL,has_gps INTEGER DEFAULT 0 NOT NULL,PRIMARY KEY (internal_name))");
            }
        };
        DB_MIGRATION_24_25 = abstractC25380b24;
        AbstractC25380b abstractC25380b25 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_25_26$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE labs_campaign ADD COLUMN 'participation_cooldown_date' TEXT");
            }
        };
        DB_MIGRATION_25_26 = abstractC25380b25;
        AbstractC25380b abstractC25380b26 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_26_27$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE labs_campaign ADD COLUMN 'data_types' TEXT");
            }
        };
        DB_MIGRATION_26_27 = abstractC25380b26;
        AbstractC25380b abstractC25380b27 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_27_28$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE smart_alarm_user_info_table ADD COLUMN enrolled_weekly_plan INTEGER DEFAULT 0 NOT NULL");
            }
        };
        DB_MIGRATION_27_28 = abstractC25380b27;
        AbstractC25380b abstractC25380b28 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_28_29$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE smart_alarm_user_info_table ADD COLUMN weekly_plan_goal INTEGER NULL");
            }
        };
        DB_MIGRATION_28_29 = abstractC25380b28;
        AbstractC25380b abstractC25380b29 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_29_30$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE whoop_labs_session (campaign_session_id INTEGER NOT NULL,PRIMARY KEY (campaign_session_id))");
                database.mo109660E("ALTER TABLE labs_campaign ADD COLUMN campaign_session_id INTEGER NULL");
            }
        };
        DB_MIGRATION_29_30 = abstractC25380b29;
        AbstractC25380b abstractC25380b30 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_30_31$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'image_alt' TEXT");
            }
        };
        DB_MIGRATION_30_31 = abstractC25380b30;
        AbstractC25380b abstractC25380b31 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_31_32$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE whoop_labs_strap_info (whoop_strap_id TEXT NOT NULL,hardware_version TEXT NOT NULL,firmware_version TEXT NOT NULL,bluetooth_version TEXT NOT NULL,sig_proc_version TEXT NOT NULL,PRIMARY KEY (whoop_strap_id))");
            }
        };
        DB_MIGRATION_31_32 = abstractC25380b31;
        AbstractC25380b abstractC25380b32 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_32_33$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE labs_campaign ADD COLUMN 'subtitle' TEXT");
            }
        };
        DB_MIGRATION_32_33 = abstractC25380b32;
        AbstractC25380b abstractC25380b33 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_33_34$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE whoop_labs_campaign_activity (activity_id INTEGER NOT NULL,display_string TEXT NOT NULL,tag TEXT NOT NULL,PRIMARY KEY(activity_id))");
                database.mo109660E("CREATE TABLE activity_to_campaign (campaign_id INTEGER NOT NULL, activity_id INTEGER NOT NULL, PRIMARY KEY(campaign_id, activity_id))");
            }
        };
        DB_MIGRATION_33_34 = abstractC25380b33;
        AbstractC25380b abstractC25380b34 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_34_35$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE smart_alarm_user_info_table ADD COLUMN time_zone_offset TEXT NULL");
            }
        };
        DB_MIGRATION_34_35 = abstractC25380b34;
        AbstractC25380b abstractC25380b35 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_35_36$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC17176i.m48517s(database, "database", "ALTER TABLE protocol_step ADD COLUMN 'title' TEXT", "ALTER TABLE protocol_step ADD COLUMN 'sub_title' TEXT", "ALTER TABLE protocol_step ADD COLUMN 'cta' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'typeform_title' TEXT");
            }
        };
        DB_MIGRATION_35_36 = abstractC25380b35;
        AbstractC25380b abstractC25380b36 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_36_37$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE smart_alarm_user_info_table ADD COLUMN alarm_bounds TEXT NULL");
            }
        };
        DB_MIGRATION_36_37 = abstractC25380b36;
        AbstractC25380b abstractC25380b37 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_37_38$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN is_timer_active INTEGER");
            }
        };
        DB_MIGRATION_37_38 = abstractC25380b37;
        AbstractC25380b abstractC25380b38 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_38_39$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC17176i.m48517s(database, "database", "ALTER TABLE protocol_step ADD COLUMN 'systolic_label' TEXT", "ALTER TABLE protocol_step ADD COLUMN 'systolic_too_low_text' TEXT", "ALTER TABLE protocol_step ADD COLUMN 'systolic_too_high_text' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'systolic_required_text' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'systolic_max' INTEGER");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'systolic_min' INTEGER");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'systolic_suffix' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'systolic_required' INTEGER");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'diastolic_label' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'diastolic_too_low_text' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'diastolic_too_high_text' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'diastolic_required_text' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'diastolic_max' INTEGER");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'diastolic_min' INTEGER");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'diastolic_suffix' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'diastolic_required' INTEGER");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'heart_rate_label' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'heart_rate_too_low_text' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'heart_rate_too_high_text' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'heart_required_text' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'heart_rate_max' INTEGER");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'heart_rate_min' INTEGER");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'heart_rate_suffix' TEXT");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'hear_rate_required' INTEGER");
            }
        };
        DB_MIGRATION_38_39 = abstractC25380b38;
        AbstractC25380b abstractC25380b39 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_39_40$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'is_bthr' INTEGER NOT NULL DEFAULT 0");
            }
        };
        DB_MIGRATION_39_40 = abstractC25380b39;
        AbstractC25380b abstractC25380b40 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_40_41$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE table_user (id INTEGER NOT NULL,created_at TEXT NOT NULL, first_name TEXT NOT NULL, last_name TEXT NOT NULL, full_name TEXT NOT NULL, email_address TEXT NOT NULL, password TEXT NOT NULL, username TEXT NOT NULL, avatar_url TEXT NOT NULL, city TEXT, admin_division TEXT, country TEXT NOT NULL, concealed INTEGER DEFAULT 0 NOT NULL, age INTEGER NOT NULL, PRIMARY KEY(id))");
                database.mo109660E("CREATE TABLE table_user_profile (id INTEGER NOT NULL,gender TEXT NOT NULL, height REAL NOT NULL, weight REAL NOT NULL, birthday TEXT NOT NULL, time_zone_offset TEXT NOT NULL, unit_system TEXT NOT NULL, fitness_level TEXT NOT NULL, max_heart_rate INTEGER NOT NULL, min_heart_rate INTEGER NOT NULL, physiological_baseline TEXT, can_upload_data INTEGER NOT NULL, PRIMARY KEY(id))");
            }
        };
        DB_MIGRATION_40_41 = abstractC25380b40;
        AbstractC25380b abstractC25380b41 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_41_42$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("CREATE TABLE entitlement_table (id INTEGER NOT NULL,name TEXT NOT NULL, enabled INTEGER NOT NULL, lastUpdated INTEGER NOT NULL, PRIMARY KEY(id))");
            }
        };
        DB_MIGRATION_41_42 = abstractC25380b41;
        AbstractC25380b abstractC25380b42 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_42_43$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC17176i.m48517s(db4, "db", "CREATE TABLE labs_campaign_new (campaign_id INTEGER NOT NULL, name TEXT NOT NULL, description TEXT NOT NULL, subtitle TEXT, participation_cooldown_date TEXT, additional_collection_length INTEGER DEFAULT NULL, data_types TEXT, protocol_id INTEGER, protocol_name TEXT, pdf_url TEXT, campaign_session_id INTEGER NULL, PRIMARY KEY(campaign_id))", "INSERT INTO labs_campaign_new (campaign_id, name, description, subtitle, participation_cooldown_date, additional_collection_length, data_types, protocol_id, protocol_name, pdf_url, campaign_session_id) SELECT campaign_id, name, description, subtitle, participation_cooldown_date, additional_collection_length, data_types, protocol_id, protocol_name, pdf_url, campaign_session_id FROM labs_campaign", "DROP TABLE labs_campaign");
                db4.mo109660E("ALTER TABLE labs_campaign_new RENAME TO labs_campaign");
            }
        };
        DB_MIGRATION_42_43 = abstractC25380b42;
        AbstractC25380b abstractC25380b43 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_43_44$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC17176i.m48517s(db4, "db", "ALTER TABLE protocol_step ADD COLUMN 'input_type' TEXT", "ALTER TABLE protocol_step ADD COLUMN 'input_required' INTEGER DEFAULT 0 NOT NULL ", "CREATE TABLE whoop_labs_input_option (step_id INTEGER NOT NULL, option_order INTEGER NOT NULL, option_key TEXT NOT NULL, option_value TEXT NOT NULL, PRIMARY KEY(step_id, option_key))");
                db4.mo109660E("ALTER TABLE whoop_labs_protocol_step_result ADD COLUMN 'text_option' TEXT");
            }
        };
        DB_MIGRATION_43_44 = abstractC25380b43;
        AbstractC25380b abstractC25380b44 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_44_45$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("ALTER TABLE whoop_labs_protocol_step_result ADD COLUMN 'number_input' INTEGER DEFAULT NULL");
                db4.mo109660E("CREATE TABLE whoop_labs_protocol_step_config (step_id INTEGER NOT NULL, input_label TEXT NULL, min INTEGER NULL, max INTEGER NULL, min_error_text TEXT NULL, max_error_text TEXT NULL, hint TEXT NULL,PRIMARY KEY(step_id))");
            }
        };
        DB_MIGRATION_44_45 = abstractC25380b44;
        AbstractC25380b abstractC25380b45 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_45_46$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("ALTER TABLE whoop_labs_protocol_step_result ADD COLUMN 'text_input' TEXT");
                db4.mo109660E("ALTER TABLE whoop_labs_protocol_step_config ADD COLUMN 'row_count' INTEGER");
            }
        };
        DB_MIGRATION_45_46 = abstractC25380b45;
        AbstractC25380b abstractC25380b46 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_46_47$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'step_order' INTEGER DEFAULT 0 NOT NULL");
                db4.mo109660E("ALTER TABLE whoop_labs_protocol_step_result ADD COLUMN 'step_order' INTEGER DEFAULT 0 NOT NULL");
            }
        };
        DB_MIGRATION_46_47 = abstractC25380b46;
        AbstractC25380b abstractC25380b47 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_47_48$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC17176i.m48517s(db4, "db", "ALTER TABLE whoop_labs_study_tag ADD COLUMN 'campaign_id' INTEGER DEFAULT -1 NOT NULL", "DROP TABLE protocol_step_to_campaign", "CREATE TABLE protocol_step_new (campaign_id INTEGER NOT NULL, step_id INTEGER NOT NULL, 'text' TEXT NULL, step_order INTEGER NOT NULL, typeform_url TEXT NULL, image_url TEXT NULL, image_alt TEXT NULL, is_bp INTEGER NOT NULL, is_timer_active INTEGER NULL, is_bthr INTEGER NOT NULL, title TEXT NULL, sub_title TEXT NULL, cta TEXT NULL, typeform_title TEXT NULL, systolic_label TEXT NULL, systolic_too_low_text TEXT NULL, systolic_too_high_text TEXT NULL, systolic_required_text TEXT NULL, systolic_max INTEGER NULL, systolic_min INTEGER NULL, systolic_suffix TEXT NULL, systolic_required INTEGER NULL, diastolic_label TEXT NULL, diastolic_too_low_text TEXT NULL, diastolic_too_high_text TEXT NULL, diastolic_required_text TEXT NULL, diastolic_max INTEGER NULL, diastolic_min INTEGER NULL, diastolic_suffix TEXT NULL, diastolic_required INTEGER NULL, heart_rate_label TEXT NULL, heart_rate_too_low_text TEXT NULL, heart_rate_too_high_text TEXT NULL, heart_required_text TEXT NULL, heart_rate_max INTEGER NULL, heart_rate_min INTEGER NULL, heart_rate_suffix TEXT NULL, heart_rate_required INTEGER NULL, input_type TEXT NULL, input_required INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(campaign_id, step_id))");
                db4.mo109660E("INSERT INTO protocol_step_new (campaign_id, step_id, text, step_order, typeform_url, image_url, image_alt, is_bp, is_timer_active, is_bthr, title, sub_title, cta, typeform_title, systolic_label, systolic_too_low_text, systolic_too_high_text, systolic_required_text, systolic_max, systolic_min, systolic_suffix, systolic_required, diastolic_label, diastolic_too_low_text, diastolic_too_high_text, diastolic_required_text, diastolic_max, diastolic_min, diastolic_suffix, diastolic_required, heart_rate_label, heart_rate_too_low_text, heart_rate_too_high_text, heart_required_text, heart_rate_max, heart_rate_min, heart_rate_suffix, heart_rate_required, input_type, input_required) SELECT -1, step_id, text, step_order, typeform_url, image_url, image_alt, is_bp, is_timer_active, is_bthr, title, sub_title, cta, typeform_title, systolic_label, systolic_too_low_text, systolic_too_high_text, systolic_required_text, systolic_max, systolic_min, systolic_suffix, systolic_required, diastolic_label, diastolic_too_low_text, diastolic_too_high_text, diastolic_required_text, diastolic_max, diastolic_min, diastolic_suffix, diastolic_required, heart_rate_label, heart_rate_too_low_text, heart_rate_too_high_text, heart_required_text, heart_rate_max, heart_rate_min, heart_rate_suffix, hear_rate_required, input_type, input_required FROM protocol_step");
                db4.mo109660E("DROP TABLE protocol_step");
                db4.mo109660E("ALTER TABLE protocol_step_new RENAME TO protocol_step");
                db4.mo109660E("CREATE TABLE protocol_step_result_new (campaign_id INTEGER NOT NULL, result_id INTEGER NOT NULL, start_timestamp TEXT NULL, end_timestamp TEXT NULL, timestamp TEXT NULL, systolic INTEGER NULL, diastolic INTEGER NULL, heart_rate INTEGER NULL, typeform_submitted INTEGER NOT NULL, text_option TEXT NULL, number_input INTEGER NULL, text_input TEXT NULL, step_order INTEGER NOT NULL, PRIMARY KEY(campaign_id, result_id))");
                db4.mo109660E("INSERT INTO protocol_step_result_new (campaign_id, result_id, start_timestamp, end_timestamp, timestamp, systolic, diastolic, heart_rate, typeform_submitted, text_option, number_input, text_input, step_order) SELECT -1, result_id, start_timestamp, end_timestamp, timestamp, systolic, diastolic, heart_rate, typeform_submitted, text_option, number_input, text_input, step_order FROM whoop_labs_protocol_step_result");
                db4.mo109660E("DROP TABLE whoop_labs_protocol_step_result");
                db4.mo109660E("ALTER TABLE protocol_step_result_new RENAME TO whoop_labs_protocol_step_result");
            }
        };
        DB_MIGRATION_47_48 = abstractC25380b47;
        AbstractC25380b abstractC25380b48 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_48_49$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("CREATE TABLE table_hr_zone_list (zone_id TEXT NOT NULL,min INTEGER DEFAULT 0 NOT NULL,max INTEGER DEFAULT 0 NOT NULL,PRIMARY KEY (zone_id))");
            }
        };
        DB_MIGRATION_48_49 = abstractC25380b48;
        AbstractC25380b abstractC25380b49 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_49_50$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE smart_alarm_user_info_table ADD COLUMN weekly_plan_hour_goal TEXT NULL");
            }
        };
        DB_MIGRATION_49_50 = abstractC25380b49;
        AbstractC25380b abstractC25380b50 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_50_51$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'countdown_timer_required' INTEGER NOT NULL DEFAULT 0");
                db4.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'countdown_timer_seconds' INTEGER NULL");
            }
        };
        DB_MIGRATION_50_51 = abstractC25380b50;
        AbstractC25380b abstractC25380b51 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_51_52$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC22676k.m65750j(database, "database");
                database.mo109660E("ALTER TABLE whoop_labs_protocol_step_result ADD COLUMN 'timestamp_input' TEXT");
            }
        };
        DB_MIGRATION_51_52 = abstractC25380b51;
        AbstractC25380b abstractC25380b52 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_52_53$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a database) {
                AbstractC17176i.m48517s(database, "database", "CREATE TABLE whoop_labs_mystic_reading (id INTEGER NOT NULL,systolic INTEGER NOT NULL,diastolic INTEGER NOT NULL,timestamp TEXT NOT NULL,PRIMARY KEY (id))", "INSERT INTO whoop_labs_mystic_reading (id, systolic, diastolic, timestamp) SELECT id, systolic, diastolic, timestamp FROM whoop_labs_bp_reading", "DROP TABLE whoop_labs_bp_reading");
            }
        };
        DB_MIGRATION_52_53 = abstractC25380b52;
        AbstractC25380b abstractC25380b53 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_53_54$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("DROP TABLE IF EXISTS whoop_labs_mystic_reading");
            }
        };
        DB_MIGRATION_53_54 = abstractC25380b53;
        AbstractC25380b abstractC25380b54 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_54_55$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("ALTER TABLE labs_campaign ADD COLUMN 'bthr_additional_collection_length' INTEGER");
            }
        };
        DB_MIGRATION_54_55 = abstractC25380b54;
        AbstractC25380b abstractC25380b55 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_55_56$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("CREATE TABLE gps_locations (timestamp INTEGER NOT NULL,latitude REAL NOT NULL,longitude REAL NOT NULL,altitude REAL NOT NULL,horizontal_accuracy_meters REAL NOT NULL,vertical_accuracy_meters REAL NOT NULL,PRIMARY KEY (timestamp))");
                db4.mo109660E("CREATE INDEX index_gps_locations_timestamp ON gps_locations(timestamp)");
            }
        };
        DB_MIGRATION_55_56 = abstractC25380b55;
        AbstractC25380b abstractC25380b56 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_56_57$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC17176i.m48517s(db4, "db", "CREATE TABLE whoop_labs_study_new (study_id INTEGER NOT NULL,start_time TEXT NULL,end_time TEXT NULL,activity TEXT NULL,hr_device_connected INTEGER NOT NULL,status TEXT NOT NULL,campaign_id INTEGER NOT NULL,pdf_file_name TEXT NULL,protocol_step INTEGER NOT NULL DEFAULT 0,protocol_completed INTEGER NOT NULL DEFAULT 0,PRIMARY KEY(study_id))", "INSERT INTO whoop_labs_study_new (study_id, start_time, end_time, activity, hr_device_connected, status, campaign_id, pdf_file_name, protocol_step, protocol_completed) SELECT study_id, start_time, end_time, activity, hr_device_connected, status, campaign_id, pdf_file_name, protocol_step, protocol_completed FROM whoop_labs_study", "DROP TABLE whoop_labs_study");
                db4.mo109660E("ALTER TABLE whoop_labs_study_new RENAME TO whoop_labs_study");
                db4.mo109660E("DROP TABLE IF EXISTS sensor_position_to_campaign");
                db4.mo109660E("DROP TABLE IF EXISTS sensor_positions");
            }
        };
        DB_MIGRATION_56_57 = abstractC25380b56;
        AbstractC25380b abstractC25380b57 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_57_58$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC17176i.m48517s(db4, "db", "CREATE TABLE whoop_labs_study_new (study_id INTEGER NOT NULL,start_time TEXT NULL,end_time TEXT NULL,hr_device_connected INTEGER NOT NULL,status TEXT NOT NULL,campaign_id INTEGER NOT NULL,pdf_file_name TEXT NULL,protocol_step INTEGER NOT NULL DEFAULT 0,protocol_completed INTEGER NOT NULL DEFAULT 0,PRIMARY KEY(study_id))", "INSERT INTO whoop_labs_study_new (study_id, start_time, end_time, hr_device_connected, status, campaign_id, pdf_file_name, protocol_step, protocol_completed) SELECT study_id, start_time, end_time, hr_device_connected, status, campaign_id, pdf_file_name, protocol_step, protocol_completed FROM whoop_labs_study", "DROP TABLE whoop_labs_study");
                db4.mo109660E("ALTER TABLE whoop_labs_study_new RENAME TO whoop_labs_study");
                db4.mo109660E("DROP TABLE IF EXISTS activity_to_campaign");
                db4.mo109660E("DROP TABLE IF EXISTS whoop_labs_campaign_activity");
            }
        };
        DB_MIGRATION_57_58 = abstractC25380b57;
        AbstractC25380b abstractC25380b58 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_58_59$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC17176i.m48517s(db4, "db", "ALTER TABLE gps_locations ADD COLUMN speed_value REAL", "ALTER TABLE gps_locations ADD COLUMN speed_unit TEXT", "ALTER TABLE gps_locations ADD COLUMN speed_accuracy REAL");
                db4.mo109660E("ALTER TABLE gps_locations ADD COLUMN trigger TEXT");
            }
        };
        DB_MIGRATION_58_59 = abstractC25380b58;
        AbstractC25380b abstractC25380b59 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_59_60$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC17176i.m48517s(db4, "db", "ALTER TABLE protocol_step ADD COLUMN 'survey_form_id' TEXT NULL", "ALTER TABLE protocol_step ADD COLUMN 'survey_vendor_metadata' TEXT NULL", "ALTER TABLE protocol_step ADD COLUMN 'survey_provider' TEXT NULL");
            }
        };
        DB_MIGRATION_59_60 = abstractC25380b59;
        AbstractC25380b abstractC25380b60 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_60_61$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'required_regex' TEXT NULL");
            }
        };
        DB_MIGRATION_60_61 = abstractC25380b60;
        AbstractC25380b abstractC25380b61 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_61_62$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("ALTER TABLE protocol_step ADD COLUMN 'blocked_regex' TEXT NULL");
            }
        };
        DB_MIGRATION_61_62 = abstractC25380b61;
        AbstractC25380b abstractC25380b62 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_62_63$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("CREATE TABLE app_configuration_cache_table (id INTEGER NOT NULL, responseJson TEXT NOT NULL, lastUpdated INTEGER NOT NULL, PRIMARY KEY(id))");
            }
        };
        DB_MIGRATION_62_63 = abstractC25380b62;
        AbstractC25380b abstractC25380b63 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_63_64$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("CREATE TABLE membership_type_table (id INTEGER NOT NULL, membershipType TEXT NOT NULL, lastUpdated INTEGER NOT NULL, PRIMARY KEY(id))");
            }
        };
        DB_MIGRATION_63_64 = abstractC25380b63;
        AbstractC25380b abstractC25380b64 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_64_65$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("CREATE TABLE active_activity_session_table (id INTEGER NOT NULL, activitySessionId TEXT NOT NULL, state TEXT NOT NULL, selectedActivityInternalName TEXT NOT NULL, gpsTrackingEnabled INTEGER NOT NULL, startTimeMs INTEGER NOT NULL, resumeNavigationJson TEXT, PRIMARY KEY(id))");
            }
        };
        DB_MIGRATION_64_65 = abstractC25380b64;
        AbstractC25380b abstractC25380b65 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_65_66$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("CREATE TABLE pending_activity_save_table (id INTEGER NOT NULL, activityInternalName TEXT NOT NULL, garmentId INTEGER NOT NULL, startTime TEXT NOT NULL, endTime TEXT NOT NULL, gpsEnabled INTEGER NOT NULL, queuedAtMs INTEGER NOT NULL, PRIMARY KEY(id))");
            }
        };
        DB_MIGRATION_65_66 = abstractC25380b65;
        AbstractC25380b abstractC25380b66 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_66_67$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("CREATE TABLE foreground_gps_route_points (sessionStartTimeMs INTEGER NOT NULL,timestamp INTEGER NOT NULL,latitude REAL NOT NULL,longitude REAL NOT NULL,altitude REAL NOT NULL,horizontal_accuracy_meters REAL NOT NULL,vertical_accuracy_meters REAL NOT NULL,PRIMARY KEY (sessionStartTimeMs, timestamp))");
                db4.mo109660E("CREATE INDEX index_foreground_gps_route_points_sessionStartTimeMs ON foreground_gps_route_points(sessionStartTimeMs)");
            }
        };
        DB_MIGRATION_66_67 = abstractC25380b66;
        AbstractC25380b abstractC25380b67 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_67_68$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("ALTER TABLE active_activity_session_table ADD COLUMN pauseSegmentsJson TEXT NOT NULL DEFAULT '[]'");
            }
        };
        DB_MIGRATION_67_68 = abstractC25380b67;
        AbstractC25380b abstractC25380b68 = new AbstractC25380b() { // from class: com.whoop.data.local.room.migrations.PersistentWhoopDatabaseMigrationsKt$DB_MIGRATION_68_69$1
            @Override // p325mb.AbstractC25380b
            public void migrate(InterfaceC34728a db4) {
                AbstractC22676k.m65750j(db4, "db");
                db4.mo109660E("ALTER TABLE pending_activity_save_table ADD COLUMN pauseSegmentsJson TEXT");
            }
        };
        DB_MIGRATION_68_69 = abstractC25380b68;
        ALL_MIGRATIONS = new AbstractC25380b[]{abstractC25380b, abstractC25380b2, abstractC25380b3, abstractC25380b4, abstractC25380b5, abstractC25380b6, abstractC25380b7, abstractC25380b8, abstractC25380b9, abstractC25380b10, abstractC25380b11, abstractC25380b12, abstractC25380b13, abstractC25380b14, abstractC25380b15, abstractC25380b16, abstractC25380b17, abstractC25380b18, abstractC25380b19, abstractC25380b20, abstractC25380b21, abstractC25380b22, abstractC25380b23, abstractC25380b24, abstractC25380b25, abstractC25380b26, abstractC25380b27, abstractC25380b28, abstractC25380b29, abstractC25380b30, abstractC25380b31, abstractC25380b32, abstractC25380b33, abstractC25380b34, abstractC25380b35, abstractC25380b36, abstractC25380b37, abstractC25380b38, abstractC25380b39, abstractC25380b40, abstractC25380b41, abstractC25380b42, abstractC25380b43, abstractC25380b44, abstractC25380b45, abstractC25380b46, abstractC25380b47, abstractC25380b48, abstractC25380b49, abstractC25380b50, abstractC25380b51, abstractC25380b52, abstractC25380b53, abstractC25380b54, abstractC25380b55, abstractC25380b56, abstractC25380b57, abstractC25380b58, abstractC25380b59, abstractC25380b60, abstractC25380b61, abstractC25380b62, abstractC25380b63, abstractC25380b64, abstractC25380b65, abstractC25380b66, abstractC25380b67, abstractC25380b68};
    }

    public static final AbstractC25380b[] getALL_MIGRATIONS() {
        return ALL_MIGRATIONS;
    }

    public static final AbstractC25380b getDB_MIGRATION_10_11() {
        return DB_MIGRATION_10_11;
    }

    public static final AbstractC25380b getDB_MIGRATION_11_12() {
        return DB_MIGRATION_11_12;
    }

    public static final AbstractC25380b getDB_MIGRATION_12_13() {
        return DB_MIGRATION_12_13;
    }

    public static final AbstractC25380b getDB_MIGRATION_13_14() {
        return DB_MIGRATION_13_14;
    }

    public static final AbstractC25380b getDB_MIGRATION_14_15() {
        return DB_MIGRATION_14_15;
    }

    public static final AbstractC25380b getDB_MIGRATION_15_16() {
        return DB_MIGRATION_15_16;
    }

    public static final AbstractC25380b getDB_MIGRATION_16_17() {
        return DB_MIGRATION_16_17;
    }

    public static final AbstractC25380b getDB_MIGRATION_17_18() {
        return DB_MIGRATION_17_18;
    }

    public static final AbstractC25380b getDB_MIGRATION_18_19() {
        return DB_MIGRATION_18_19;
    }

    public static final AbstractC25380b getDB_MIGRATION_19_20() {
        return DB_MIGRATION_19_20;
    }

    public static final AbstractC25380b getDB_MIGRATION_1_2() {
        return DB_MIGRATION_1_2;
    }

    public static final AbstractC25380b getDB_MIGRATION_20_21() {
        return DB_MIGRATION_20_21;
    }

    public static final AbstractC25380b getDB_MIGRATION_21_22() {
        return DB_MIGRATION_21_22;
    }

    public static final AbstractC25380b getDB_MIGRATION_22_23() {
        return DB_MIGRATION_22_23;
    }

    public static final AbstractC25380b getDB_MIGRATION_23_24() {
        return DB_MIGRATION_23_24;
    }

    public static final AbstractC25380b getDB_MIGRATION_24_25() {
        return DB_MIGRATION_24_25;
    }

    public static final AbstractC25380b getDB_MIGRATION_25_26() {
        return DB_MIGRATION_25_26;
    }

    public static final AbstractC25380b getDB_MIGRATION_26_27() {
        return DB_MIGRATION_26_27;
    }

    public static final AbstractC25380b getDB_MIGRATION_27_28() {
        return DB_MIGRATION_27_28;
    }

    public static final AbstractC25380b getDB_MIGRATION_28_29() {
        return DB_MIGRATION_28_29;
    }

    public static final AbstractC25380b getDB_MIGRATION_29_30() {
        return DB_MIGRATION_29_30;
    }

    public static final AbstractC25380b getDB_MIGRATION_2_3() {
        return DB_MIGRATION_2_3;
    }

    public static final AbstractC25380b getDB_MIGRATION_30_31() {
        return DB_MIGRATION_30_31;
    }

    public static final AbstractC25380b getDB_MIGRATION_31_32() {
        return DB_MIGRATION_31_32;
    }

    public static final AbstractC25380b getDB_MIGRATION_32_33() {
        return DB_MIGRATION_32_33;
    }

    public static final AbstractC25380b getDB_MIGRATION_33_34() {
        return DB_MIGRATION_33_34;
    }

    public static final AbstractC25380b getDB_MIGRATION_34_35() {
        return DB_MIGRATION_34_35;
    }

    public static final AbstractC25380b getDB_MIGRATION_35_36() {
        return DB_MIGRATION_35_36;
    }

    public static final AbstractC25380b getDB_MIGRATION_36_37() {
        return DB_MIGRATION_36_37;
    }

    public static final AbstractC25380b getDB_MIGRATION_37_38() {
        return DB_MIGRATION_37_38;
    }

    public static final AbstractC25380b getDB_MIGRATION_38_39() {
        return DB_MIGRATION_38_39;
    }

    public static final AbstractC25380b getDB_MIGRATION_39_40() {
        return DB_MIGRATION_39_40;
    }

    public static final AbstractC25380b getDB_MIGRATION_3_4() {
        return DB_MIGRATION_3_4;
    }

    public static final AbstractC25380b getDB_MIGRATION_40_41() {
        return DB_MIGRATION_40_41;
    }

    public static final AbstractC25380b getDB_MIGRATION_41_42() {
        return DB_MIGRATION_41_42;
    }

    public static final AbstractC25380b getDB_MIGRATION_42_43() {
        return DB_MIGRATION_42_43;
    }

    public static final AbstractC25380b getDB_MIGRATION_43_44() {
        return DB_MIGRATION_43_44;
    }

    public static final AbstractC25380b getDB_MIGRATION_44_45() {
        return DB_MIGRATION_44_45;
    }

    public static final AbstractC25380b getDB_MIGRATION_45_46() {
        return DB_MIGRATION_45_46;
    }

    public static final AbstractC25380b getDB_MIGRATION_46_47() {
        return DB_MIGRATION_46_47;
    }

    public static final AbstractC25380b getDB_MIGRATION_47_48() {
        return DB_MIGRATION_47_48;
    }

    public static final AbstractC25380b getDB_MIGRATION_48_49() {
        return DB_MIGRATION_48_49;
    }

    public static final AbstractC25380b getDB_MIGRATION_49_50() {
        return DB_MIGRATION_49_50;
    }

    public static final AbstractC25380b getDB_MIGRATION_4_5() {
        return DB_MIGRATION_4_5;
    }

    public static final AbstractC25380b getDB_MIGRATION_50_51() {
        return DB_MIGRATION_50_51;
    }

    public static final AbstractC25380b getDB_MIGRATION_51_52() {
        return DB_MIGRATION_51_52;
    }

    public static final AbstractC25380b getDB_MIGRATION_52_53() {
        return DB_MIGRATION_52_53;
    }

    public static final AbstractC25380b getDB_MIGRATION_53_54() {
        return DB_MIGRATION_53_54;
    }

    public static final AbstractC25380b getDB_MIGRATION_54_55() {
        return DB_MIGRATION_54_55;
    }

    public static final AbstractC25380b getDB_MIGRATION_55_56() {
        return DB_MIGRATION_55_56;
    }

    public static final AbstractC25380b getDB_MIGRATION_56_57() {
        return DB_MIGRATION_56_57;
    }

    public static final AbstractC25380b getDB_MIGRATION_57_58() {
        return DB_MIGRATION_57_58;
    }

    public static final AbstractC25380b getDB_MIGRATION_58_59() {
        return DB_MIGRATION_58_59;
    }

    public static final AbstractC25380b getDB_MIGRATION_59_60() {
        return DB_MIGRATION_59_60;
    }

    public static final AbstractC25380b getDB_MIGRATION_5_6() {
        return DB_MIGRATION_5_6;
    }

    public static final AbstractC25380b getDB_MIGRATION_60_61() {
        return DB_MIGRATION_60_61;
    }

    public static final AbstractC25380b getDB_MIGRATION_61_62() {
        return DB_MIGRATION_61_62;
    }

    public static final AbstractC25380b getDB_MIGRATION_62_63() {
        return DB_MIGRATION_62_63;
    }

    public static final AbstractC25380b getDB_MIGRATION_63_64() {
        return DB_MIGRATION_63_64;
    }

    public static final AbstractC25380b getDB_MIGRATION_64_65() {
        return DB_MIGRATION_64_65;
    }

    public static final AbstractC25380b getDB_MIGRATION_65_66() {
        return DB_MIGRATION_65_66;
    }

    public static final AbstractC25380b getDB_MIGRATION_66_67() {
        return DB_MIGRATION_66_67;
    }

    public static final AbstractC25380b getDB_MIGRATION_67_68() {
        return DB_MIGRATION_67_68;
    }

    public static final AbstractC25380b getDB_MIGRATION_68_69() {
        return DB_MIGRATION_68_69;
    }

    public static final AbstractC25380b getDB_MIGRATION_6_7() {
        return DB_MIGRATION_6_7;
    }

    public static final AbstractC25380b getDB_MIGRATION_7_8() {
        return DB_MIGRATION_7_8;
    }

    public static final AbstractC25380b getDB_MIGRATION_8_9() {
        return DB_MIGRATION_8_9;
    }

    public static final AbstractC25380b getDB_MIGRATION_9_10() {
        return DB_MIGRATION_9_10;
    }
}
