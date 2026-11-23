; ModuleID = '/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3/field-tests/arc-generic-applications-2026-11-23/fixture/Applications.ll'
source_filename = "/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3/field-tests/arc-generic-applications-2026-11-23/fixture/Applications.ll"
target datalayout = "e-m:o-p270:32:32-p271:32:32-p272:64:64-i64:64-i128:128-n32:64-S128-Fn32"
target triple = "arm64-apple-macosx14.0.0"

%swift.protocol = type { ptr, ptr, ptr, ptr, ptr, ptr, ptr, ptr, i32, i32, i32, i32, i32, i32 }
%swift.method_descriptor = type { i32, i32 }
%swift.protocol_requirement = type { i32, i32 }
%swift.enum_vwtable = type { ptr, ptr, ptr, ptr, ptr, ptr, ptr, ptr, i64, i64, i32, i32, ptr, ptr, ptr }
%swift.vwtable = type { ptr, ptr, ptr, ptr, ptr, ptr, ptr, ptr, i64, i64, i32, i32 }
%swift.type_metadata_record = type { i32 }
%swift.type = type { i64 }
%Ts6HasherV = type <{ %Ts6HasherV5_CoreV }>
%Ts6HasherV5_CoreV = type <{ %Ts6HasherV11_TailBufferV, %Ts6HasherV6_StateV }>
%Ts6HasherV11_TailBufferV = type <{ %Ts6UInt64V }>
%Ts6UInt64V = type <{ i64 }>
%Ts6HasherV6_StateV = type <{ %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V }>
%swift.opaque = type opaque
%swift.metadata_response = type { ptr, i64 }

@"$sSQMp" = external global %swift.protocol, align 4
@"got.$sSQMp" = private unnamed_addr constant ptr @"$sSQMp"
@"$sSQ2eeoiySbx_xtFZTq" = external global %swift.method_descriptor, align 4
@"got.$sSQ2eeoiySbx_xtFZTq" = private unnamed_addr constant ptr @"$sSQ2eeoiySbx_xtFZTq"
@"$s17OwnedApplications7SettingOSQAAMcMK" = internal global [16 x ptr] zeroinitializer
@"$s17OwnedApplications7SettingOSQAAMc" = constant { i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 } { i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSQMp" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOSQAAMc" to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSQAAMc", i32 0, i32 1) to i64)) to i32), i32 0, i32 196608, i32 1, i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSQ2eeoiySbx_xtFZTq" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSQAAMc", i32 0, i32 5) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOSQAASQ2eeoiySbx_xtFZTW" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSQAAMc", i32 0, i32 6) to i64)) to i32), i16 0, i16 1, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOSQAAMcMK" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSQAAMc", i32 0, i32 10) to i64)) to i32) }, section "__TEXT,__const", no_sanitize_address, align 4
@"$s17OwnedApplications7SettingOACSQAAWL" = linkonce_odr hidden local_unnamed_addr global ptr null, align 8
@"associated conformance 17OwnedApplications7SettingOSHAASQ" = linkonce_odr hidden constant <{ i8, i8, i32, i8 }> <{ i8 -1, i8 7, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOSHAASQWb" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i8, i32, i8 }>, ptr @"associated conformance 17OwnedApplications7SettingOSHAASQ", i32 0, i32 2) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$sSHMp" = external global %swift.protocol, align 4
@"got.$sSHMp" = private unnamed_addr constant ptr @"$sSHMp"
@"$sSHSQTb" = external global %swift.protocol_requirement, align 4
@"got.$sSHSQTb" = private unnamed_addr constant ptr @"$sSHSQTb"
@"$sSH9hashValueSivgTq" = external global %swift.method_descriptor, align 4
@"got.$sSH9hashValueSivgTq" = private unnamed_addr constant ptr @"$sSH9hashValueSivgTq"
@"$sSH4hash4intoys6HasherVz_tFTq" = external global %swift.method_descriptor, align 4
@"got.$sSH4hash4intoys6HasherVz_tFTq" = private unnamed_addr constant ptr @"$sSH4hash4intoys6HasherVz_tFTq"
@"$sSH13_rawHashValue4seedS2i_tFTq" = external global %swift.method_descriptor, align 4
@"got.$sSH13_rawHashValue4seedS2i_tFTq" = private unnamed_addr constant ptr @"$sSH13_rawHashValue4seedS2i_tFTq"
@"$s17OwnedApplications7SettingOSHAAMcMK" = internal global [16 x ptr] zeroinitializer
@"$s17OwnedApplications7SettingOSHAAMc" = constant { i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 } { i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSHMp" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOSHAAMc" to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSHAAMc", i32 0, i32 1) to i64)) to i32), i32 0, i32 196608, i32 4, i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSHSQTb" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSHAAMc", i32 0, i32 5) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr getelementptr (i8, ptr @"associated conformance 17OwnedApplications7SettingOSHAASQ", i64 1) to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSHAAMc", i32 0, i32 6) to i64)) to i32), i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSH9hashValueSivgTq" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSHAAMc", i32 0, i32 7) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOSHAASH9hashValueSivgTW" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSHAAMc", i32 0, i32 8) to i64)) to i32), i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSH4hash4intoys6HasherVz_tFTq" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSHAAMc", i32 0, i32 9) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOSHAASH4hash4intoys6HasherVz_tFTW" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSHAAMc", i32 0, i32 10) to i64)) to i32), i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSH13_rawHashValue4seedS2i_tFTq" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSHAAMc", i32 0, i32 11) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOSHAASH13_rawHashValue4seedS2i_tFTW" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSHAAMc", i32 0, i32 12) to i64)) to i32), i16 0, i16 1, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOSHAAMcMK" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s17OwnedApplications7SettingOSHAAMc", i32 0, i32 16) to i64)) to i32) }, section "__TEXT,__const", no_sanitize_address, align 4
@"$s17OwnedApplications7SettingO9hashValueSivpMV" = unnamed_addr constant { i32 } zeroinitializer, align 4
@"$s17OwnedApplications7SettingOWV" = internal constant %swift.enum_vwtable { ptr @__swift_memcpy1_1, ptr @__swift_noop_void_return, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @"$s17OwnedApplications7SettingOwet", ptr @"$s17OwnedApplications7SettingOwst", i64 1, i64 1, i32 2097152, i32 253, ptr @"$s17OwnedApplications7SettingOwug", ptr @"$s17OwnedApplications7SettingOwup", ptr @"$s17OwnedApplications7SettingOwui" }, align 8
@.str.17.OwnedApplications = private constant [18 x i8] c"OwnedApplications\00"
@"$s17OwnedApplicationsMXM" = linkonce_odr hidden constant <{ i32, i32, i32 }> <{ i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.17.OwnedApplications to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32 }>, ptr @"$s17OwnedApplicationsMXM", i32 0, i32 2) to i64)) to i32) }>, section "__TEXT,__constg_swiftt", align 4
@.str.7.Setting = private constant [8 x i8] c"Setting\00"
@"$s17OwnedApplications7SettingOMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 82, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplicationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7SettingOMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.7.Setting to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7SettingOMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7SettingOMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7SettingOMn", i32 0, i32 4) to i64)) to i32), i32 0, i32 3 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedApplications7SettingOMf" = internal constant <{ ptr, ptr, i64, ptr }> <{ ptr null, ptr @"$s17OwnedApplications7SettingOWV", i64 513, ptr @"$s17OwnedApplications7SettingOMn" }>, align 8
@"symbolic _____ 17OwnedApplications7SettingO" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedApplications7SettingO", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@0 = private constant [6 x i8] c"first\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@1 = private constant [7 x i8] c"second\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@2 = private constant [6 x i8] c"third\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s17OwnedApplications7SettingOMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedApplications7SettingO" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOMF" to i64)) to i32), i32 0, i16 2, i16 12, i32 3, i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @0 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications7SettingOMF", i32 0, i32 7) to i64)) to i32), i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @1 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications7SettingOMF", i32 0, i32 10) to i64)) to i32), i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @2 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications7SettingOMF", i32 0, i32 13) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedApplications6ClientVWV" = internal constant %swift.vwtable { ptr @__swift_memcpy1_1, ptr @__swift_noop_void_return, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @"$s17OwnedApplications6ClientVwet", ptr @"$s17OwnedApplications6ClientVwst", i64 1, i64 1, i32 0, i32 254 }, align 8
@.str.6.Client = private constant [7 x i8] c"Client\00"
@"$s17OwnedApplications6ClientVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplicationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications6ClientVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.6.Client to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications6ClientVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications6ClientVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications6ClientVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications6ClientVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications6ClientVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedApplications6ClientVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, [4 x i8] }> <{ ptr null, ptr @"$s17OwnedApplications6ClientVWV", i64 512, ptr @"$s17OwnedApplications6ClientVMn", i32 0, [4 x i8] zeroinitializer }>, align 8
@"symbolic _____ 17OwnedApplications6ClientV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedApplications6ClientV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic Sb" = linkonce_odr hidden constant <{ [2 x i8], i8 }> <{ [2 x i8] c"Sb", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@3 = private constant [5 x i8] c"flag\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s17OwnedApplications6ClientVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedApplications6ClientV" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications6ClientVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Sb" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications6ClientVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @3 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications6ClientVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedApplications10DependencyVWV" = internal constant %swift.vwtable { ptr @"$s17OwnedApplications10DependencyVwCP", ptr @"$s17OwnedApplications10DependencyVwxx", ptr @"$s17OwnedApplications10DependencyVwcp", ptr @"$s17OwnedApplications10DependencyVwca", ptr @"$s17OwnedApplications10DependencyVwtk", ptr @"$s17OwnedApplications10DependencyVwta", ptr @"$s17OwnedApplications10DependencyVwet", ptr @"$s17OwnedApplications10DependencyVwst", i64 0, i64 0, i32 4194304, i32 0 }, align 8
@.str.10.Dependency = private constant [11 x i8] c"Dependency\00"
@"$s17OwnedApplications10DependencyVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s17OwnedApplications10DependencyVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplicationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications10DependencyVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.10.Dependency to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications10DependencyVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications10DependencyVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications10DependencyVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 3, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications10DependencyVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications10DependencyVMn", i32 0, i32 8) to i64)) to i32), i16 1, i16 0, i16 1, i16 0, i8 -128, i8 0, i8 0, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedApplications10DependencyVMP" = internal constant <{ i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMi" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMP" to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMr" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications10DependencyVMP", i32 0, i32 1) to i64)) to i32), i32 1073741824, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications10DependencyVMP", i32 0, i32 3) to i64)) to i32) }>, align 8
@"symbolic _____ 17OwnedApplications10DependencyV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedApplications10DependencyV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic x" = linkonce_odr hidden constant <{ [1 x i8], i8 }> <{ [1 x i8] c"x", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@4 = private constant [6 x i8] c"value\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s17OwnedApplications10DependencyVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedApplications10DependencyV" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic x" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications10DependencyVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @4 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications10DependencyVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedApplications4PairVWV" = internal constant %swift.vwtable { ptr @"$s17OwnedApplications4PairVwCP", ptr @"$s17OwnedApplications4PairVwxx", ptr @"$s17OwnedApplications4PairVwcp", ptr @"$s17OwnedApplications4PairVwca", ptr @"$s17OwnedApplications4PairVwtk", ptr @"$s17OwnedApplications4PairVwta", ptr @"$s17OwnedApplications4PairVwet", ptr @"$s17OwnedApplications4PairVwst", i64 0, i64 0, i32 4194304, i32 0 }, align 8
@.str.4.Pair = private constant [5 x i8] c"Pair\00"
@"$s17OwnedApplications4PairVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s17OwnedApplications4PairVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplicationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications4PairVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.4.Pair to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications4PairVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4PairVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications4PairVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4PairVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications4PairVMn", i32 0, i32 4) to i64)) to i32), i32 2, i32 4, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4PairVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications4PairVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4PairVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications4PairVMn", i32 0, i32 8) to i64)) to i32), i16 2, i16 0, i16 2, i16 0, i8 -128, i8 -128, i8 0, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedApplications4PairVMP" = internal constant <{ i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4PairVMi" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications4PairVMP" to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4PairVMr" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications4PairVMP", i32 0, i32 1) to i64)) to i32), i32 1073741824, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4PairVWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications4PairVMP", i32 0, i32 3) to i64)) to i32) }>, align 8
@"symbolic _____ 17OwnedApplications4PairV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4PairVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedApplications4PairV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic q_" = linkonce_odr hidden constant <{ [2 x i8], i8 }> <{ [2 x i8] c"q_", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s17OwnedApplications4PairVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedApplications4PairV" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications4PairVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 2, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic x" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4PairVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @0 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4PairVMF", i32 0, i32 7) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic q_" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4PairVMF", i32 0, i32 9) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @1 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4PairVMF", i32 0, i32 10) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedApplications11ConstrainedVWV" = internal constant %swift.vwtable { ptr @"$s17OwnedApplications11ConstrainedVwCP", ptr @"$s17OwnedApplications11ConstrainedVwxx", ptr @"$s17OwnedApplications11ConstrainedVwcp", ptr @"$s17OwnedApplications11ConstrainedVwca", ptr @"$s17OwnedApplications11ConstrainedVwtk", ptr @"$s17OwnedApplications11ConstrainedVwta", ptr @"$s17OwnedApplications11ConstrainedVwet", ptr @"$s17OwnedApplications11ConstrainedVwst", i64 0, i64 0, i32 4194304, i32 0 }, align 8
@.str.11.Constrained = private constant [12 x i8] c"Constrained\00"
@"$s17OwnedApplications11ConstrainedVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s17OwnedApplications11ConstrainedVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplicationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s17OwnedApplications11ConstrainedVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.11.Constrained to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s17OwnedApplications11ConstrainedVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications11ConstrainedVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s17OwnedApplications11ConstrainedVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications11ConstrainedVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s17OwnedApplications11ConstrainedVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 4, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications11ConstrainedVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s17OwnedApplications11ConstrainedVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications11ConstrainedVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s17OwnedApplications11ConstrainedVMn", i32 0, i32 8) to i64)) to i32), i16 1, i16 1, i16 2, i16 0, i8 -128, i8 0, i8 0, i8 0, i32 128, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic x" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s17OwnedApplications11ConstrainedVMn", i32 0, i32 18) to i64)) to i32), i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSQMp" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8, i32, i32, i32 }>, ptr @"$s17OwnedApplications11ConstrainedVMn", i32 0, i32 19) to i64)) to i32), i32 1) }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedApplications11ConstrainedVMP" = internal constant <{ i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications11ConstrainedVMi" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications11ConstrainedVMP" to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications11ConstrainedVMr" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications11ConstrainedVMP", i32 0, i32 1) to i64)) to i32), i32 1073741824, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications11ConstrainedVWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications11ConstrainedVMP", i32 0, i32 3) to i64)) to i32) }>, align 8
@"symbolic _____ 17OwnedApplications11ConstrainedV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications11ConstrainedVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedApplications11ConstrainedV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s17OwnedApplications11ConstrainedVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedApplications11ConstrainedV" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications11ConstrainedVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic x" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications11ConstrainedVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @4 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications11ConstrainedVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$sytWV" = external global ptr, align 8
@.str.7.Foreign = private constant [8 x i8] c"Foreign\00"
@"$s17OwnedApplications7ForeignOMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 82, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplicationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7ForeignOMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.7.Foreign to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7ForeignOMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignOMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7ForeignOMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignOMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7ForeignOMn", i32 0, i32 4) to i64)) to i32), i32 0, i32 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedApplications7ForeignOMf" = internal constant <{ ptr, ptr, i64, ptr }> <{ ptr null, ptr @"$sytWV", i64 513, ptr @"$s17OwnedApplications7ForeignOMn" }>, align 8
@"symbolic _____ 17OwnedApplications7ForeignO" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedApplications7ForeignO", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s17OwnedApplications7ForeignOMF" = internal constant { i32, i32, i16, i16, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedApplications7ForeignO" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignOMF" to i64)) to i32), i32 0, i16 2, i16 12, i32 0 }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$sBi64_WV" = external global ptr, align 8
@"$s17OwnedApplications7ForeignO6ClientVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7ForeignO6ClientVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.6.Client to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7ForeignO6ClientVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO6ClientVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7ForeignO6ClientVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO6ClientVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7ForeignO6ClientVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedApplications7ForeignO6ClientVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, [4 x i8] }> <{ ptr null, ptr @"$sBi64_WV", i64 512, ptr @"$s17OwnedApplications7ForeignO6ClientVMn", i32 0, [4 x i8] zeroinitializer }>, align 8
@"symbolic _____ 17OwnedApplications7ForeignO6ClientV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedApplications7ForeignO6ClientV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic Su" = linkonce_odr hidden constant <{ [2 x i8], i8 }> <{ [2 x i8] c"Su", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@5 = private constant [6 x i8] c"other\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s17OwnedApplications7ForeignO6ClientVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedApplications7ForeignO6ClientV" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO6ClientVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Su" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications7ForeignO6ClientVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @5 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications7ForeignO6ClientVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedApplications7ForeignO10DependencyVWV" = internal constant %swift.vwtable { ptr @"$s17OwnedApplications7ForeignO10DependencyVwCP", ptr @"$s17OwnedApplications7ForeignO10DependencyVwxx", ptr @"$s17OwnedApplications7ForeignO10DependencyVwcp", ptr @"$s17OwnedApplications7ForeignO10DependencyVwca", ptr @"$s17OwnedApplications7ForeignO10DependencyVwtk", ptr @"$s17OwnedApplications7ForeignO10DependencyVwta", ptr @"$s17OwnedApplications7ForeignO10DependencyVwet", ptr @"$s17OwnedApplications7ForeignO10DependencyVwst", i64 0, i64 0, i32 4194304, i32 0 }, align 8
@"$s17OwnedApplications7ForeignO10DependencyVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s17OwnedApplications7ForeignO10DependencyVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications7ForeignO10DependencyVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.10.Dependency to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications7ForeignO10DependencyVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO10DependencyVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications7ForeignO10DependencyVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO10DependencyVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications7ForeignO10DependencyVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 3, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO10DependencyVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications7ForeignO10DependencyVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO10DependencyVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s17OwnedApplications7ForeignO10DependencyVMn", i32 0, i32 8) to i64)) to i32), i16 1, i16 0, i16 1, i16 0, i8 -128, i8 0, i8 0, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedApplications7ForeignO10DependencyVMP" = internal constant <{ i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO10DependencyVMi" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO10DependencyVMP" to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO10DependencyVMr" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7ForeignO10DependencyVMP", i32 0, i32 1) to i64)) to i32), i32 1073741824, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO10DependencyVWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications7ForeignO10DependencyVMP", i32 0, i32 3) to i64)) to i32) }>, align 8
@"symbolic _____ 17OwnedApplications7ForeignO10DependencyV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedApplications7ForeignO10DependencyV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$s17OwnedApplications7ForeignO10DependencyVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedApplications7ForeignO10DependencyV" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO10DependencyVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic x" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications7ForeignO10DependencyVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @4 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications7ForeignO10DependencyVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedApplications4RootVWV" = internal constant %swift.vwtable { ptr @__swift_memcpy20_8, ptr @__swift_noop_void_return, ptr @__swift_memcpy20_8, ptr @__swift_memcpy20_8, ptr @__swift_memcpy20_8, ptr @__swift_memcpy20_8, ptr @"$s17OwnedApplications4RootVwet", ptr @"$s17OwnedApplications4RootVwst", i64 20, i64 24, i32 7, i32 254 }, align 8
@.str.4.Root = private constant [5 x i8] c"Root\00"
@"$s17OwnedApplications4RootVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplicationsMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications4RootVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.4.Root to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications4RootVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4RootVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications4RootVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4RootVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s17OwnedApplications4RootVMn", i32 0, i32 4) to i64)) to i32), i32 9, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s17OwnedApplications4RootVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, i32, i32, i32, i32, i32, i32, i32, i32, [4 x i8] }> <{ ptr null, ptr @"$s17OwnedApplications4RootVWV", i64 512, ptr @"$s17OwnedApplications4RootVMn", i32 0, i32 1, i32 2, i32 4, i32 8, i32 16, i32 17, i32 18, i32 19, [4 x i8] zeroinitializer }>, align 8
@"symbolic _____ 17OwnedApplications4RootV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4RootVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 17OwnedApplications4RootV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic _____y_____G 17OwnedApplications10DependencyV AA6ClientV" = linkonce_odr hidden constant <{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y_____G 17OwnedApplications10DependencyV AA6ClientV", i32 0, i32 1) to i64)) to i32), [1 x i8] c"y", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y_____G 17OwnedApplications10DependencyV AA6ClientV", i32 0, i32 4) to i64)) to i32), [1 x i8] c"G", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@6 = private constant [7 x i8] c"client\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic _____ySbG 17OwnedApplications10DependencyV" = linkonce_odr hidden constant <{ i8, i32, [4 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [4 x i8], i8 }>, ptr @"symbolic _____ySbG 17OwnedApplications10DependencyV", i32 0, i32 1) to i64)) to i32), [4 x i8] c"ySbG", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@7 = private constant [8 x i8] c"boolean\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic _____ySb_____G 17OwnedApplications4PairV AA6ClientV" = linkonce_odr hidden constant <{ i8, i32, [3 x i8], i8, i32, [1 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4PairVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [3 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____ySb_____G 17OwnedApplications4PairV AA6ClientV", i32 0, i32 1) to i64)) to i32), [3 x i8] c"ySb", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [3 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____ySb_____G 17OwnedApplications4PairV AA6ClientV", i32 0, i32 4) to i64)) to i32), [1 x i8] c"G", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@8 = private constant [5 x i8] c"pair\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic _____y_____G 17OwnedApplications10DependencyV AA7SettingO" = linkonce_odr hidden constant <{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y_____G 17OwnedApplications10DependencyV AA7SettingO", i32 0, i32 1) to i64)) to i32), [1 x i8] c"y", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y_____G 17OwnedApplications10DependencyV AA7SettingO", i32 0, i32 4) to i64)) to i32), [1 x i8] c"G", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@9 = private constant [13 x i8] c"enumArgument\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic _____y_____G 17OwnedApplications10DependencyV AA7ForeignO6ClientV" = linkonce_odr hidden constant <{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y_____G 17OwnedApplications10DependencyV AA7ForeignO6ClientV", i32 0, i32 1) to i64)) to i32), [1 x i8] c"y", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y_____G 17OwnedApplications10DependencyV AA7ForeignO6ClientV", i32 0, i32 4) to i64)) to i32), [1 x i8] c"G", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@10 = private constant [16 x i8] c"foreignArgument\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic _____y______G 17OwnedApplications7ForeignO10DependencyV AA6ClientV" = linkonce_odr hidden constant <{ i8, i32, [2 x i8], i8, i32, [1 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [2 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y______G 17OwnedApplications7ForeignO10DependencyV AA6ClientV", i32 0, i32 1) to i64)) to i32), [2 x i8] c"y_", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [2 x i8], i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y______G 17OwnedApplications7ForeignO10DependencyV AA6ClientV", i32 0, i32 4) to i64)) to i32), [1 x i8] c"G", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@11 = private constant [13 x i8] c"foreignOwner\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic _____y_____GSg 17OwnedApplications10DependencyV AA6ClientV" = linkonce_odr hidden constant <{ i8, i32, [1 x i8], i8, i32, [3 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [3 x i8], i8 }>, ptr @"symbolic _____y_____GSg 17OwnedApplications10DependencyV AA6ClientV", i32 0, i32 1) to i64)) to i32), [1 x i8] c"y", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [3 x i8], i8 }>, ptr @"symbolic _____y_____GSg 17OwnedApplications10DependencyV AA6ClientV", i32 0, i32 4) to i64)) to i32), [3 x i8] c"GSg", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@12 = private constant [9 x i8] c"optional\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic _____yAAy_____GG 17OwnedApplications10DependencyV AA6ClientV" = linkonce_odr hidden constant <{ i8, i32, [4 x i8], i8, i32, [2 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [4 x i8], i8, i32, [2 x i8], i8 }>, ptr @"symbolic _____yAAy_____GG 17OwnedApplications10DependencyV AA6ClientV", i32 0, i32 1) to i64)) to i32), [4 x i8] c"yAAy", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [4 x i8], i8, i32, [2 x i8], i8 }>, ptr @"symbolic _____yAAy_____GG 17OwnedApplications10DependencyV AA6ClientV", i32 0, i32 4) to i64)) to i32), [2 x i8] c"GG", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@13 = private constant [7 x i8] c"nested\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic _____ySbG 17OwnedApplications11ConstrainedV" = linkonce_odr hidden constant <{ i8, i32, [4 x i8], i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications11ConstrainedVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [4 x i8], i8 }>, ptr @"symbolic _____ySbG 17OwnedApplications11ConstrainedV", i32 0, i32 1) to i64)) to i32), [4 x i8] c"ySbG", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@14 = private constant [12 x i8] c"constrained\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s17OwnedApplications4RootVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 17OwnedApplications4RootV" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications4RootVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 9, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y_____G 17OwnedApplications10DependencyV AA6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @6 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 7) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ySbG 17OwnedApplications10DependencyV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 9) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @7 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 10) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ySb_____G 17OwnedApplications4PairV AA6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 12) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @8 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 13) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y_____G 17OwnedApplications10DependencyV AA7SettingO" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 15) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @9 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 16) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y_____G 17OwnedApplications10DependencyV AA7ForeignO6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 18) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @10 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 19) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y______G 17OwnedApplications7ForeignO10DependencyV AA6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 21) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @11 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 22) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y_____GSg 17OwnedApplications10DependencyV AA6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 24) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @12 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 25) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____yAAy_____GG 17OwnedApplications10DependencyV AA6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 27) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @13 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 28) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ySbG 17OwnedApplications11ConstrainedV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 30) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @14 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s17OwnedApplications4RootVMF", i32 0, i32 31) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s17OwnedApplications7SettingOSQAAHc" = private constant i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOSQAAMc" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOSQAAHc" to i64)) to i32), section "__TEXT, __swift5_proto, regular", no_sanitize_address, align 4
@"$s17OwnedApplications7SettingOSHAAHc" = private constant i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOSHAAMc" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOSHAAHc" to i64)) to i32), section "__TEXT, __swift5_proto, regular", no_sanitize_address, align 4
@"$s17OwnedApplications7SettingOHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOMn" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications7SettingOHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedApplications6ClientVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications6ClientVMn" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications6ClientVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedApplications10DependencyVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVMn" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications10DependencyVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedApplications4PairVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4PairVMn" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications4PairVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedApplications11ConstrainedVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications11ConstrainedVMn" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications11ConstrainedVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedApplications7ForeignOHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignOMn" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignOHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedApplications7ForeignO6ClientVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO6ClientVMn" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO6ClientVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedApplications7ForeignO10DependencyVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO10DependencyVMn" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications7ForeignO10DependencyVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s17OwnedApplications4RootVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s17OwnedApplications4RootVMn" to i64), i64 ptrtoint (ptr @"$s17OwnedApplications4RootVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@__swift_reflection_version = linkonce_odr hidden constant i16 3
@llvm.used = appending global [99 x ptr] [ptr @"$s17OwnedApplications10DependencyV5valuexvM", ptr @"$s17OwnedApplications10DependencyV5valuexvg", ptr @"$s17OwnedApplications10DependencyV5valuexvs", ptr @"$s17OwnedApplications10DependencyVHn", ptr @"$s17OwnedApplications10DependencyVMF", ptr @"$s17OwnedApplications10DependencyVMa", ptr @"$s17OwnedApplications10DependencyVMn", ptr @"$s17OwnedApplications11ConstrainedV5valuexvM", ptr @"$s17OwnedApplications11ConstrainedV5valuexvg", ptr @"$s17OwnedApplications11ConstrainedV5valuexvs", ptr @"$s17OwnedApplications11ConstrainedVHn", ptr @"$s17OwnedApplications11ConstrainedVMF", ptr @"$s17OwnedApplications11ConstrainedVMa", ptr @"$s17OwnedApplications11ConstrainedVMn", ptr @"$s17OwnedApplications4PairV5firstxvM", ptr @"$s17OwnedApplications4PairV5firstxvg", ptr @"$s17OwnedApplications4PairV5firstxvs", ptr @"$s17OwnedApplications4PairV6secondq_vM", ptr @"$s17OwnedApplications4PairV6secondq_vg", ptr @"$s17OwnedApplications4PairV6secondq_vs", ptr @"$s17OwnedApplications4PairVHn", ptr @"$s17OwnedApplications4PairVMF", ptr @"$s17OwnedApplications4PairVMa", ptr @"$s17OwnedApplications4PairVMn", ptr @"$s17OwnedApplications4RootV11constrainedAA11ConstrainedVySbGvM", ptr @"$s17OwnedApplications4RootV11constrainedAA11ConstrainedVySbGvg", ptr @"$s17OwnedApplications4RootV11constrainedAA11ConstrainedVySbGvs", ptr @"$s17OwnedApplications4RootV12enumArgumentAA10DependencyVyAA7SettingOGvM", ptr @"$s17OwnedApplications4RootV12enumArgumentAA10DependencyVyAA7SettingOGvg", ptr @"$s17OwnedApplications4RootV12enumArgumentAA10DependencyVyAA7SettingOGvs", ptr @"$s17OwnedApplications4RootV12foreignOwnerAA7ForeignO10DependencyVy_AA6ClientVGvM", ptr @"$s17OwnedApplications4RootV12foreignOwnerAA7ForeignO10DependencyVy_AA6ClientVGvg", ptr @"$s17OwnedApplications4RootV12foreignOwnerAA7ForeignO10DependencyVy_AA6ClientVGvs", ptr @"$s17OwnedApplications4RootV15foreignArgumentAA10DependencyVyAA7ForeignO6ClientVGvM", ptr @"$s17OwnedApplications4RootV15foreignArgumentAA10DependencyVyAA7ForeignO6ClientVGvg", ptr @"$s17OwnedApplications4RootV15foreignArgumentAA10DependencyVyAA7ForeignO6ClientVGvs", ptr @"$s17OwnedApplications4RootV4pairAA4PairVySbAA6ClientVGvM", ptr @"$s17OwnedApplications4RootV4pairAA4PairVySbAA6ClientVGvg", ptr @"$s17OwnedApplications4RootV4pairAA4PairVySbAA6ClientVGvs", ptr @"$s17OwnedApplications4RootV6clientAA10DependencyVyAA6ClientVGvM", ptr @"$s17OwnedApplications4RootV6clientAA10DependencyVyAA6ClientVGvg", ptr @"$s17OwnedApplications4RootV6clientAA10DependencyVyAA6ClientVGvs", ptr @"$s17OwnedApplications4RootV6nestedAA10DependencyVyAFyAA6ClientVGGvM", ptr @"$s17OwnedApplications4RootV6nestedAA10DependencyVyAFyAA6ClientVGGvg", ptr @"$s17OwnedApplications4RootV6nestedAA10DependencyVyAFyAA6ClientVGGvs", ptr @"$s17OwnedApplications4RootV7booleanAA10DependencyVySbGvM", ptr @"$s17OwnedApplications4RootV7booleanAA10DependencyVySbGvg", ptr @"$s17OwnedApplications4RootV7booleanAA10DependencyVySbGvs", ptr @"$s17OwnedApplications4RootV8optionalAA10DependencyVyAA6ClientVGSgvM", ptr @"$s17OwnedApplications4RootV8optionalAA10DependencyVyAA6ClientVGSgvg", ptr @"$s17OwnedApplications4RootV8optionalAA10DependencyVyAA6ClientVGSgvpfi", ptr @"$s17OwnedApplications4RootV8optionalAA10DependencyVyAA6ClientVGSgvs", ptr @"$s17OwnedApplications4RootVHn", ptr @"$s17OwnedApplications4RootVMF", ptr @"$s17OwnedApplications4RootVMa", ptr @"$s17OwnedApplications4RootVMn", ptr @"$s17OwnedApplications4RootVN", ptr @"$s17OwnedApplications6ClientV4flagSbvM", ptr @"$s17OwnedApplications6ClientV4flagSbvg", ptr @"$s17OwnedApplications6ClientV4flagSbvs", ptr @"$s17OwnedApplications6ClientVHn", ptr @"$s17OwnedApplications6ClientVMF", ptr @"$s17OwnedApplications6ClientVMa", ptr @"$s17OwnedApplications6ClientVMn", ptr @"$s17OwnedApplications6ClientVN", ptr @"$s17OwnedApplications7ForeignO10DependencyV5valuexvM", ptr @"$s17OwnedApplications7ForeignO10DependencyV5valuexvg", ptr @"$s17OwnedApplications7ForeignO10DependencyV5valuexvs", ptr @"$s17OwnedApplications7ForeignO10DependencyVHn", ptr @"$s17OwnedApplications7ForeignO10DependencyVMF", ptr @"$s17OwnedApplications7ForeignO10DependencyVMa", ptr @"$s17OwnedApplications7ForeignO10DependencyVMn", ptr @"$s17OwnedApplications7ForeignO6ClientV5otherSuvM", ptr @"$s17OwnedApplications7ForeignO6ClientV5otherSuvg", ptr @"$s17OwnedApplications7ForeignO6ClientV5otherSuvs", ptr @"$s17OwnedApplications7ForeignO6ClientVHn", ptr @"$s17OwnedApplications7ForeignO6ClientVMF", ptr @"$s17OwnedApplications7ForeignO6ClientVMa", ptr @"$s17OwnedApplications7ForeignO6ClientVMn", ptr @"$s17OwnedApplications7ForeignO6ClientVN", ptr @"$s17OwnedApplications7ForeignOHn", ptr @"$s17OwnedApplications7ForeignOMF", ptr @"$s17OwnedApplications7ForeignOMa", ptr @"$s17OwnedApplications7ForeignOMn", ptr @"$s17OwnedApplications7ForeignON", ptr @"$s17OwnedApplications7SettingO21__derived_enum_equalsySbAC_ACtFZ", ptr @"$s17OwnedApplications7SettingO4hash4intoys6HasherVz_tF", ptr @"$s17OwnedApplications7SettingO9hashValueSivg", ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV", ptr @"$s17OwnedApplications7SettingOHn", ptr @"$s17OwnedApplications7SettingOMF", ptr @"$s17OwnedApplications7SettingOMa", ptr @"$s17OwnedApplications7SettingOMn", ptr @"$s17OwnedApplications7SettingON", ptr @"$s17OwnedApplications7SettingOSHAAHc", ptr @"$s17OwnedApplications7SettingOSHAAMc", ptr @"$s17OwnedApplications7SettingOSQAAHc", ptr @"$s17OwnedApplications7SettingOSQAAMc", ptr @__swift_reflection_version], section "llvm.metadata"

@"$s17OwnedApplications6ClientV4flagSbvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications10DependencyV5valuexvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications4PairV5firstxvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications4PairV6secondq_vpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications11ConstrainedV5valuexvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications7ForeignO6ClientV5otherSuvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications7ForeignO10DependencyV5valuexvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications4RootV6clientAA10DependencyVyAA6ClientVGvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications4RootV7booleanAA10DependencyVySbGvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications4RootV4pairAA4PairVySbAA6ClientVGvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications4RootV12enumArgumentAA10DependencyVyAA7SettingOGvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications4RootV15foreignArgumentAA10DependencyVyAA7ForeignO6ClientVGvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications4RootV12foreignOwnerAA7ForeignO10DependencyVy_AA6ClientVGvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications4RootV8optionalAA10DependencyVyAA6ClientVGSgvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications4RootV6nestedAA10DependencyVyAFyAA6ClientVGGvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications4RootV11constrainedAA11ConstrainedVySbGvpMV" = alias { i32 }, ptr @"$s17OwnedApplications7SettingO9hashValueSivpMV"
@"$s17OwnedApplications7SettingON" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr }>, ptr @"$s17OwnedApplications7SettingOMf", i32 0, i32 2)
@"$s17OwnedApplications6ClientVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s17OwnedApplications6ClientVMf", i32 0, i32 2)
@"$s17OwnedApplications7ForeignON" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr }>, ptr @"$s17OwnedApplications7ForeignOMf", i32 0, i32 2)
@"$s17OwnedApplications7ForeignO6ClientVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s17OwnedApplications7ForeignO6ClientVMf", i32 0, i32 2)
@"$s17OwnedApplications4RootVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32, i32, i32, i32, i32, i32, i32, i32, [4 x i8] }>, ptr @"$s17OwnedApplications4RootVMf", i32 0, i32 2)

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i1 @"$s17OwnedApplications7SettingO21__derived_enum_equalsySbAC_ACtFZ"(i8 %0, i8 %1) #0 {
entry:
  %2 = icmp eq i8 %0, %1
  ret i1 %2
}

define swiftcc void @"$s17OwnedApplications7SettingO4hash4intoys6HasherVz_tF"(ptr captures(none) dereferenceable(72) %0, i8 %1) #1 {
entry:
  %2 = zext i8 %1 to i64
  tail call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %2, ptr nonnull swiftself captures(none) dereferenceable(72) %0)
  ret void
}

declare swiftcc void @"$ss6HasherV8_combineyySuF"(i64, ptr swiftself captures(none) dereferenceable(72)) local_unnamed_addr #1

define swiftcc i64 @"$s17OwnedApplications7SettingO9hashValueSivg"(i8 %0) #1 {
entry:
  %1 = alloca %Ts6HasherV, align 8
  call void @llvm.lifetime.start.p0(i64 72, ptr nonnull %1)
  call swiftcc void @"$ss6HasherV5_seedABSi_tcfC"(ptr noalias nonnull sret(%Ts6HasherV) captures(none) %1, i64 0)
  %2 = zext i8 %0 to i64
  call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %2, ptr nonnull swiftself captures(none) dereferenceable(72) %1)
  %3 = call swiftcc i64 @"$ss6HasherV9_finalizeSiyF"(ptr nonnull swiftself captures(none) dereferenceable(72) %1)
  call void @llvm.lifetime.end.p0(i64 72, ptr nonnull %1)
  ret i64 %3
}

; Function Attrs: mustprogress nocallback nofree nosync nounwind willreturn memory(argmem: readwrite)
declare void @llvm.lifetime.start.p0(i64 immarg, ptr captures(none)) #2

declare swiftcc void @"$ss6HasherV5_seedABSi_tcfC"(ptr noalias sret(%Ts6HasherV) captures(none), i64) local_unnamed_addr #1

; Function Attrs: mustprogress nocallback nofree nounwind willreturn memory(argmem: readwrite)
declare void @llvm.memcpy.p0.p0.i64(ptr noalias writeonly captures(none), ptr noalias readonly captures(none), i64, i1 immarg) #3

declare swiftcc i64 @"$ss6HasherV9_finalizeSiyF"(ptr swiftself captures(none) dereferenceable(72)) local_unnamed_addr #1

; Function Attrs: mustprogress nocallback nofree nosync nounwind willreturn memory(argmem: readwrite)
declare void @llvm.lifetime.end.p0(i64 immarg, ptr captures(none)) #2

define linkonce_odr hidden swiftcc i1 @"$s17OwnedApplications7SettingOSQAASQ2eeoiySbx_xtFZTW"(ptr noalias captures(none) dereferenceable(1) %0, ptr noalias captures(none) dereferenceable(1) %1, ptr swiftself %2, ptr %Self, ptr %SelfWitnessTable) #1 {
entry:
  %3 = load i8, ptr %0, align 1
  %4 = load i8, ptr %1, align 1
  %5 = icmp eq i8 %3, %4
  ret i1 %5
}

define linkonce_odr hidden swiftcc i64 @"$s17OwnedApplications7SettingOSHAASH9hashValueSivgTW"(ptr noalias swiftself captures(none) dereferenceable(1) %0, ptr %Self, ptr %SelfWitnessTable) #1 {
entry:
  %1 = alloca %Ts6HasherV, align 8
  %2 = load i8, ptr %0, align 1
  call void @llvm.lifetime.start.p0(i64 72, ptr nonnull %1)
  call swiftcc void @"$ss6HasherV5_seedABSi_tcfC"(ptr noalias nonnull sret(%Ts6HasherV) captures(none) %1, i64 0) #20
  %3 = zext i8 %2 to i64
  call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %3, ptr nonnull swiftself captures(none) dereferenceable(72) %1) #20
  %4 = call swiftcc i64 @"$ss6HasherV9_finalizeSiyF"(ptr nonnull swiftself captures(none) dereferenceable(72) %1) #20
  call void @llvm.lifetime.end.p0(i64 72, ptr nonnull %1)
  ret i64 %4
}

define linkonce_odr hidden swiftcc void @"$s17OwnedApplications7SettingOSHAASH4hash4intoys6HasherVz_tFTW"(ptr captures(none) dereferenceable(72) %0, ptr noalias swiftself captures(none) dereferenceable(1) %1, ptr %Self, ptr %SelfWitnessTable) #1 {
entry:
  %2 = load i8, ptr %1, align 1
  %3 = zext i8 %2 to i64
  tail call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %3, ptr nonnull swiftself captures(none) dereferenceable(72) %0) #20
  ret void
}

define linkonce_odr hidden swiftcc i64 @"$s17OwnedApplications7SettingOSHAASH13_rawHashValue4seedS2i_tFTW"(i64 %0, ptr noalias swiftself captures(none) dereferenceable(1) %1, ptr %Self, ptr %SelfWitnessTable) #1 {
entry:
  %2 = alloca %Ts6HasherV, align 8
  %3 = load i8, ptr %1, align 1
  call void @llvm.lifetime.start.p0(i64 72, ptr nonnull %2)
  call swiftcc void @"$ss6HasherV5_seedABSi_tcfC"(ptr noalias nonnull sret(%Ts6HasherV) captures(none) %2, i64 %0) #20
  %4 = zext i8 %3 to i64
  call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %4, ptr nonnull swiftself captures(none) dereferenceable(72) %2) #20
  %5 = call swiftcc i64 @"$ss6HasherV9_finalizeSiyF"(ptr nonnull swiftself captures(none) dereferenceable(72) %2) #20
  call void @llvm.lifetime.end.p0(i64 72, ptr nonnull %2)
  ret i64 %5
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i1 @"$s17OwnedApplications6ClientV4flagSbvg"(i1 returned %0) #0 {
entry:
  ret i1 %0
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedApplications6ClientV4flagSbvs"(i1 %0, ptr swiftself writeonly captures(none) dereferenceable(1) initializes((0, 1)) %1) #4 {
entry:
  %2 = zext i1 %0 to i8
  store i8 %2, ptr %1, align 1
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications6ClientV4flagSbvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(1) %1) #5 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications6ClientV4flagSbvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications6ClientV4flagSbvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

define swiftcc void @"$s17OwnedApplications10DependencyV5valuexvg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %"Dependency<Value>", ptr noalias swiftself %1) #1 {
entry:
  %2 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %3, align 8, !invariant.load !17, !dereferenceable !18
  %4 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %4, align 8, !invariant.load !17
  %5 = tail call ptr %InitializeWithCopy(ptr noalias %0, ptr noalias %1, ptr %Value) #16
  ret void
}

define swiftcc void @"$s17OwnedApplications10DependencyV5valuexvs"(ptr noalias %0, ptr readonly captures(none) %"Dependency<Value>", ptr swiftself %1) #1 {
entry:
  %2 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %3, align 8, !invariant.load !17, !dereferenceable !18
  %4 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 40
  %AssignWithTake = load ptr, ptr %4, align 8, !invariant.load !17
  %5 = tail call ptr %AssignWithTake(ptr noalias %1, ptr noalias %0, ptr %Value) #16
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications10DependencyV5valuexvM"(ptr noalias dereferenceable(32) %0, ptr readnone captures(none) %"Dependency<Value>", ptr swiftself %1) #5 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications10DependencyV5valuexvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications10DependencyV5valuexvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications4PairV5firstxvM"(ptr noalias dereferenceable(32) %0, ptr readnone captures(none) %"Pair<First, Second>", ptr swiftself %1) #5 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications4PairV5firstxvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications4PairV5firstxvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

define swiftcc void @"$s17OwnedApplications4PairV6secondq_vg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %"Pair<First, Second>", ptr noalias swiftself %1) #1 {
entry:
  %2 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 36
  %3 = load i32, ptr %2, align 8
  %4 = sext i32 %3 to i64
  %5 = getelementptr inbounds i8, ptr %1, i64 %4
  %6 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 24
  %Second = load ptr, ptr %6, align 8, !invariant.load !17
  %7 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %7, align 8, !invariant.load !17, !dereferenceable !18
  %8 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %8, align 8, !invariant.load !17
  %9 = tail call ptr %InitializeWithCopy(ptr noalias %0, ptr noalias %5, ptr %Second) #16
  ret void
}

define swiftcc void @"$s17OwnedApplications4PairV6secondq_vs"(ptr noalias %0, ptr readonly captures(none) %"Pair<First, Second>", ptr swiftself %1) #1 {
entry:
  %2 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 36
  %3 = load i32, ptr %2, align 8
  %4 = sext i32 %3 to i64
  %5 = getelementptr inbounds i8, ptr %1, i64 %4
  %6 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 24
  %Second = load ptr, ptr %6, align 8, !invariant.load !17
  %7 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %7, align 8, !invariant.load !17, !dereferenceable !18
  %8 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 40
  %AssignWithTake = load ptr, ptr %8, align 8, !invariant.load !17
  %9 = tail call ptr %AssignWithTake(ptr noalias %5, ptr noalias %0, ptr %Second) #16
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications4PairV6secondq_vM"(ptr noalias dereferenceable(32) %0, ptr readonly captures(none) %"Pair<First, Second>", ptr swiftself %1) #5 {
coro.return:
  %2 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 36
  %3 = load i32, ptr %2, align 8
  %4 = sext i32 %3 to i64
  %5 = getelementptr inbounds i8, ptr %1, i64 %4
  %6 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications4PairV6secondq_vM.resume.0", ptr poison }, ptr %5, 1
  ret { ptr, ptr } %6
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications4PairV6secondq_vM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications11ConstrainedV5valuexvM"(ptr noalias dereferenceable(32) %0, ptr readnone captures(none) %"Constrained<Value>", ptr swiftself %1) #5 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications11ConstrainedV5valuexvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications11ConstrainedV5valuexvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i64 @"$s17OwnedApplications7ForeignO6ClientV5otherSuvg"(i64 returned %0) #0 {
entry:
  ret i64 %0
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedApplications7ForeignO6ClientV5otherSuvs"(i64 %0, ptr swiftself writeonly captures(none) dereferenceable(8) initializes((0, 8)) %1) #4 {
entry:
  store i64 %0, ptr %1, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications7ForeignO6ClientV5otherSuvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(8) %1) #5 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications7ForeignO6ClientV5otherSuvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications7ForeignO6ClientV5otherSuvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications7ForeignO10DependencyV5valuexvM"(ptr noalias dereferenceable(32) %0, ptr readnone captures(none) %"Foreign.Dependency<Value>", ptr swiftself %1) #5 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications7ForeignO10DependencyV5valuexvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications7ForeignO10DependencyV5valuexvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i1 @"$s17OwnedApplications4RootV6clientAA10DependencyVyAA6ClientVGvg"(i64 %0, i64 %1, i32 %2) #0 {
entry:
  %3 = trunc i64 %0 to i1
  ret i1 %3
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedApplications4RootV6clientAA10DependencyVyAA6ClientVGvs"(i1 %0, ptr swiftself writeonly captures(none) dereferenceable(20) initializes((0, 1)) %1) #4 {
entry:
  %2 = zext i1 %0 to i8
  store i8 %2, ptr %1, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications4RootV6clientAA10DependencyVyAA6ClientVGvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(20) %1) #5 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications4RootV6clientAA10DependencyVyAA6ClientVGvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications4RootV6clientAA10DependencyVyAA6ClientVGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i1 @"$s17OwnedApplications4RootV7booleanAA10DependencyVySbGvg"(i64 %0, i64 %1, i32 %2) #0 {
entry:
  %3 = and i64 %0, 256
  %4 = icmp ne i64 %3, 0
  ret i1 %4
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedApplications4RootV7booleanAA10DependencyVySbGvs"(i1 %0, ptr swiftself writeonly captures(none) dereferenceable(20) initializes((1, 2)) %1) #4 {
entry:
  %.boolean = getelementptr inbounds nuw i8, ptr %1, i64 1
  %2 = zext i1 %0 to i8
  store i8 %2, ptr %.boolean, align 1
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications4RootV7booleanAA10DependencyVySbGvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(20) %1) #5 {
coro.return:
  %.boolean = getelementptr inbounds nuw i8, ptr %1, i64 1
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications4RootV7booleanAA10DependencyVySbGvM.resume.0", ptr poison }, ptr %.boolean, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications4RootV7booleanAA10DependencyVySbGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc range(i16 0, 258) i16 @"$s17OwnedApplications4RootV4pairAA4PairVySbAA6ClientVGvg"(i64 %0, i64 %1, i32 %2) #0 {
entry:
  %3 = lshr i64 %0, 16
  %4 = trunc i64 %3 to i16
  %temp-coercion.coerced1.sroa.0.0.insert.insert = and i16 %4, 257
  ret i16 %temp-coercion.coerced1.sroa.0.0.insert.insert
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedApplications4RootV4pairAA4PairVySbAA6ClientVGvs"(i16 %0, ptr swiftself writeonly captures(none) dereferenceable(20) initializes((2, 4)) %1) #4 {
entry:
  %.pair = getelementptr inbounds nuw i8, ptr %1, i64 2
  %2 = trunc i16 %0 to i8
  %3 = and i8 %2, 1
  store i8 %3, ptr %.pair, align 2
  %.pair.second = getelementptr inbounds nuw i8, ptr %1, i64 3
  %4 = lshr i16 %0, 8
  %5 = trunc nuw i16 %4 to i8
  %6 = and i8 %5, 1
  store i8 %6, ptr %.pair.second, align 1
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications4RootV4pairAA4PairVySbAA6ClientVGvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(20) %1) #5 {
coro.return:
  %.pair = getelementptr inbounds nuw i8, ptr %1, i64 2
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications4RootV4pairAA4PairVySbAA6ClientVGvM.resume.0", ptr poison }, ptr %.pair, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications4RootV4pairAA4PairVySbAA6ClientVGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i8 @"$s17OwnedApplications4RootV12enumArgumentAA10DependencyVyAA7SettingOGvg"(i64 %0, i64 %1, i32 %2) #0 {
entry:
  %temp-coercion.coerced.sroa.0.4.extract.shift = lshr i64 %0, 32
  %temp-coercion.coerced.sroa.0.4.extract.trunc = trunc i64 %temp-coercion.coerced.sroa.0.4.extract.shift to i8
  ret i8 %temp-coercion.coerced.sroa.0.4.extract.trunc
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedApplications4RootV12enumArgumentAA10DependencyVyAA7SettingOGvs"(i8 %0, ptr swiftself writeonly captures(none) dereferenceable(20) initializes((4, 5)) %1) #4 {
entry:
  %.enumArgument = getelementptr inbounds nuw i8, ptr %1, i64 4
  store i8 %0, ptr %.enumArgument, align 4
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications4RootV12enumArgumentAA10DependencyVyAA7SettingOGvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(20) %1) #5 {
coro.return:
  %.enumArgument = getelementptr inbounds nuw i8, ptr %1, i64 4
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications4RootV12enumArgumentAA10DependencyVyAA7SettingOGvM.resume.0", ptr poison }, ptr %.enumArgument, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications4RootV12enumArgumentAA10DependencyVyAA7SettingOGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i64 @"$s17OwnedApplications4RootV15foreignArgumentAA10DependencyVyAA7ForeignO6ClientVGvg"(i64 %0, i64 returned %1, i32 %2) #0 {
entry:
  ret i64 %1
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedApplications4RootV15foreignArgumentAA10DependencyVyAA7ForeignO6ClientVGvs"(i64 %0, ptr swiftself writeonly captures(none) dereferenceable(20) initializes((8, 16)) %1) #4 {
entry:
  %.foreignArgument = getelementptr inbounds nuw i8, ptr %1, i64 8
  store i64 %0, ptr %.foreignArgument, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications4RootV15foreignArgumentAA10DependencyVyAA7ForeignO6ClientVGvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(20) %1) #5 {
coro.return:
  %.foreignArgument = getelementptr inbounds nuw i8, ptr %1, i64 8
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications4RootV15foreignArgumentAA10DependencyVyAA7ForeignO6ClientVGvM.resume.0", ptr poison }, ptr %.foreignArgument, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications4RootV15foreignArgumentAA10DependencyVyAA7ForeignO6ClientVGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i1 @"$s17OwnedApplications4RootV12foreignOwnerAA7ForeignO10DependencyVy_AA6ClientVGvg"(i64 %0, i64 %1, i32 %2) #0 {
entry:
  %3 = trunc i32 %2 to i1
  ret i1 %3
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedApplications4RootV12foreignOwnerAA7ForeignO10DependencyVy_AA6ClientVGvs"(i1 %0, ptr swiftself writeonly captures(none) dereferenceable(20) initializes((16, 17)) %1) #4 {
entry:
  %.foreignOwner = getelementptr inbounds nuw i8, ptr %1, i64 16
  %2 = zext i1 %0 to i8
  store i8 %2, ptr %.foreignOwner, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications4RootV12foreignOwnerAA7ForeignO10DependencyVy_AA6ClientVGvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(20) %1) #5 {
coro.return:
  %.foreignOwner = getelementptr inbounds nuw i8, ptr %1, i64 16
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications4RootV12foreignOwnerAA7ForeignO10DependencyVy_AA6ClientVGvM.resume.0", ptr poison }, ptr %.foreignOwner, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications4RootV12foreignOwnerAA7ForeignO10DependencyVy_AA6ClientVGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc noundef i8 @"$s17OwnedApplications4RootV8optionalAA10DependencyVyAA6ClientVGSgvpfi"() #0 {
entry:
  ret i8 2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i8 @"$s17OwnedApplications4RootV8optionalAA10DependencyVyAA6ClientVGSgvg"(i64 %0, i64 %1, i32 %2) #0 {
entry:
  %temp-coercion.coerced.sroa.4.17.extract.shift = lshr i32 %2, 8
  %temp-coercion.coerced.sroa.4.17.extract.trunc = trunc i32 %temp-coercion.coerced.sroa.4.17.extract.shift to i8
  ret i8 %temp-coercion.coerced.sroa.4.17.extract.trunc
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedApplications4RootV8optionalAA10DependencyVyAA6ClientVGSgvs"(i8 %0, ptr swiftself writeonly captures(none) dereferenceable(20) initializes((17, 18)) %1) #4 {
entry:
  %.optional = getelementptr inbounds nuw i8, ptr %1, i64 17
  store i8 %0, ptr %.optional, align 1
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications4RootV8optionalAA10DependencyVyAA6ClientVGSgvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(20) %1) #5 {
coro.return:
  %.optional = getelementptr inbounds nuw i8, ptr %1, i64 17
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications4RootV8optionalAA10DependencyVyAA6ClientVGSgvM.resume.0", ptr poison }, ptr %.optional, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications4RootV8optionalAA10DependencyVyAA6ClientVGSgvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i1 @"$s17OwnedApplications4RootV6nestedAA10DependencyVyAFyAA6ClientVGGvg"(i64 %0, i64 %1, i32 %2) #0 {
entry:
  %3 = and i32 %2, 65536
  %4 = icmp ne i32 %3, 0
  ret i1 %4
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedApplications4RootV6nestedAA10DependencyVyAFyAA6ClientVGGvs"(i1 %0, ptr swiftself writeonly captures(none) dereferenceable(20) initializes((18, 19)) %1) #4 {
entry:
  %.nested = getelementptr inbounds nuw i8, ptr %1, i64 18
  %2 = zext i1 %0 to i8
  store i8 %2, ptr %.nested, align 2
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications4RootV6nestedAA10DependencyVyAFyAA6ClientVGGvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(20) %1) #5 {
coro.return:
  %.nested = getelementptr inbounds nuw i8, ptr %1, i64 18
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications4RootV6nestedAA10DependencyVyAFyAA6ClientVGGvM.resume.0", ptr poison }, ptr %.nested, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications4RootV6nestedAA10DependencyVyAFyAA6ClientVGGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i1 @"$s17OwnedApplications4RootV11constrainedAA11ConstrainedVySbGvg"(i64 %0, i64 %1, i32 %2) #0 {
entry:
  %3 = and i32 %2, 16777216
  %4 = icmp ne i32 %3, 0
  ret i1 %4
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s17OwnedApplications4RootV11constrainedAA11ConstrainedVySbGvs"(i1 %0, ptr swiftself writeonly captures(none) dereferenceable(20) initializes((19, 20)) %1) #4 {
entry:
  %.constrained = getelementptr inbounds nuw i8, ptr %1, i64 19
  %2 = zext i1 %0 to i8
  store i8 %2, ptr %.constrained, align 1
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s17OwnedApplications4RootV11constrainedAA11ConstrainedVySbGvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(20) %1) #5 {
coro.return:
  %.constrained = getelementptr inbounds nuw i8, ptr %1, i64 19
  %2 = insertvalue { ptr, ptr } { ptr @"$s17OwnedApplications4RootV11constrainedAA11ConstrainedVySbGvM.resume.0", ptr poison }, ptr %.constrained, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s17OwnedApplications4RootV11constrainedAA11ConstrainedVySbGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: nofree nosync nounwind memory(none)
define internal swiftcc ptr @"$s17OwnedApplications7SettingOSHAASQWb"(ptr readnone captures(none) %Setting, ptr readnone captures(none) %Setting1, ptr readnone captures(none) %Setting.Hashable) #6 {
entry:
  %0 = tail call ptr @"$s17OwnedApplications7SettingOACSQAAWl"() #21
  ret ptr %0
}

; Function Attrs: nofree noinline nosync nounwind memory(none)
define linkonce_odr hidden ptr @"$s17OwnedApplications7SettingOACSQAAWl"() local_unnamed_addr #7 {
entry:
  %0 = load ptr, ptr @"$s17OwnedApplications7SettingOACSQAAWL", align 8
  %1 = icmp eq ptr %0, null
  br i1 %1, label %cacheIsNull, label %cont

cacheIsNull:                                      ; preds = %entry
  %2 = tail call ptr @swift_getWitnessTable(ptr nonnull @"$s17OwnedApplications7SettingOSQAAMc", ptr nonnull getelementptr inbounds nuw (i8, ptr @"$s17OwnedApplications7SettingOMf", i64 16), ptr undef) #22
  store atomic ptr %2, ptr @"$s17OwnedApplications7SettingOACSQAAWL" release, align 8
  br label %cont

cont:                                             ; preds = %cacheIsNull, %entry
  %3 = phi ptr [ %0, %entry ], [ %2, %cacheIsNull ]
  ret ptr %3
}

; Function Attrs: nofree nounwind memory(read)
declare ptr @swift_getWitnessTable(ptr, ptr, ptr) local_unnamed_addr #8

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy1_1(ptr %0, ptr %1, ptr %2) #9 {
entry:
  %3 = load i8, ptr %1, align 1
  store i8 %3, ptr %0, align 1
  ret ptr %0
}

; Function Attrs: nounwind
define linkonce_odr hidden void @__swift_noop_void_return(ptr %0, ptr %1) #9 {
entry:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s17OwnedApplications7SettingOwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Setting) #10 {
entry:
  %0 = icmp eq i32 %numEmptyCases, 0
  br i1 %0, label %34, label %1

1:                                                ; preds = %entry
  %2 = icmp ugt i32 %numEmptyCases, 253
  br i1 %2, label %3, label %28

3:                                                ; preds = %1
  %4 = add i32 %numEmptyCases, 2
  %5 = icmp ult i32 %4, 65280
  %6 = icmp ult i32 %4, 16776960
  %7 = select i1 %6, i32 2, i32 4
  %8 = select i1 %5, i32 1, i32 %7
  %9 = getelementptr inbounds nuw i8, ptr %value, i64 1
  switch i32 %8, label %18 [
    i32 4, label %16
    i32 1, label %10
    i32 2, label %13
  ]

10:                                               ; preds = %3
  %11 = load i8, ptr %9, align 1
  %12 = zext i8 %11 to i32
  br label %19

13:                                               ; preds = %3
  %14 = load i16, ptr %9, align 1
  %15 = zext i16 %14 to i32
  br label %19

16:                                               ; preds = %3
  %17 = load i32, ptr %9, align 1
  br label %19

18:                                               ; preds = %3
  unreachable

19:                                               ; preds = %16, %13, %10
  %20 = phi i32 [ %12, %10 ], [ %15, %13 ], [ %17, %16 ]
  %21 = icmp eq i32 %20, 0
  br i1 %21, label %28, label %22

22:                                               ; preds = %19
  %23 = shl i32 %20, 8
  %24 = load i8, ptr %value, align 1
  %25 = zext i8 %24 to i32
  %26 = add i32 %23, -3
  %27 = add i32 %26, %25
  br label %34

28:                                               ; preds = %19, %1
  %29 = load i8, ptr %value, align 1
  %30 = zext i8 %29 to i32
  %31 = add nsw i32 %30, -3
  %32 = icmp ult i8 %29, 3
  %33 = select i1 %32, i32 -1, i32 %31
  br label %34

34:                                               ; preds = %entry, %28, %22
  %35 = phi i32 [ %33, %28 ], [ %27, %22 ], [ -1, %entry ]
  %36 = add i32 %35, 1
  ret i32 %36
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s17OwnedApplications7SettingOwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Setting) #4 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 1
  %1 = icmp ugt i32 %numEmptyCases, 253
  br i1 %1, label %2, label %8

2:                                                ; preds = %entry
  %3 = add i32 %numEmptyCases, 2
  %4 = icmp ult i32 %3, 65280
  %5 = icmp ult i32 %3, 16776960
  %6 = select i1 %5, i32 2, i32 4
  %7 = select i1 %4, i32 1, i32 %6
  br label %8

8:                                                ; preds = %2, %entry
  %9 = phi i32 [ 0, %entry ], [ %7, %2 ]
  %10 = icmp ult i32 %whichCase, 254
  br i1 %10, label %11, label %21

11:                                               ; preds = %8
  switch i32 %9, label %15 [
    i32 0, label %16
    i32 1, label %12
    i32 2, label %13
    i32 4, label %14
  ]

12:                                               ; preds = %11
  store i8 0, ptr %0, align 1
  br label %16

13:                                               ; preds = %11
  store i16 0, ptr %0, align 1
  br label %16

14:                                               ; preds = %11
  store i32 0, ptr %0, align 1
  br label %16

15:                                               ; preds = %11
  unreachable

16:                                               ; preds = %11, %14, %13, %12
  %17 = icmp eq i32 %whichCase, 0
  br i1 %17, label %32, label %18

18:                                               ; preds = %16
  %19 = trunc nuw i32 %whichCase to i8
  %20 = add nuw i8 %19, 2
  store i8 %20, ptr %value, align 1
  br label %32

21:                                               ; preds = %8
  %22 = add i32 %whichCase, -254
  %23 = lshr i32 %22, 8
  %24 = add nuw nsw i32 %23, 1
  %25 = trunc i32 %22 to i8
  store i8 %25, ptr %value, align 1
  switch i32 %9, label %31 [
    i32 0, label %32
    i32 1, label %26
    i32 2, label %28
    i32 4, label %30
  ]

26:                                               ; preds = %21
  %27 = trunc i32 %24 to i8
  store i8 %27, ptr %0, align 1
  br label %32

28:                                               ; preds = %21
  %29 = trunc i32 %24 to i16
  store i16 %29, ptr %0, align 1
  br label %32

30:                                               ; preds = %21
  store i32 %24, ptr %0, align 1
  br label %32

31:                                               ; preds = %21
  unreachable

32:                                               ; preds = %26, %28, %30, %21, %18, %16
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal range(i32 0, 256) i32 @"$s17OwnedApplications7SettingOwug"(ptr noalias readonly captures(none) %value, ptr readnone captures(none) %Setting) #10 {
entry:
  %0 = load i8, ptr %value, align 1
  %1 = zext i8 %0 to i32
  ret i32 %1
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal void @"$s17OwnedApplications7SettingOwup"(ptr noalias readnone captures(none) %value, ptr readnone captures(none) %Setting) #0 {
entry:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s17OwnedApplications7SettingOwui"(ptr noalias writeonly captures(none) initializes((0, 1)) %value, i32 %tag, ptr readnone captures(none) %Setting) #4 {
entry:
  %0 = trunc i32 %tag to i8
  store i8 %0, ptr %value, align 1
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedApplications7SettingOMa"(i64 %0) #11 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr }>, ptr @"$s17OwnedApplications7SettingOMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s17OwnedApplications6ClientVwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Client) #10 {
entry:
  %0 = icmp eq i32 %numEmptyCases, 0
  br i1 %0, label %38, label %1

1:                                                ; preds = %entry
  %2 = icmp ugt i32 %numEmptyCases, 254
  br i1 %2, label %3, label %28

3:                                                ; preds = %1
  %4 = add i32 %numEmptyCases, 1
  %5 = icmp ult i32 %4, 65280
  %6 = icmp ult i32 %4, 16776960
  %7 = select i1 %6, i32 2, i32 4
  %8 = select i1 %5, i32 1, i32 %7
  %9 = getelementptr inbounds nuw i8, ptr %value, i64 1
  switch i32 %8, label %18 [
    i32 4, label %16
    i32 1, label %10
    i32 2, label %13
  ]

10:                                               ; preds = %3
  %11 = load i8, ptr %9, align 1
  %12 = zext i8 %11 to i32
  br label %19

13:                                               ; preds = %3
  %14 = load i16, ptr %9, align 1
  %15 = zext i16 %14 to i32
  br label %19

16:                                               ; preds = %3
  %17 = load i32, ptr %9, align 1
  br label %19

18:                                               ; preds = %3
  unreachable

19:                                               ; preds = %16, %13, %10
  %20 = phi i32 [ %12, %10 ], [ %15, %13 ], [ %17, %16 ]
  %21 = icmp eq i32 %20, 0
  br i1 %21, label %28, label %22

22:                                               ; preds = %19
  %23 = shl i32 %20, 8
  %24 = load i8, ptr %value, align 1
  %25 = zext i8 %24 to i32
  %26 = add i32 %23, -2
  %27 = add i32 %26, %25
  br label %38

28:                                               ; preds = %19, %1
  %29 = load i8, ptr %value, align 1
  %30 = icmp ult i8 %29, 2
  br i1 %30, label %38, label %31

31:                                               ; preds = %28
  %32 = zext i8 %29 to i31
  %33 = and i31 %32, 1
  %34 = and i31 %32, 254
  %35 = add nsw i31 %34, -2
  %36 = or disjoint i31 %35, %33
  %37 = zext nneg i31 %36 to i32
  br label %38

38:                                               ; preds = %entry, %28, %31, %22
  %39 = phi i32 [ %27, %22 ], [ -1, %28 ], [ %37, %31 ], [ -1, %entry ]
  %40 = add i32 %39, 1
  ret i32 %40
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s17OwnedApplications6ClientVwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Client) #4 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 1
  %1 = icmp ugt i32 %numEmptyCases, 254
  br i1 %1, label %2, label %8

2:                                                ; preds = %entry
  %3 = add i32 %numEmptyCases, 1
  %4 = icmp ult i32 %3, 65280
  %5 = icmp ult i32 %3, 16776960
  %6 = select i1 %5, i32 2, i32 4
  %7 = select i1 %4, i32 1, i32 %6
  br label %8

8:                                                ; preds = %2, %entry
  %9 = phi i32 [ 0, %entry ], [ %7, %2 ]
  %10 = icmp ult i32 %whichCase, 255
  br i1 %10, label %11, label %25

11:                                               ; preds = %8
  switch i32 %9, label %15 [
    i32 0, label %16
    i32 1, label %12
    i32 2, label %13
    i32 4, label %14
  ]

12:                                               ; preds = %11
  store i8 0, ptr %0, align 1
  br label %16

13:                                               ; preds = %11
  store i16 0, ptr %0, align 1
  br label %16

14:                                               ; preds = %11
  store i32 0, ptr %0, align 1
  br label %16

15:                                               ; preds = %11
  unreachable

16:                                               ; preds = %11, %14, %13, %12
  %17 = icmp eq i32 %whichCase, 0
  br i1 %17, label %36, label %18

18:                                               ; preds = %16
  %19 = trunc nuw i32 %whichCase to i8
  %20 = add i8 %19, -1
  %21 = and i8 %20, 1
  %22 = and i8 %20, -2
  %23 = add nuw i8 %22, 2
  %24 = or disjoint i8 %23, %21
  store i8 %24, ptr %value, align 1
  br label %36

25:                                               ; preds = %8
  %26 = add i32 %whichCase, -255
  %27 = lshr i32 %26, 8
  %28 = add nuw nsw i32 %27, 1
  %29 = trunc i32 %26 to i8
  store i8 %29, ptr %value, align 1
  switch i32 %9, label %35 [
    i32 0, label %36
    i32 1, label %30
    i32 2, label %32
    i32 4, label %34
  ]

30:                                               ; preds = %25
  %31 = trunc i32 %28 to i8
  store i8 %31, ptr %0, align 1
  br label %36

32:                                               ; preds = %25
  %33 = trunc i32 %28 to i16
  store i16 %33, ptr %0, align 1
  br label %36

34:                                               ; preds = %25
  store i32 %28, ptr %0, align 1
  br label %36

35:                                               ; preds = %25
  unreachable

36:                                               ; preds = %30, %32, %34, %25, %18, %16
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedApplications6ClientVMa"(i64 %0) #11 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s17OwnedApplications6ClientVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications10DependencyVMi"(ptr %0, ptr %1, ptr %2) #9 {
entry:
  %3 = tail call ptr @swift_allocateGenericValueMetadata(ptr %0, ptr %1, ptr %2, i64 16) #16
  ret ptr %3
}

; Function Attrs: nounwind
define internal swiftcc %swift.metadata_response @"$s17OwnedApplications10DependencyVMr"(ptr %"Dependency<Value>", ptr readnone captures(none) %0, ptr readnone captures(none) %1) #9 {
  %3 = tail call swiftcc %swift.metadata_response @"$s17OwnedApplications10DependencyVMrTm"(ptr %"Dependency<Value>", ptr readnone captures(none) %0, ptr readnone captures(none) %1) #9
  ret %swift.metadata_response %3
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications10DependencyVwCP"(ptr noalias %dest, ptr noalias %src, ptr readonly captures(none) %"Dependency<Value>") #9 {
  %1 = tail call ptr @"$s17OwnedApplications10DependencyVwCPTm"(ptr noalias %dest, ptr noalias %src, ptr readonly captures(none) %"Dependency<Value>") #9
  ret ptr %1
}

; Function Attrs: mustprogress nounwind willreturn
declare ptr @swift_retain(ptr returned) local_unnamed_addr #12

; Function Attrs: nounwind
define internal void @"$s17OwnedApplications10DependencyVwxx"(ptr noalias %object, ptr readonly captures(none) %"Dependency<Value>") #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 8
  %Destroy = load ptr, ptr %2, align 8, !invariant.load !17
  tail call void %Destroy(ptr noalias %object, ptr %Value) #16
  ret void
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications10DependencyVwcp"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Dependency<Value>") #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr %Value) #16
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications10DependencyVwca"(ptr returned %dest, ptr %src, ptr readonly captures(none) %"Dependency<Value>") #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 24
  %AssignWithCopy = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %AssignWithCopy(ptr %dest, ptr %src, ptr %Value) #16
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications10DependencyVwtk"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Dependency<Value>") #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 32
  %InitializeWithTake = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %InitializeWithTake(ptr noalias %dest, ptr noalias %src, ptr %Value) #16
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications10DependencyVwta"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Dependency<Value>") #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Dependency<Value>", i64 16
  %Value = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 40
  %AssignWithTake = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %AssignWithTake(ptr noalias %dest, ptr noalias %src, ptr %Value) #16
  ret ptr %dest
}

; Function Attrs: nofree nounwind memory(read)
define internal i32 @"$s17OwnedApplications10DependencyVwet"(ptr noalias readonly %value, i32 %numEmptyCases, ptr readonly captures(none) %"Dependency<Value>") #13 {
  %1 = tail call i32 @"$s17OwnedApplications10DependencyVwetTm"(ptr noalias readonly %value, i32 %numEmptyCases, ptr readonly captures(none) %"Dependency<Value>") #13
  ret i32 %1
}

; Function Attrs: nounwind
define internal void @"$s17OwnedApplications10DependencyVwst"(ptr noalias %value, i32 %whichCase, i32 %numEmptyCases, ptr readonly captures(none) %"Dependency<Value>") #9 {
  tail call void @"$s17OwnedApplications10DependencyVwstTm"(ptr noalias %value, i32 %whichCase, i32 %numEmptyCases, ptr readonly captures(none) %"Dependency<Value>") #9
  ret void
}

; Function Attrs: mustprogress nocallback nofree nounwind willreturn memory(argmem: write)
declare void @llvm.memset.p0.i32(ptr writeonly captures(none), i8, i32, i1 immarg) #14

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedApplications10DependencyVMa"(i64 %0, ptr readnone %1) #15 {
entry:
  %2 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr undef, ptr undef, ptr nonnull @"$s17OwnedApplications10DependencyVMn") #21
  ret %swift.metadata_response %2
}

; Function Attrs: nounwind
declare ptr @swift_allocateGenericValueMetadata(ptr, ptr, ptr, i64) local_unnamed_addr #16

; Function Attrs: mustprogress nofree nounwind willreturn memory(read)
declare swiftcc %swift.metadata_response @swift_checkMetadataState(i64, ptr) local_unnamed_addr #17

; Function Attrs: nounwind
declare void @swift_initStructMetadata(ptr, i64, i64, ptr, ptr) local_unnamed_addr #16

; Function Attrs: nounwind
define internal swiftcc %swift.metadata_response @"$s17OwnedApplications4PairVMr"(ptr %"Pair<First, Second>", ptr readnone captures(none) %0, ptr readnone captures(none) %1) #9 {
entry:
  %classFields = alloca [2 x ptr], align 8
  %2 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 32
  call void @llvm.lifetime.start.p0(i64 16, ptr nonnull %classFields)
  %3 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 16
  %First = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = tail call swiftcc %swift.metadata_response @swift_checkMetadataState(i64 319, ptr %First) #23
  %5 = extractvalue %swift.metadata_response %4, 0
  %6 = extractvalue %swift.metadata_response %4, 1
  %7 = icmp ult i64 %6, 64
  br i1 %7, label %dependency-satisfied, label %metadata-dependencies.cont

dependency-satisfied:                             ; preds = %entry
  %8 = getelementptr inbounds i8, ptr %5, i64 -8
  %.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %.valueWitnesses, i64 64
  store ptr %9, ptr %classFields, align 8
  %10 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 24
  %Second = load ptr, ptr %10, align 8, !invariant.load !17
  %11 = tail call swiftcc %swift.metadata_response @swift_checkMetadataState(i64 319, ptr %Second) #23
  %12 = extractvalue %swift.metadata_response %11, 0
  %13 = extractvalue %swift.metadata_response %11, 1
  %14 = icmp ult i64 %13, 64
  br i1 %14, label %dependency-satisfied1, label %metadata-dependencies.cont

dependency-satisfied1:                            ; preds = %dependency-satisfied
  %15 = getelementptr inbounds i8, ptr %12, i64 -8
  %.valueWitnesses2 = load ptr, ptr %15, align 8, !invariant.load !17, !dereferenceable !18
  %16 = getelementptr inbounds nuw i8, ptr %.valueWitnesses2, i64 64
  %17 = getelementptr inbounds nuw i8, ptr %classFields, i64 8
  store ptr %16, ptr %17, align 8
  call void @swift_initStructMetadata(ptr nonnull %"Pair<First, Second>", i64 0, i64 2, ptr nonnull %classFields, ptr nonnull %2) #16
  call void @llvm.lifetime.end.p0(i64 16, ptr nonnull %classFields)
  br label %metadata-dependencies.cont

metadata-dependencies.cont:                       ; preds = %dependency-satisfied1, %dependency-satisfied, %entry
  %18 = phi ptr [ %5, %entry ], [ %12, %dependency-satisfied ], [ null, %dependency-satisfied1 ]
  %19 = phi i64 [ 63, %entry ], [ 63, %dependency-satisfied ], [ 0, %dependency-satisfied1 ]
  %20 = insertvalue %swift.metadata_response undef, ptr %18, 0
  %21 = insertvalue %swift.metadata_response %20, i64 %19, 1
  ret %swift.metadata_response %21
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications4PairVwCP"(ptr noalias %dest, ptr noalias %src, ptr readonly captures(none) %"Pair<First, Second>") #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %2, align 8, !invariant.load !17
  %3 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 24
  %Second = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %4, align 8, !invariant.load !17, !dereferenceable !18
  %5 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %5, align 8, !invariant.load !17
  %6 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %6 to i64
  %7 = xor i64 %flags.alignmentMask, -1
  %8 = add i64 %size, %flags.alignmentMask
  %9 = and i64 %8, %7
  %10 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 64
  %size1 = load i64, ptr %10, align 8, !invariant.load !17
  %size2 = add i64 %9, %size1
  %11 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 80
  %flags3 = load i32, ptr %11, align 8, !invariant.load !17
  %12 = or i32 %flags3, %flags
  %alignment-mask7 = and i32 %12, 255
  %13 = and i32 %12, 1048576
  %14 = icmp eq i32 %13, 0
  %15 = icmp samesign ult i32 %alignment-mask7, 8
  %16 = icmp ult i64 %size2, 25
  %17 = and i1 %14, %16
  %18 = and i1 %15, %17
  br i1 %18, label %inlineBB, label %allocateBB

inlineBB:                                         ; preds = %entry
  %19 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %19, align 8, !invariant.load !17
  %20 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr nonnull %First) #16
  %21 = ptrtoint ptr %dest to i64
  %22 = ptrtoint ptr %src to i64
  %23 = add i64 %8, %21
  %24 = and i64 %23, %7
  %25 = inttoptr i64 %24 to ptr
  %26 = add i64 %8, %22
  %27 = and i64 %26, %7
  %28 = inttoptr i64 %27 to ptr
  %29 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 16
  %InitializeWithCopy6 = load ptr, ptr %29, align 8, !invariant.load !17
  %30 = tail call ptr %InitializeWithCopy6(ptr noalias %25, ptr noalias %28, ptr nonnull %Second) #16
  br label %37

allocateBB:                                       ; preds = %entry
  %alignment-mask = zext nneg i32 %alignment-mask7 to i64
  %31 = load ptr, ptr %src, align 8
  store ptr %31, ptr %dest, align 8
  %32 = add nuw nsw i64 %alignment-mask, 16
  %33 = xor i64 %alignment-mask, -1
  %34 = and i64 %32, %33
  %35 = getelementptr inbounds nuw i8, ptr %31, i64 %34
  %36 = tail call ptr @swift_retain(ptr returned %31) #24
  br label %37

37:                                               ; preds = %allocateBB, %inlineBB
  %38 = phi ptr [ %dest, %inlineBB ], [ %35, %allocateBB ]
  ret ptr %38
}

; Function Attrs: nounwind
define internal void @"$s17OwnedApplications4PairVwxx"(ptr noalias %object, ptr readonly captures(none) %"Pair<First, Second>") #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 8
  %Destroy = load ptr, ptr %2, align 8, !invariant.load !17
  tail call void %Destroy(ptr noalias %object, ptr %First) #16
  %3 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %3, align 8, !invariant.load !17
  %4 = ptrtoint ptr %object to i64
  %5 = add i64 %size, %4
  %6 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 24
  %Second = load ptr, ptr %6, align 8, !invariant.load !17
  %7 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %7, align 8, !invariant.load !17, !dereferenceable !18
  %8 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %8, align 8, !invariant.load !17
  %9 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %9 to i64
  %10 = add i64 %5, %flags.alignmentMask
  %11 = xor i64 %flags.alignmentMask, -1
  %12 = and i64 %10, %11
  %13 = inttoptr i64 %12 to ptr
  %14 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 8
  %Destroy1 = load ptr, ptr %14, align 8, !invariant.load !17
  tail call void %Destroy1(ptr noalias %13, ptr %Second) #16
  ret void
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications4PairVwcp"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Pair<First, Second>") #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %InitializeWithCopy(ptr noalias %dest, ptr noalias %src, ptr %First) #16
  %4 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %4, align 8, !invariant.load !17
  %5 = ptrtoint ptr %dest to i64
  %6 = ptrtoint ptr %src to i64
  %7 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 24
  %Second = load ptr, ptr %7, align 8, !invariant.load !17
  %8 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %9, align 8, !invariant.load !17
  %10 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %10 to i64
  %11 = add i64 %size, %flags.alignmentMask
  %12 = add i64 %11, %5
  %13 = xor i64 %flags.alignmentMask, -1
  %14 = and i64 %12, %13
  %15 = inttoptr i64 %14 to ptr
  %16 = add i64 %11, %6
  %17 = and i64 %16, %13
  %18 = inttoptr i64 %17 to ptr
  %19 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 16
  %InitializeWithCopy1 = load ptr, ptr %19, align 8, !invariant.load !17
  %20 = tail call ptr %InitializeWithCopy1(ptr noalias %15, ptr noalias %18, ptr %Second) #16
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications4PairVwca"(ptr returned %dest, ptr %src, ptr readonly captures(none) %"Pair<First, Second>") #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 24
  %AssignWithCopy = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %AssignWithCopy(ptr %dest, ptr %src, ptr %First) #16
  %4 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %4, align 8, !invariant.load !17
  %5 = ptrtoint ptr %dest to i64
  %6 = ptrtoint ptr %src to i64
  %7 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 24
  %Second = load ptr, ptr %7, align 8, !invariant.load !17
  %8 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %9, align 8, !invariant.load !17
  %10 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %10 to i64
  %11 = add i64 %size, %flags.alignmentMask
  %12 = add i64 %11, %5
  %13 = xor i64 %flags.alignmentMask, -1
  %14 = and i64 %12, %13
  %15 = inttoptr i64 %14 to ptr
  %16 = add i64 %11, %6
  %17 = and i64 %16, %13
  %18 = inttoptr i64 %17 to ptr
  %19 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 24
  %AssignWithCopy1 = load ptr, ptr %19, align 8, !invariant.load !17
  %20 = tail call ptr %AssignWithCopy1(ptr %15, ptr %18, ptr %Second) #16
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications4PairVwtk"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Pair<First, Second>") #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 32
  %InitializeWithTake = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %InitializeWithTake(ptr noalias %dest, ptr noalias %src, ptr %First) #16
  %4 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %4, align 8, !invariant.load !17
  %5 = ptrtoint ptr %dest to i64
  %6 = ptrtoint ptr %src to i64
  %7 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 24
  %Second = load ptr, ptr %7, align 8, !invariant.load !17
  %8 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %9, align 8, !invariant.load !17
  %10 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %10 to i64
  %11 = add i64 %size, %flags.alignmentMask
  %12 = add i64 %11, %5
  %13 = xor i64 %flags.alignmentMask, -1
  %14 = and i64 %12, %13
  %15 = inttoptr i64 %14 to ptr
  %16 = add i64 %11, %6
  %17 = and i64 %16, %13
  %18 = inttoptr i64 %17 to ptr
  %19 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 32
  %InitializeWithTake1 = load ptr, ptr %19, align 8, !invariant.load !17
  %20 = tail call ptr %InitializeWithTake1(ptr noalias %15, ptr noalias %18, ptr %Second) #16
  ret ptr %dest
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications4PairVwta"(ptr noalias returned %dest, ptr noalias %src, ptr readonly captures(none) %"Pair<First, Second>") #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 40
  %AssignWithTake = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call ptr %AssignWithTake(ptr noalias %dest, ptr noalias %src, ptr %First) #16
  %4 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %4, align 8, !invariant.load !17
  %5 = ptrtoint ptr %dest to i64
  %6 = ptrtoint ptr %src to i64
  %7 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 24
  %Second = load ptr, ptr %7, align 8, !invariant.load !17
  %8 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %9, align 8, !invariant.load !17
  %10 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %10 to i64
  %11 = add i64 %size, %flags.alignmentMask
  %12 = add i64 %11, %5
  %13 = xor i64 %flags.alignmentMask, -1
  %14 = and i64 %12, %13
  %15 = inttoptr i64 %14 to ptr
  %16 = add i64 %11, %6
  %17 = and i64 %16, %13
  %18 = inttoptr i64 %17 to ptr
  %19 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 40
  %AssignWithTake1 = load ptr, ptr %19, align 8, !invariant.load !17
  %20 = tail call ptr %AssignWithTake1(ptr noalias %15, ptr noalias %18, ptr %Second) #16
  ret ptr %dest
}

; Function Attrs: nofree nounwind memory(read)
define internal i32 @"$s17OwnedApplications4PairVwet"(ptr noalias %value, i32 %numEmptyCases, ptr readonly captures(none) %"Pair<First, Second>") #13 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %3 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 24
  %Second = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %4, align 8, !invariant.load !17, !dereferenceable !18
  %5 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 84
  %extraInhabitantCount1 = load i32, ptr %5, align 4, !invariant.load !17
  %num-extra-inhabitants = tail call i32 @llvm.umax.i32(i32 %extraInhabitantCount1, i32 %extraInhabitantCount)
  %6 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %6, align 8, !invariant.load !17
  %7 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %7, align 8, !invariant.load !17
  %8 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %8 to i64
  %9 = xor i64 %flags.alignmentMask, -1
  %10 = add i64 %size, %flags.alignmentMask
  %11 = and i64 %10, %9
  %12 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 64
  %size2 = load i64, ptr %12, align 8, !invariant.load !17
  %size3 = add i64 %11, %size2
  %13 = trunc i64 %size3 to i32
  %14 = icmp eq i32 %numEmptyCases, 0
  br i1 %14, label %found_max_xi, label %15

15:                                               ; preds = %entry
  %16 = icmp ugt i32 %numEmptyCases, %num-extra-inhabitants
  br i1 %16, label %17, label %.thread22

17:                                               ; preds = %15
  %18 = icmp ugt i32 %13, 3
  br i1 %18, label %.thread20, label %19

19:                                               ; preds = %17
  %20 = sub i32 %numEmptyCases, %num-extra-inhabitants
  %21 = shl nuw nsw i32 %13, 3
  %notmask = shl nsw i32 -1, %21
  %22 = xor i32 %notmask, -1
  %23 = add i32 %20, %22
  %24 = lshr i32 %23, %21
  %.fr25 = freeze i32 %24
  %25 = add i32 %.fr25, 1
  %26 = icmp ult i32 %25, 256
  br i1 %26, label %.thread15, label %31

.thread15:                                        ; preds = %19
  %27 = icmp samesign ult i32 %25, 2
  br i1 %27, label %.thread21, label %.thread20

.thread20:                                        ; preds = %17, %.thread15
  %28 = getelementptr inbounds i8, ptr %value, i64 %size3
  %29 = load i8, ptr %28, align 1
  %30 = zext i8 %29 to i32
  br label %39

31:                                               ; preds = %19
  %32 = icmp ugt i32 %25, 65535
  %33 = getelementptr inbounds i8, ptr %value, i64 %size3
  br i1 %32, label %37, label %34

34:                                               ; preds = %31
  %35 = load i16, ptr %33, align 1
  %36 = zext i16 %35 to i32
  br label %39

37:                                               ; preds = %31
  %38 = load i32, ptr %33, align 1
  br label %39

39:                                               ; preds = %37, %34, %.thread20
  %40 = phi i32 [ %30, %.thread20 ], [ %36, %34 ], [ %38, %37 ]
  %41 = icmp eq i32 %40, 0
  br i1 %41, label %.thread21, label %42

42:                                               ; preds = %39
  %43 = add i32 %40, -1
  %44 = shl nuw nsw i32 %13, 3
  %45 = shl i32 %43, %44
  %46 = select i1 %18, i32 0, i32 %45
  %.not = icmp eq i32 %13, 0
  br i1 %.not, label %61, label %47

47:                                               ; preds = %42
  %48 = select i1 %18, i32 4, i32 %13
  switch i32 %48, label %60 [
    i32 1, label %49
    i32 2, label %52
    i32 3, label %55
    i32 4, label %58
  ]

49:                                               ; preds = %47
  %50 = load i8, ptr %value, align 1
  %51 = zext i8 %50 to i32
  br label %61

52:                                               ; preds = %47
  %53 = load i16, ptr %value, align 1
  %54 = zext i16 %53 to i32
  br label %61

55:                                               ; preds = %47
  %56 = load i24, ptr %value, align 1
  %57 = zext i24 %56 to i32
  br label %61

58:                                               ; preds = %47
  %59 = load i32, ptr %value, align 1
  br label %61

60:                                               ; preds = %47
  unreachable

61:                                               ; preds = %49, %52, %55, %58, %42
  %62 = phi i32 [ 0, %42 ], [ %51, %49 ], [ %54, %52 ], [ %57, %55 ], [ %59, %58 ]
  %63 = or i32 %62, %46
  %64 = add nuw i32 %num-extra-inhabitants, 1
  %65 = add i32 %64, %63
  br label %found_max_xi

.thread21:                                        ; preds = %.thread15, %39
  %.not9 = icmp eq i32 %num-extra-inhabitants, 0
  br i1 %.not9, label %found_max_xi, label %.thread22

.thread22:                                        ; preds = %15, %.thread21
  %.not10 = icmp ult i32 %extraInhabitantCount, %extraInhabitantCount1
  br i1 %.not10, label %69, label %66

66:                                               ; preds = %.thread22
  %67 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %67, align 8, !invariant.load !17
  %68 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %value, i32 %extraInhabitantCount, ptr nonnull %First) #22
  br label %found_max_xi

69:                                               ; preds = %.thread22
  %70 = ptrtoint ptr %value to i64
  %71 = add i64 %10, %70
  %72 = and i64 %71, %9
  %73 = inttoptr i64 %72 to ptr
  %74 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 48
  %GetEnumTagSinglePayload6 = load ptr, ptr %74, align 8, !invariant.load !17
  %75 = tail call i32 %GetEnumTagSinglePayload6(ptr noalias %73, i32 %extraInhabitantCount1, ptr nonnull %Second) #22
  br label %found_max_xi

found_max_xi:                                     ; preds = %entry, %.thread21, %69, %66, %61
  %76 = phi i32 [ %65, %61 ], [ 0, %.thread21 ], [ %68, %66 ], [ %75, %69 ], [ 0, %entry ]
  ret i32 %76
}

; Function Attrs: nounwind
define internal void @"$s17OwnedApplications4PairVwst"(ptr noalias %value, i32 %whichCase, i32 %numEmptyCases, ptr readonly captures(none) %"Pair<First, Second>") #9 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 16
  %First = load ptr, ptr %0, align 8, !invariant.load !17
  %1 = getelementptr inbounds i8, ptr %First, i64 -8
  %First.valueWitnesses = load ptr, ptr %1, align 8, !invariant.load !17, !dereferenceable !18
  %2 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %2, align 4, !invariant.load !17
  %3 = getelementptr inbounds nuw i8, ptr %"Pair<First, Second>", i64 24
  %Second = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = getelementptr inbounds i8, ptr %Second, i64 -8
  %Second.valueWitnesses = load ptr, ptr %4, align 8, !invariant.load !17, !dereferenceable !18
  %5 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 84
  %extraInhabitantCount1 = load i32, ptr %5, align 4, !invariant.load !17
  %num-extra-inhabitants = tail call i32 @llvm.umax.i32(i32 %extraInhabitantCount1, i32 %extraInhabitantCount)
  %6 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 64
  %size = load i64, ptr %6, align 8, !invariant.load !17
  %7 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 80
  %flags = load i32, ptr %7, align 8, !invariant.load !17
  %8 = and i32 %flags, 255
  %flags.alignmentMask = zext nneg i32 %8 to i64
  %9 = xor i64 %flags.alignmentMask, -1
  %10 = add i64 %size, %flags.alignmentMask
  %11 = and i64 %10, %9
  %12 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 64
  %size2 = load i64, ptr %12, align 8, !invariant.load !17
  %size3 = add i64 %11, %size2
  %13 = trunc i64 %size3 to i32
  %14 = getelementptr inbounds i8, ptr %value, i64 %size3
  %15 = icmp ugt i32 %numEmptyCases, %num-extra-inhabitants
  br i1 %15, label %16, label %.thread15.thread

16:                                               ; preds = %entry
  %17 = icmp ugt i32 %13, 3
  br i1 %17, label %.thread15.thread, label %18

18:                                               ; preds = %16
  %19 = sub i32 %numEmptyCases, %num-extra-inhabitants
  %20 = shl nuw nsw i32 %13, 3
  %notmask = shl nsw i32 -1, %20
  %21 = xor i32 %notmask, -1
  %22 = add i32 %19, %21
  %23 = lshr i32 %22, %20
  %.fr23 = freeze i32 %23
  %24 = add i32 %.fr23, 1
  %25 = icmp ult i32 %24, 256
  %26 = icmp ult i32 %24, 65536
  %. = select i1 %26, i32 2, i32 4
  br i1 %25, label %.thread15, label %.thread15.thread

.thread15:                                        ; preds = %18
  %27 = icmp samesign ugt i32 %24, 1
  %spec.select = zext i1 %27 to i32
  br label %.thread15.thread

.thread15.thread:                                 ; preds = %.thread15, %18, %16, %entry
  %28 = phi i32 [ 0, %entry ], [ 1, %16 ], [ %., %18 ], [ %spec.select, %.thread15 ]
  %.not = icmp ugt i32 %whichCase, %num-extra-inhabitants
  br i1 %.not, label %44, label %29

29:                                               ; preds = %.thread15.thread
  switch i32 %28, label %33 [
    i32 0, label %34
    i32 1, label %30
    i32 2, label %31
    i32 4, label %32
  ]

30:                                               ; preds = %29
  store i8 0, ptr %14, align 1
  br label %34

31:                                               ; preds = %29
  store i16 0, ptr %14, align 1
  br label %34

32:                                               ; preds = %29
  store i32 0, ptr %14, align 1
  br label %34

33:                                               ; preds = %29
  unreachable

34:                                               ; preds = %29, %32, %31, %30
  %.not24 = icmp eq i32 %whichCase, 0
  br i1 %.not24, label %found_max_xi, label %35

35:                                               ; preds = %34
  %.not10 = icmp ult i32 %extraInhabitantCount, %extraInhabitantCount1
  br i1 %.not10, label %38, label %36

36:                                               ; preds = %35
  %37 = getelementptr inbounds nuw i8, ptr %First.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %37, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %value, i32 %whichCase, i32 %extraInhabitantCount, ptr nonnull %First) #16
  br label %found_max_xi

38:                                               ; preds = %35
  %39 = ptrtoint ptr %value to i64
  %40 = add i64 %10, %39
  %41 = and i64 %40, %9
  %42 = inttoptr i64 %41 to ptr
  %43 = getelementptr inbounds nuw i8, ptr %Second.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload6 = load ptr, ptr %43, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload6(ptr noalias %42, i32 %whichCase, i32 %extraInhabitantCount1, ptr nonnull %Second) #16
  br label %found_max_xi

44:                                               ; preds = %.thread15.thread
  %45 = xor i32 %num-extra-inhabitants, -1
  %46 = add i32 %whichCase, %45
  %47 = icmp ugt i32 %13, 3
  br i1 %47, label %.thread21, label %48

.thread21:                                        ; preds = %44
  tail call void @llvm.memset.p0.i32(ptr align 1 %value, i8 0, i32 %13, i1 false)
  store i32 %46, ptr %value, align 1
  br label %62

48:                                               ; preds = %44
  %49 = shl nuw nsw i32 %13, 3
  %50 = lshr i32 %46, %49
  %51 = add i32 %50, 1
  %notmask8 = shl nsw i32 -1, %49
  %52 = xor i32 %notmask8, -1
  %53 = and i32 %46, %52
  %.not9 = icmp eq i32 %13, 0
  br i1 %.not9, label %62, label %54

54:                                               ; preds = %48
  tail call void @llvm.memset.p0.i32(ptr align 1 %value, i8 0, i32 %13, i1 false)
  switch i32 %13, label %61 [
    i32 1, label %55
    i32 2, label %57
    i32 3, label %59
  ]

55:                                               ; preds = %54
  %56 = trunc i32 %46 to i8
  store i8 %56, ptr %value, align 1
  br label %62

57:                                               ; preds = %54
  %58 = trunc i32 %53 to i16
  store i16 %58, ptr %value, align 1
  br label %62

59:                                               ; preds = %54
  %60 = trunc nuw i32 %53 to i24
  store i24 %60, ptr %value, align 1
  br label %62

61:                                               ; preds = %54
  unreachable

62:                                               ; preds = %55, %57, %59, %.thread21, %48
  %63 = phi i32 [ %51, %55 ], [ %51, %57 ], [ %51, %59 ], [ 1, %.thread21 ], [ %51, %48 ]
  switch i32 %28, label %69 [
    i32 0, label %found_max_xi
    i32 1, label %64
    i32 2, label %66
    i32 4, label %68
  ]

64:                                               ; preds = %62
  %65 = trunc i32 %63 to i8
  store i8 %65, ptr %14, align 1
  br label %found_max_xi

66:                                               ; preds = %62
  %67 = trunc i32 %63 to i16
  store i16 %67, ptr %14, align 1
  br label %found_max_xi

68:                                               ; preds = %62
  store i32 %63, ptr %14, align 1
  br label %found_max_xi

69:                                               ; preds = %62
  unreachable

found_max_xi:                                     ; preds = %64, %66, %68, %62, %38, %36, %34
  ret void
}

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedApplications4PairVMa"(i64 %0, ptr readnone %1, ptr readnone %2) #15 {
entry:
  %3 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr %2, ptr undef, ptr nonnull @"$s17OwnedApplications4PairVMn") #21
  ret %swift.metadata_response %3
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications11ConstrainedVMi"(ptr %0, ptr %1, ptr %2) #9 {
entry:
  %3 = tail call ptr @swift_allocateGenericValueMetadata(ptr %0, ptr %1, ptr %2, i64 24) #16
  ret ptr %3
}

; Function Attrs: nounwind
define internal swiftcc %swift.metadata_response @"$s17OwnedApplications11ConstrainedVMr"(ptr %"Constrained<Value>", ptr readnone captures(none) %0, ptr readnone captures(none) %1) #9 {
entry:
  %classFields = alloca [1 x ptr], align 8
  call void @llvm.lifetime.start.p0(i64 8, ptr nonnull %classFields)
  %2 = getelementptr inbounds nuw i8, ptr %"Constrained<Value>", i64 16
  %Value = load ptr, ptr %2, align 8, !invariant.load !17
  %3 = tail call swiftcc %swift.metadata_response @swift_checkMetadataState(i64 319, ptr %Value) #23
  %4 = extractvalue %swift.metadata_response %3, 0
  %5 = extractvalue %swift.metadata_response %3, 1
  %6 = icmp ult i64 %5, 64
  br i1 %6, label %dependency-satisfied, label %metadata-dependencies.cont

dependency-satisfied:                             ; preds = %entry
  %7 = getelementptr inbounds nuw i8, ptr %"Constrained<Value>", i64 32
  %8 = getelementptr inbounds i8, ptr %4, i64 -8
  %.valueWitnesses = load ptr, ptr %8, align 8, !invariant.load !17, !dereferenceable !18
  %9 = getelementptr inbounds nuw i8, ptr %.valueWitnesses, i64 64
  store ptr %9, ptr %classFields, align 8
  call void @swift_initStructMetadata(ptr nonnull %"Constrained<Value>", i64 0, i64 1, ptr nonnull %classFields, ptr nonnull %7) #16
  call void @llvm.lifetime.end.p0(i64 8, ptr nonnull %classFields)
  br label %metadata-dependencies.cont

metadata-dependencies.cont:                       ; preds = %dependency-satisfied, %entry
  %10 = phi ptr [ %4, %entry ], [ null, %dependency-satisfied ]
  %11 = phi i64 [ 63, %entry ], [ 0, %dependency-satisfied ]
  %12 = insertvalue %swift.metadata_response undef, ptr %10, 0
  %13 = insertvalue %swift.metadata_response %12, i64 %11, 1
  ret %swift.metadata_response %13
}

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedApplications11ConstrainedVMa"(i64 %0, ptr readnone %1, ptr readnone %2) #15 {
entry:
  %3 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr %2, ptr undef, ptr nonnull @"$s17OwnedApplications11ConstrainedVMn") #21
  ret %swift.metadata_response %3
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedApplications7ForeignOMa"(i64 %0) #11 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr }>, ptr @"$s17OwnedApplications7ForeignOMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedApplications7ForeignO6ClientVMa"(i64 %0) #11 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s17OwnedApplications7ForeignO6ClientVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: nounwind
define internal swiftcc %swift.metadata_response @"$s17OwnedApplications10DependencyVMrTm"(ptr %0, ptr readnone captures(none) %1, ptr readnone captures(none) %2) #9 {
entry:
  %classFields = alloca [1 x ptr], align 8
  call void @llvm.lifetime.start.p0(i64 8, ptr nonnull %classFields)
  %3 = getelementptr inbounds nuw i8, ptr %0, i64 16
  %Value = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = tail call swiftcc %swift.metadata_response @swift_checkMetadataState(i64 319, ptr %Value) #23
  %5 = extractvalue %swift.metadata_response %4, 0
  %6 = extractvalue %swift.metadata_response %4, 1
  %7 = icmp ult i64 %6, 64
  br i1 %7, label %dependency-satisfied, label %metadata-dependencies.cont

dependency-satisfied:                             ; preds = %entry
  %8 = getelementptr inbounds nuw i8, ptr %0, i64 24
  %9 = getelementptr inbounds i8, ptr %5, i64 -8
  %.valueWitnesses = load ptr, ptr %9, align 8, !invariant.load !17, !dereferenceable !18
  %10 = getelementptr inbounds nuw i8, ptr %.valueWitnesses, i64 64
  store ptr %10, ptr %classFields, align 8
  call void @swift_initStructMetadata(ptr nonnull %0, i64 0, i64 1, ptr nonnull %classFields, ptr nonnull %8) #16
  call void @llvm.lifetime.end.p0(i64 8, ptr nonnull %classFields)
  br label %metadata-dependencies.cont

metadata-dependencies.cont:                       ; preds = %dependency-satisfied, %entry
  %11 = phi ptr [ %5, %entry ], [ null, %dependency-satisfied ]
  %12 = phi i64 [ 63, %entry ], [ 0, %dependency-satisfied ]
  %13 = insertvalue %swift.metadata_response undef, ptr %11, 0
  %14 = insertvalue %swift.metadata_response %13, i64 %12, 1
  ret %swift.metadata_response %14
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications10DependencyVwCPTm"(ptr noalias %0, ptr noalias %1, ptr readonly captures(none) %2) #9 {
entry:
  %3 = getelementptr inbounds nuw i8, ptr %2, i64 16
  %Value = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %4, align 8, !invariant.load !17, !dereferenceable !18
  %5 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %5, align 8, !invariant.load !17
  %6 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 80
  %flags = load i32, ptr %6, align 8, !invariant.load !17
  %7 = and i32 %flags, 255
  %8 = and i32 %flags, 1048576
  %flags.isBitwiseTakable = icmp eq i32 %8, 0
  %9 = icmp samesign ult i32 %7, 8
  %10 = icmp ult i64 %size, 25
  %11 = and i1 %10, %flags.isBitwiseTakable
  %12 = and i1 %9, %11
  br i1 %12, label %inlineBB, label %allocateBB

inlineBB:                                         ; preds = %entry
  %13 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 16
  %InitializeWithCopy = load ptr, ptr %13, align 8, !invariant.load !17
  %14 = tail call ptr %InitializeWithCopy(ptr noalias %0, ptr noalias %1, ptr nonnull %Value) #16
  br label %21

allocateBB:                                       ; preds = %entry
  %alignment-mask = zext nneg i32 %7 to i64
  %15 = load ptr, ptr %1, align 8
  store ptr %15, ptr %0, align 8
  %16 = add nuw nsw i64 %alignment-mask, 16
  %17 = xor i64 %alignment-mask, -1
  %18 = and i64 %16, %17
  %19 = getelementptr inbounds nuw i8, ptr %15, i64 %18
  %20 = tail call ptr @swift_retain(ptr returned %15) #24
  br label %21

21:                                               ; preds = %allocateBB, %inlineBB
  %22 = phi ptr [ %0, %inlineBB ], [ %19, %allocateBB ]
  ret ptr %22
}

; Function Attrs: nofree nounwind memory(read)
define internal i32 @"$s17OwnedApplications10DependencyVwetTm"(ptr noalias readonly %0, i32 %1, ptr readonly captures(none) %2) #13 {
entry:
  %3 = getelementptr inbounds nuw i8, ptr %2, i64 16
  %Value = load ptr, ptr %3, align 8, !invariant.load !17
  %4 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %4, align 8, !invariant.load !17, !dereferenceable !18
  %5 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %5, align 4, !invariant.load !17
  %6 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %6, align 8, !invariant.load !17
  %7 = trunc i64 %size to i32
  %8 = icmp eq i32 %1, 0
  br i1 %8, label %62, label %9

9:                                                ; preds = %entry
  %10 = icmp ugt i32 %1, %extraInhabitantCount
  br i1 %10, label %11, label %found_max_xi

11:                                               ; preds = %9
  %12 = icmp ugt i32 %7, 3
  br i1 %12, label %.thread14, label %13

13:                                               ; preds = %11
  %14 = sub i32 %1, %extraInhabitantCount
  %15 = shl nuw nsw i32 %7, 3
  %notmask = shl nsw i32 -1, %15
  %16 = xor i32 %notmask, -1
  %17 = add i32 %14, %16
  %18 = lshr i32 %17, %15
  %.fr19 = freeze i32 %18
  %19 = add i32 %.fr19, 1
  %20 = icmp ult i32 %19, 256
  br i1 %20, label %.thread9, label %25

.thread9:                                         ; preds = %13
  %21 = icmp samesign ult i32 %19, 2
  br i1 %21, label %.thread15, label %.thread14

.thread14:                                        ; preds = %11, %.thread9
  %22 = getelementptr inbounds i8, ptr %0, i64 %size
  %23 = load i8, ptr %22, align 1
  %24 = zext i8 %23 to i32
  br label %33

25:                                               ; preds = %13
  %26 = icmp ugt i32 %19, 65535
  %27 = getelementptr inbounds i8, ptr %0, i64 %size
  br i1 %26, label %31, label %28

28:                                               ; preds = %25
  %29 = load i16, ptr %27, align 1
  %30 = zext i16 %29 to i32
  br label %33

31:                                               ; preds = %25
  %32 = load i32, ptr %27, align 1
  br label %33

33:                                               ; preds = %31, %28, %.thread14
  %34 = phi i32 [ %24, %.thread14 ], [ %30, %28 ], [ %32, %31 ]
  %35 = icmp eq i32 %34, 0
  br i1 %35, label %.thread15, label %36

36:                                               ; preds = %33
  %37 = add i32 %34, -1
  %38 = shl nuw nsw i32 %7, 3
  %39 = shl i32 %37, %38
  %40 = select i1 %12, i32 0, i32 %39
  %.not = icmp eq i32 %7, 0
  br i1 %.not, label %55, label %41

41:                                               ; preds = %36
  %42 = select i1 %12, i32 4, i32 %7
  switch i32 %42, label %54 [
    i32 1, label %43
    i32 2, label %46
    i32 3, label %49
    i32 4, label %52
  ]

43:                                               ; preds = %41
  %44 = load i8, ptr %0, align 1
  %45 = zext i8 %44 to i32
  br label %55

46:                                               ; preds = %41
  %47 = load i16, ptr %0, align 1
  %48 = zext i16 %47 to i32
  br label %55

49:                                               ; preds = %41
  %50 = load i24, ptr %0, align 1
  %51 = zext i24 %50 to i32
  br label %55

52:                                               ; preds = %41
  %53 = load i32, ptr %0, align 1
  br label %55

54:                                               ; preds = %41
  unreachable

55:                                               ; preds = %43, %46, %49, %52, %36
  %56 = phi i32 [ 0, %36 ], [ %45, %43 ], [ %48, %46 ], [ %51, %49 ], [ %53, %52 ]
  %57 = or i32 %56, %40
  %58 = add nuw i32 %extraInhabitantCount, 1
  %59 = add i32 %58, %57
  br label %62

.thread15:                                        ; preds = %.thread9, %33
  %.not4 = icmp eq i32 %extraInhabitantCount, 0
  br i1 %.not4, label %62, label %found_max_xi

found_max_xi:                                     ; preds = %9, %.thread15
  %60 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 48
  %GetEnumTagSinglePayload = load ptr, ptr %60, align 8, !invariant.load !17
  %61 = tail call i32 %GetEnumTagSinglePayload(ptr noalias %0, i32 %extraInhabitantCount, ptr nonnull %Value) #22
  br label %62

62:                                               ; preds = %entry, %.thread15, %found_max_xi, %55
  %63 = phi i32 [ %59, %55 ], [ 0, %.thread15 ], [ %61, %found_max_xi ], [ 0, %entry ]
  ret i32 %63
}

; Function Attrs: nounwind
define internal void @"$s17OwnedApplications10DependencyVwstTm"(ptr noalias %0, i32 %1, i32 %2, ptr readonly captures(none) %3) #9 {
entry:
  %4 = getelementptr inbounds nuw i8, ptr %3, i64 16
  %Value = load ptr, ptr %4, align 8, !invariant.load !17
  %5 = getelementptr inbounds i8, ptr %Value, i64 -8
  %Value.valueWitnesses = load ptr, ptr %5, align 8, !invariant.load !17, !dereferenceable !18
  %6 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 84
  %extraInhabitantCount = load i32, ptr %6, align 4, !invariant.load !17
  %7 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 64
  %size = load i64, ptr %7, align 8, !invariant.load !17
  %8 = trunc i64 %size to i32
  %9 = getelementptr inbounds i8, ptr %0, i64 %size
  %10 = icmp ugt i32 %2, %extraInhabitantCount
  br i1 %10, label %11, label %.thread9.thread

11:                                               ; preds = %entry
  %12 = icmp ugt i32 %8, 3
  br i1 %12, label %.thread9.thread, label %13

13:                                               ; preds = %11
  %14 = sub i32 %2, %extraInhabitantCount
  %15 = shl nuw nsw i32 %8, 3
  %notmask = shl nsw i32 -1, %15
  %16 = xor i32 %notmask, -1
  %17 = add i32 %14, %16
  %18 = lshr i32 %17, %15
  %.fr17 = freeze i32 %18
  %19 = add i32 %.fr17, 1
  %20 = icmp ult i32 %19, 256
  %21 = icmp ult i32 %19, 65536
  %. = select i1 %21, i32 2, i32 4
  br i1 %20, label %.thread9, label %.thread9.thread

.thread9:                                         ; preds = %13
  %22 = icmp samesign ugt i32 %19, 1
  %spec.select = zext i1 %22 to i32
  br label %.thread9.thread

.thread9.thread:                                  ; preds = %.thread9, %13, %11, %entry
  %23 = phi i32 [ 0, %entry ], [ 1, %11 ], [ %., %13 ], [ %spec.select, %.thread9 ]
  %.not = icmp ugt i32 %1, %extraInhabitantCount
  br i1 %.not, label %31, label %24

24:                                               ; preds = %.thread9.thread
  switch i32 %23, label %28 [
    i32 0, label %29
    i32 1, label %25
    i32 2, label %26
    i32 4, label %27
  ]

25:                                               ; preds = %24
  store i8 0, ptr %9, align 1
  br label %29

26:                                               ; preds = %24
  store i16 0, ptr %9, align 1
  br label %29

27:                                               ; preds = %24
  store i32 0, ptr %9, align 1
  br label %29

28:                                               ; preds = %24
  unreachable

29:                                               ; preds = %24, %27, %26, %25
  %.not18 = icmp eq i32 %1, 0
  br i1 %.not18, label %57, label %found_max_xi

found_max_xi:                                     ; preds = %29
  %30 = getelementptr inbounds nuw i8, ptr %Value.valueWitnesses, i64 56
  %StoreEnumTagSinglePayload = load ptr, ptr %30, align 8, !invariant.load !17
  tail call void %StoreEnumTagSinglePayload(ptr noalias %0, i32 %1, i32 %extraInhabitantCount, ptr nonnull %Value) #16
  br label %57

31:                                               ; preds = %.thread9.thread
  %32 = xor i32 %extraInhabitantCount, -1
  %33 = add i32 %1, %32
  %34 = icmp ugt i32 %8, 3
  br i1 %34, label %.thread15, label %35

.thread15:                                        ; preds = %31
  tail call void @llvm.memset.p0.i32(ptr align 1 %0, i8 0, i32 %8, i1 false)
  store i32 %33, ptr %0, align 1
  br label %49

35:                                               ; preds = %31
  %36 = shl nuw nsw i32 %8, 3
  %37 = lshr i32 %33, %36
  %38 = add i32 %37, 1
  %notmask3 = shl nsw i32 -1, %36
  %39 = xor i32 %notmask3, -1
  %40 = and i32 %33, %39
  %.not4 = icmp eq i32 %8, 0
  br i1 %.not4, label %49, label %41

41:                                               ; preds = %35
  tail call void @llvm.memset.p0.i32(ptr align 1 %0, i8 0, i32 %8, i1 false)
  switch i32 %8, label %48 [
    i32 1, label %42
    i32 2, label %44
    i32 3, label %46
  ]

42:                                               ; preds = %41
  %43 = trunc i32 %33 to i8
  store i8 %43, ptr %0, align 1
  br label %49

44:                                               ; preds = %41
  %45 = trunc i32 %40 to i16
  store i16 %45, ptr %0, align 1
  br label %49

46:                                               ; preds = %41
  %47 = trunc nuw i32 %40 to i24
  store i24 %47, ptr %0, align 1
  br label %49

48:                                               ; preds = %41
  unreachable

49:                                               ; preds = %42, %44, %46, %.thread15, %35
  %50 = phi i32 [ %38, %42 ], [ %38, %44 ], [ %38, %46 ], [ 1, %.thread15 ], [ %38, %35 ]
  switch i32 %23, label %56 [
    i32 0, label %57
    i32 1, label %51
    i32 2, label %53
    i32 4, label %55
  ]

51:                                               ; preds = %49
  %52 = trunc i32 %50 to i8
  store i8 %52, ptr %9, align 1
  br label %57

53:                                               ; preds = %49
  %54 = trunc i32 %50 to i16
  store i16 %54, ptr %9, align 1
  br label %57

55:                                               ; preds = %49
  store i32 %50, ptr %9, align 1
  br label %57

56:                                               ; preds = %49
  unreachable

57:                                               ; preds = %51, %53, %55, %49, %found_max_xi, %29
  ret void
}

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedApplications7ForeignO10DependencyVMa"(i64 %0, ptr readnone %1) #15 {
entry:
  %2 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr undef, ptr undef, ptr nonnull @"$s17OwnedApplications7ForeignO10DependencyVMn") #21
  ret %swift.metadata_response %2
}

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy20_8(ptr %0, ptr %1, ptr %2) #9 {
entry:
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(20) %0, ptr noundef nonnull align 8 dereferenceable(20) %1, i64 20, i1 false)
  ret ptr %0
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s17OwnedApplications4RootVwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Root) #10 {
entry:
  %0 = icmp eq i32 %numEmptyCases, 0
  br i1 %0, label %21, label %1

1:                                                ; preds = %entry
  %2 = icmp ugt i32 %numEmptyCases, 254
  br i1 %2, label %3, label %11

3:                                                ; preds = %1
  %4 = getelementptr inbounds nuw i8, ptr %value, i64 20
  %5 = load i8, ptr %4, align 1
  %6 = icmp eq i8 %5, 0
  br i1 %6, label %11, label %7

7:                                                ; preds = %3
  %8 = load i160, ptr %value, align 1
  %9 = trunc i160 %8 to i32
  %10 = add i32 %9, 254
  br label %21

11:                                               ; preds = %3, %1
  %12 = load i8, ptr %value, align 8
  %13 = icmp ult i8 %12, 2
  br i1 %13, label %21, label %14

14:                                               ; preds = %11
  %15 = zext i8 %12 to i31
  %16 = and i31 %15, 1
  %17 = and i31 %15, 254
  %18 = add nsw i31 %17, -2
  %19 = or disjoint i31 %18, %16
  %20 = zext nneg i31 %19 to i32
  br label %21

21:                                               ; preds = %entry, %11, %14, %7
  %22 = phi i32 [ %10, %7 ], [ -1, %11 ], [ %20, %14 ], [ -1, %entry ]
  %23 = add i32 %22, 1
  ret i32 %23
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s17OwnedApplications4RootVwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Root) #4 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 20
  %1 = icmp ugt i32 %numEmptyCases, 254
  %2 = icmp ult i32 %whichCase, 255
  br i1 %2, label %3, label %14

3:                                                ; preds = %entry
  br i1 %1, label %4, label %5

4:                                                ; preds = %3
  store i8 0, ptr %0, align 4
  br label %5

5:                                                ; preds = %3, %4
  %6 = icmp eq i32 %whichCase, 0
  br i1 %6, label %18, label %7

7:                                                ; preds = %5
  %8 = trunc nuw i32 %whichCase to i8
  %9 = add i8 %8, -1
  %10 = and i8 %9, 1
  %11 = and i8 %9, -2
  %12 = add nuw i8 %11, 2
  %13 = or disjoint i8 %12, %10
  store i8 %13, ptr %value, align 8
  br label %18

14:                                               ; preds = %entry
  %15 = add i32 %whichCase, -255
  %16 = zext i32 %15 to i160
  store i160 %16, ptr %value, align 8
  br i1 %1, label %17, label %18

17:                                               ; preds = %14
  store i8 1, ptr %0, align 4
  br label %18

18:                                               ; preds = %14, %17, %7, %5
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s17OwnedApplications4RootVMa"(i64 %0) #11 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32, i32, i32, i32, i32, i32, i32, i32, [4 x i8] }>, ptr @"$s17OwnedApplications4RootVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nofree noinline nounwind willreturn memory(read)
define linkonce_odr hidden swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr %2, ptr %3, ptr %4) local_unnamed_addr #18 {
entry:
  %generic.arguments = alloca [3 x ptr], align 8
  call void @llvm.lifetime.start.p0(i64 24, ptr nonnull %generic.arguments)
  store ptr %1, ptr %generic.arguments, align 8
  %5 = getelementptr inbounds nuw i8, ptr %generic.arguments, i64 8
  store ptr %2, ptr %5, align 8
  %6 = getelementptr inbounds nuw i8, ptr %generic.arguments, i64 16
  store ptr %3, ptr %6, align 8
  %7 = call swiftcc %swift.metadata_response @swift_getGenericMetadata(i64 %0, ptr nonnull %generic.arguments, ptr %4) #22
  ret %swift.metadata_response %7
}

; Function Attrs: nofree nounwind memory(read)
declare swiftcc %swift.metadata_response @swift_getGenericMetadata(i64, ptr, ptr) local_unnamed_addr #8

; Function Attrs: nocallback nofree nosync nounwind speculatable willreturn memory(none)
declare i32 @llvm.umax.i32(i32, i32) #19

define swiftcc void @"$s17OwnedApplications4PairV5firstxvg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %1, ptr noalias swiftself %2) #1 {
  tail call swiftcc void @"$s17OwnedApplications10DependencyV5valuexvg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %1, ptr noalias swiftself %2) #1
  ret void
}

define swiftcc void @"$s17OwnedApplications4PairV5firstxvs"(ptr noalias %0, ptr readonly captures(none) %1, ptr swiftself %2) #1 {
  tail call swiftcc void @"$s17OwnedApplications10DependencyV5valuexvs"(ptr noalias %0, ptr readonly captures(none) %1, ptr swiftself %2) #1
  ret void
}

define swiftcc void @"$s17OwnedApplications11ConstrainedV5valuexvg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %1, ptr noalias swiftself %2) #1 {
  tail call swiftcc void @"$s17OwnedApplications10DependencyV5valuexvg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %1, ptr noalias swiftself %2) #1
  ret void
}

define swiftcc void @"$s17OwnedApplications11ConstrainedV5valuexvs"(ptr noalias %0, ptr readonly captures(none) %1, ptr swiftself %2) #1 {
  tail call swiftcc void @"$s17OwnedApplications10DependencyV5valuexvs"(ptr noalias %0, ptr readonly captures(none) %1, ptr swiftself %2) #1
  ret void
}

define swiftcc void @"$s17OwnedApplications7ForeignO10DependencyV5valuexvg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %1, ptr noalias swiftself %2) #1 {
  tail call swiftcc void @"$s17OwnedApplications10DependencyV5valuexvg"(ptr noalias sret(%swift.opaque) %0, ptr readonly captures(none) %1, ptr noalias swiftself %2) #1
  ret void
}

define swiftcc void @"$s17OwnedApplications7ForeignO10DependencyV5valuexvs"(ptr noalias %0, ptr readonly captures(none) %1, ptr swiftself %2) #1 {
  tail call swiftcc void @"$s17OwnedApplications10DependencyV5valuexvs"(ptr noalias %0, ptr readonly captures(none) %1, ptr swiftself %2) #1
  ret void
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications11ConstrainedVwcp"(ptr noalias returned %0, ptr noalias %1, ptr readonly captures(none) %2) #9 {
  %4 = tail call ptr @"$s17OwnedApplications10DependencyVwcp"(ptr noalias returned %0, ptr noalias %1, ptr readonly captures(none) %2) #9
  ret ptr %4
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications11ConstrainedVwca"(ptr returned %0, ptr %1, ptr readonly captures(none) %2) #9 {
  %4 = tail call ptr @"$s17OwnedApplications10DependencyVwca"(ptr returned %0, ptr %1, ptr readonly captures(none) %2) #9
  ret ptr %4
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications11ConstrainedVwtk"(ptr noalias returned %0, ptr noalias %1, ptr readonly captures(none) %2) #9 {
  %4 = tail call ptr @"$s17OwnedApplications10DependencyVwtk"(ptr noalias returned %0, ptr noalias %1, ptr readonly captures(none) %2) #9
  ret ptr %4
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications11ConstrainedVwta"(ptr noalias returned %0, ptr noalias %1, ptr readonly captures(none) %2) #9 {
  %4 = tail call ptr @"$s17OwnedApplications10DependencyVwta"(ptr noalias returned %0, ptr noalias %1, ptr readonly captures(none) %2) #9
  ret ptr %4
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications7ForeignO10DependencyVwcp"(ptr noalias returned %0, ptr noalias %1, ptr readonly captures(none) %2) #9 {
  %4 = tail call ptr @"$s17OwnedApplications10DependencyVwcp"(ptr noalias returned %0, ptr noalias %1, ptr readonly captures(none) %2) #9
  ret ptr %4
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications7ForeignO10DependencyVwca"(ptr returned %0, ptr %1, ptr readonly captures(none) %2) #9 {
  %4 = tail call ptr @"$s17OwnedApplications10DependencyVwca"(ptr returned %0, ptr %1, ptr readonly captures(none) %2) #9
  ret ptr %4
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications7ForeignO10DependencyVwtk"(ptr noalias returned %0, ptr noalias %1, ptr readonly captures(none) %2) #9 {
  %4 = tail call ptr @"$s17OwnedApplications10DependencyVwtk"(ptr noalias returned %0, ptr noalias %1, ptr readonly captures(none) %2) #9
  ret ptr %4
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications7ForeignO10DependencyVwta"(ptr noalias returned %0, ptr noalias %1, ptr readonly captures(none) %2) #9 {
  %4 = tail call ptr @"$s17OwnedApplications10DependencyVwta"(ptr noalias returned %0, ptr noalias %1, ptr readonly captures(none) %2) #9
  ret ptr %4
}

; Function Attrs: nounwind
define internal void @"$s17OwnedApplications11ConstrainedVwst"(ptr noalias %0, i32 %1, i32 %2, ptr readonly captures(none) %3) #9 {
  tail call void @"$s17OwnedApplications10DependencyVwst"(ptr noalias %0, i32 %1, i32 %2, ptr readonly captures(none) %3) #9
  ret void
}

; Function Attrs: nounwind
define internal void @"$s17OwnedApplications7ForeignO10DependencyVwst"(ptr noalias %0, i32 %1, i32 %2, ptr readonly captures(none) %3) #9 {
  tail call void @"$s17OwnedApplications10DependencyVwst"(ptr noalias %0, i32 %1, i32 %2, ptr readonly captures(none) %3) #9
  ret void
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications4PairVMi"(ptr %0, ptr %1, ptr %2) #9 {
  %4 = tail call ptr @"$s17OwnedApplications11ConstrainedVMi"(ptr %0, ptr %1, ptr %2) #9
  ret ptr %4
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications11ConstrainedVwCP"(ptr noalias %0, ptr noalias %1, ptr readonly captures(none) %2) #9 {
  %4 = tail call ptr @"$s17OwnedApplications10DependencyVwCP"(ptr noalias %0, ptr noalias %1, ptr readonly captures(none) %2) #9
  ret ptr %4
}

; Function Attrs: nofree nounwind memory(read)
define internal i32 @"$s17OwnedApplications11ConstrainedVwet"(ptr noalias readonly %0, i32 %1, ptr readonly captures(none) %2) #13 {
  %4 = tail call i32 @"$s17OwnedApplications10DependencyVwet"(ptr noalias readonly %0, i32 %1, ptr readonly captures(none) %2) #13
  ret i32 %4
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications7ForeignO10DependencyVMi"(ptr %0, ptr %1, ptr %2) #9 {
  %4 = tail call ptr @"$s17OwnedApplications10DependencyVMi"(ptr %0, ptr %1, ptr %2) #9
  ret ptr %4
}

; Function Attrs: nounwind
define internal swiftcc %swift.metadata_response @"$s17OwnedApplications7ForeignO10DependencyVMr"(ptr %0, ptr readnone captures(none) %1, ptr readnone captures(none) %2) #9 {
  %4 = tail call swiftcc %swift.metadata_response @"$s17OwnedApplications10DependencyVMr"(ptr %0, ptr readnone captures(none) %1, ptr readnone captures(none) %2) #9
  ret %swift.metadata_response %4
}

; Function Attrs: nounwind
define internal ptr @"$s17OwnedApplications7ForeignO10DependencyVwCP"(ptr noalias %0, ptr noalias %1, ptr readonly captures(none) %2) #9 {
  %4 = tail call ptr @"$s17OwnedApplications10DependencyVwCP"(ptr noalias %0, ptr noalias %1, ptr readonly captures(none) %2) #9
  ret ptr %4
}

; Function Attrs: nofree nounwind memory(read)
define internal i32 @"$s17OwnedApplications7ForeignO10DependencyVwet"(ptr noalias readonly %0, i32 %1, ptr readonly captures(none) %2) #13 {
  %4 = tail call i32 @"$s17OwnedApplications10DependencyVwet"(ptr noalias readonly %0, i32 %1, ptr readonly captures(none) %2) #13
  ret i32 %4
}

; Function Attrs: nounwind
define internal void @"$s17OwnedApplications11ConstrainedVwxx"(ptr noalias %0, ptr readonly captures(none) %1) #9 {
  tail call void @"$s17OwnedApplications10DependencyVwxx"(ptr noalias %0, ptr readonly captures(none) %1) #9
  ret void
}

; Function Attrs: nounwind
define internal void @"$s17OwnedApplications7ForeignO10DependencyVwxx"(ptr noalias %0, ptr readonly captures(none) %1) #9 {
  tail call void @"$s17OwnedApplications10DependencyVwxx"(ptr noalias %0, ptr readonly captures(none) %1) #9
  ret void
}

attributes #0 = { mustprogress nofree norecurse nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #1 = { "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #2 = { mustprogress nocallback nofree nosync nounwind willreturn memory(argmem: readwrite) }
attributes #3 = { mustprogress nocallback nofree nounwind willreturn memory(argmem: readwrite) }
attributes #4 = { mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #5 = { noinline nounwind "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #6 = { nofree nosync nounwind memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #7 = { nofree noinline nosync nounwind memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #8 = { nofree nounwind memory(read) }
attributes #9 = { nounwind "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #10 = { mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #11 = { mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #12 = { mustprogress nounwind willreturn }
attributes #13 = { nofree nounwind memory(read) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #14 = { mustprogress nocallback nofree nounwind willreturn memory(argmem: write) }
attributes #15 = { mustprogress nofree noinline nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #16 = { nounwind }
attributes #17 = { mustprogress nofree nounwind willreturn memory(read) }
attributes #18 = { mustprogress nofree noinline nounwind willreturn memory(read) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #19 = { nocallback nofree nosync nounwind speculatable willreturn memory(none) }
attributes #20 = { noinline }
attributes #21 = { nounwind memory(none) }
attributes #22 = { nounwind memory(read) }
attributes #23 = { nounwind willreturn memory(read) }
attributes #24 = { nounwind willreturn }

!llvm.module.flags = !{!0, !1, !2, !3, !4, !5, !6, !7, !8, !9, !10, !11}
!swift.module.flags = !{!12}
!llvm.linker.options = !{!13, !14, !15, !16}

!0 = !{i32 2, !"SDK Version", [2 x i32] [i32 26, i32 5]}
!1 = !{i32 1, !"Objective-C Version", i32 2}
!2 = !{i32 1, !"Objective-C Image Info Version", i32 0}
!3 = !{i32 1, !"Objective-C Image Info Section", !"__DATA,__objc_imageinfo,regular,no_dead_strip"}
!4 = !{i32 4, !"Objective-C Garbage Collection", i32 100861696}
!5 = !{i32 1, !"Objective-C Class Properties", i32 64}
!6 = !{i32 1, !"Objective-C Enforce ClassRO Pointer Signing", i8 0}
!7 = !{i32 1, !"wchar_size", i32 4}
!8 = !{i32 8, !"PIC Level", i32 2}
!9 = !{i32 7, !"uwtable", i32 1}
!10 = !{i32 7, !"frame-pointer", i32 1}
!11 = !{i32 1, !"Swift Version", i32 7}
!12 = !{!"standard-library", i1 false}
!13 = !{!"-lswift_Concurrency"}
!14 = !{!"-lswiftCore"}
!15 = !{!"-lswift_StringProcessing"}
!16 = !{!"-lobjc"}
!17 = !{}
!18 = !{i64 88}
