; ModuleID = '/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3/field-tests/arc-instance-flow-2026-11-23/fixture/ProjectionControls.ll'
source_filename = "/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3/field-tests/arc-instance-flow-2026-11-23/fixture/ProjectionControls.ll"
target datalayout = "e-m:o-p270:32:32-p271:32:32-p272:64:64-i64:64-i128:128-n32:64-S128-Fn32"
target triple = "arm64-apple-macosx14.0.0"

%swift.protocol = type { ptr, ptr, ptr, ptr, ptr, ptr, ptr, ptr, i32, i32, i32, i32, i32, i32 }
%swift.method_descriptor = type { i32, i32 }
%swift.protocol_requirement = type { i32, i32 }
%swift.enum_vwtable = type { ptr, ptr, ptr, ptr, ptr, ptr, ptr, ptr, i64, i64, i32, i32, ptr, ptr, ptr }
%swift.vwtable = type { ptr, ptr, ptr, ptr, ptr, ptr, ptr, ptr, i64, i64, i32, i32 }
%swift.type_descriptor = type opaque
%swift.type_metadata_record = type { i32 }
%swift.type = type { i64 }
%Ts6HasherV = type <{ %Ts6HasherV5_CoreV }>
%Ts6HasherV5_CoreV = type <{ %Ts6HasherV11_TailBufferV, %Ts6HasherV6_StateV }>
%Ts6HasherV11_TailBufferV = type <{ %Ts6UInt64V }>
%Ts6UInt64V = type <{ i64 }>
%Ts6HasherV6_StateV = type <{ %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V, %Ts6UInt64V }>
%T15OwnedProjection6ClientV = type <{ %swift.function }>
%swift.function = type { ptr, ptr }
%T15OwnedProjection6ValuesV = type <{ %T15OwnedProjection6ClientV, %T15OwnedProjection6ClientV }>
%swift.opaque = type opaque
%swift.metadata_response = type { ptr, i64 }

@keypath_once = private global i64 0, align 8
@"symbolic _____ 15OwnedProjection6ValuesV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection6ValuesVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 15OwnedProjection6ValuesV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic _____ 15OwnedProjection6ClientV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 15OwnedProjection6ClientV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@keypath = private global <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @keypath_once to i64), i64 ptrtoint (ptr @keypath to i64)) to i32), i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr getelementptr (i8, ptr @"symbolic _____ 15OwnedProjection6ValuesV", i64 1) to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @keypath, i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr getelementptr (i8, ptr @"symbolic _____ 15OwnedProjection6ClientV", i64 1) to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @keypath, i32 0, i32 3) to i64)) to i32), i32 0, i32 -2147483644, i32 25165824 }>, section "__TEXT,__const", no_sanitize_address, align 8
@keypath_once.1 = private global i64 0, align 8
@keypath.2 = private global <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @keypath_once.1 to i64), i64 ptrtoint (ptr @keypath.2 to i64)) to i32), i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr getelementptr (i8, ptr @"symbolic _____ 15OwnedProjection6ValuesV", i64 1) to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @keypath.2, i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr getelementptr (i8, ptr @"symbolic _____ 15OwnedProjection6ClientV", i64 1) to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @keypath.2, i32 0, i32 3) to i64)) to i32), i32 0, i32 -2147483644, i32 25165840 }>, section "__TEXT,__const", no_sanitize_address, align 8
@"$sSQMp" = external global %swift.protocol, align 4
@"got.$sSQMp" = private unnamed_addr constant ptr @"$sSQMp"
@"$sSQ2eeoiySbx_xtFZTq" = external global %swift.method_descriptor, align 4
@"got.$sSQ2eeoiySbx_xtFZTq" = private unnamed_addr constant ptr @"$sSQ2eeoiySbx_xtFZTq"
@"$s15OwnedProjection7SettingOSQAAMcMK" = internal global [16 x ptr] zeroinitializer
@"$s15OwnedProjection7SettingOSQAAMc" = constant { i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 } { i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSQMp" to i64), i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOSQAAMc" to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSQAAMc", i32 0, i32 1) to i64)) to i32), i32 0, i32 196608, i32 1, i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSQ2eeoiySbx_xtFZTq" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSQAAMc", i32 0, i32 5) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOSQAASQ2eeoiySbx_xtFZTW" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSQAAMc", i32 0, i32 6) to i64)) to i32), i16 0, i16 1, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOSQAAMcMK" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSQAAMc", i32 0, i32 10) to i64)) to i32) }, section "__TEXT,__const", no_sanitize_address, align 4
@"$s15OwnedProjection7SettingOACSQAAWL" = linkonce_odr hidden local_unnamed_addr global ptr null, align 8
@"associated conformance 15OwnedProjection7SettingOSHAASQ" = linkonce_odr hidden constant <{ i8, i8, i32, i8 }> <{ i8 -1, i8 7, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOSHAASQWb" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i8, i32, i8 }>, ptr @"associated conformance 15OwnedProjection7SettingOSHAASQ", i32 0, i32 2) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
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
@"$s15OwnedProjection7SettingOSHAAMcMK" = internal global [16 x ptr] zeroinitializer
@"$s15OwnedProjection7SettingOSHAAMc" = constant { i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 } { i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSHMp" to i64), i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOSHAAMc" to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSHAAMc", i32 0, i32 1) to i64)) to i32), i32 0, i32 196608, i32 4, i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSHSQTb" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSHAAMc", i32 0, i32 5) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr getelementptr (i8, ptr @"associated conformance 15OwnedProjection7SettingOSHAASQ", i64 1) to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSHAAMc", i32 0, i32 6) to i64)) to i32), i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSH9hashValueSivgTq" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSHAAMc", i32 0, i32 7) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOSHAASH9hashValueSivgTW" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSHAAMc", i32 0, i32 8) to i64)) to i32), i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSH4hash4intoys6HasherVz_tFTq" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSHAAMc", i32 0, i32 9) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOSHAASH4hash4intoys6HasherVz_tFTW" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSHAAMc", i32 0, i32 10) to i64)) to i32), i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sSH13_rawHashValue4seedS2i_tFTq" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSHAAMc", i32 0, i32 11) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOSHAASH13_rawHashValue4seedS2i_tFTW" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSHAAMc", i32 0, i32 12) to i64)) to i32), i16 0, i16 1, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOSHAAMcMK" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i32, i32 }, ptr @"$s15OwnedProjection7SettingOSHAAMc", i32 0, i32 16) to i64)) to i32) }, section "__TEXT,__const", no_sanitize_address, align 4
@"$s15OwnedProjection7SettingO9hashValueSivpMV" = unnamed_addr constant { i32 } zeroinitializer, align 4
@"$s15OwnedProjection7SettingOWV" = internal constant %swift.enum_vwtable { ptr @__swift_memcpy1_1, ptr @__swift_noop_void_return, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @__swift_memcpy1_1, ptr @"$s15OwnedProjection7SettingOwet", ptr @"$s15OwnedProjection7SettingOwst", i64 1, i64 1, i32 2097152, i32 253, ptr @"$s15OwnedProjection7SettingOwug", ptr @"$s15OwnedProjection7SettingOwup", ptr @"$s15OwnedProjection7SettingOwui" }, align 8
@.str.15.OwnedProjection = private constant [16 x i8] c"OwnedProjection\00"
@"$s15OwnedProjectionMXM" = linkonce_odr hidden constant <{ i32, i32, i32 }> <{ i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.15.OwnedProjection to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32 }>, ptr @"$s15OwnedProjectionMXM", i32 0, i32 2) to i64)) to i32) }>, section "__TEXT,__constg_swiftt", align 4
@.str.7.Setting = private constant [8 x i8] c"Setting\00"
@"$s15OwnedProjection7SettingOMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 82, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjectionMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s15OwnedProjection7SettingOMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.7.Setting to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s15OwnedProjection7SettingOMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s15OwnedProjection7SettingOMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s15OwnedProjection7SettingOMn", i32 0, i32 4) to i64)) to i32), i32 0, i32 3 }>, section "__TEXT,__constg_swiftt", align 4
@"$s15OwnedProjection7SettingOMf" = internal constant <{ ptr, ptr, i64, ptr }> <{ ptr null, ptr @"$s15OwnedProjection7SettingOWV", i64 513, ptr @"$s15OwnedProjection7SettingOMn" }>, align 8
@"symbolic _____ 15OwnedProjection7SettingO" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 15OwnedProjection7SettingO", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@0 = private constant [6 x i8] c"first\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@1 = private constant [7 x i8] c"second\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@2 = private constant [6 x i8] c"third\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s15OwnedProjection7SettingOMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 15OwnedProjection7SettingO" to i64), i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOMF" to i64)) to i32), i32 0, i16 2, i16 12, i32 3, i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @0 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s15OwnedProjection7SettingOMF", i32 0, i32 7) to i64)) to i32), i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @1 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s15OwnedProjection7SettingOMF", i32 0, i32 10) to i64)) to i32), i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @2 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s15OwnedProjection7SettingOMF", i32 0, i32 13) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s15OwnedProjection6ClientVWV" = internal constant %swift.vwtable { ptr @"$s15OwnedProjection6ClientVwCP", ptr @"$s15OwnedProjection6ClientVwxx", ptr @"$s15OwnedProjection6ClientVwcp", ptr @"$s15OwnedProjection6ClientVwca", ptr @__swift_memcpy16_8, ptr @"$s15OwnedProjection6ClientVwta", ptr @"$s15OwnedProjection6ClientVwet", ptr @"$s15OwnedProjection6ClientVwst", i64 16, i64 16, i32 65543, i32 2147483647 }, align 8
@.str.6.Client = private constant [7 x i8] c"Client\00"
@"$s15OwnedProjection6ClientVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjectionMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s15OwnedProjection6ClientVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.6.Client to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s15OwnedProjection6ClientVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection6ClientVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s15OwnedProjection6ClientVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection6ClientVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s15OwnedProjection6ClientVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s15OwnedProjection6ClientVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, [4 x i8] }> <{ ptr null, ptr @"$s15OwnedProjection6ClientVWV", i64 512, ptr @"$s15OwnedProjection6ClientVMn", i32 0, [4 x i8] zeroinitializer }>, align 8
@"symbolic Sb_____Ybc 15OwnedProjection7SettingO" = linkonce_odr hidden constant <{ [2 x i8], i8, i32, [3 x i8], i8 }> <{ [2 x i8] c"Sb", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ [2 x i8], i8, i32, [3 x i8], i8 }>, ptr @"symbolic Sb_____Ybc 15OwnedProjection7SettingO", i32 0, i32 2) to i64)) to i32), [3 x i8] c"Ybc", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@3 = private constant [5 x i8] c"read\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s15OwnedProjection6ClientVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 15OwnedProjection6ClientV" to i64), i64 ptrtoint (ptr @"$s15OwnedProjection6ClientVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Sb_____Ybc 15OwnedProjection7SettingO" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s15OwnedProjection6ClientVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @3 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s15OwnedProjection6ClientVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s15OwnedProjection6ValuesVWV" = internal constant %swift.vwtable { ptr @"$s15OwnedProjection6ValuesVwCP", ptr @"$s15OwnedProjection6ValuesVwxx", ptr @"$s15OwnedProjection6ValuesVwcp", ptr @"$s15OwnedProjection6ValuesVwca", ptr @__swift_memcpy32_8, ptr @"$s15OwnedProjection6ValuesVwta", ptr @"$s15OwnedProjection6ValuesVwet", ptr @"$s15OwnedProjection6ValuesVwst", i64 32, i64 32, i32 196615, i32 2147483647 }, align 8
@.str.6.Values = private constant [7 x i8] c"Values\00"
@"$s15OwnedProjection6ValuesVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjectionMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s15OwnedProjection6ValuesVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.6.Values to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s15OwnedProjection6ValuesVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection6ValuesVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s15OwnedProjection6ValuesVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection6ValuesVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s15OwnedProjection6ValuesVMn", i32 0, i32 4) to i64)) to i32), i32 2, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s15OwnedProjection6ValuesVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, i32 }> <{ ptr null, ptr @"$s15OwnedProjection6ValuesVWV", i64 512, ptr @"$s15OwnedProjection6ValuesVMn", i32 0, i32 16 }>, align 8
@"$s15OwnedProjection6ValuesVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 15OwnedProjection6ValuesV" to i64), i64 ptrtoint (ptr @"$s15OwnedProjection6ValuesVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 2, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 15OwnedProjection6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s15OwnedProjection6ValuesVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @0 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s15OwnedProjection6ValuesVMF", i32 0, i32 7) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 15OwnedProjection6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s15OwnedProjection6ValuesVMF", i32 0, i32 9) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @1 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s15OwnedProjection6ValuesVMF", i32 0, i32 10) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$sBoWV" = external global ptr, align 8
@"got.$sBoWV" = private unnamed_addr constant ptr @"$sBoWV"
@4 = internal constant <{ i32, [4 x i8] }> zeroinitializer, align 8
@.str.10.Dependency = private constant [11 x i8] c"Dependency\00"
@"$s15OwnedProjection10DependencyVMI" = internal global [16 x ptr] zeroinitializer, align 8
@"$s15OwnedProjection10DependencyVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }> <{ i32 209, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjectionMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s15OwnedProjection10DependencyVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.10.Dependency to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s15OwnedProjection10DependencyVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection10DependencyVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s15OwnedProjection10DependencyVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection10DependencyVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s15OwnedProjection10DependencyVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 3, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection10DependencyVMI" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s15OwnedProjection10DependencyVMn", i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection10DependencyVMP" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i16, i16, i16, i16, i8, i8, i8, i8 }>, ptr @"$s15OwnedProjection10DependencyVMn", i32 0, i32 8) to i64)) to i32), i16 1, i16 0, i16 1, i16 0, i8 -128, i8 0, i8 0, i8 0 }>, section "__TEXT,__constg_swiftt", align 4
@"$s15OwnedProjection10DependencyVMP" = internal constant <{ i32, i32, i32, i32, i32, i16, i16 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection10DependencyVMi" to i64), i64 ptrtoint (ptr @"$s15OwnedProjection10DependencyVMP" to i64)) to i32), i32 0, i32 1073741825, i32 add (i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$sBoWV" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i16, i16 }>, ptr @"$s15OwnedProjection10DependencyVMP", i32 0, i32 3) to i64)) to i32), i32 1), i32 trunc (i64 sub (i64 ptrtoint (ptr @4 to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i16, i16 }>, ptr @"$s15OwnedProjection10DependencyVMP", i32 0, i32 4) to i64)) to i32), i16 1, i16 1 }>, align 8
@"symbolic _____ 15OwnedProjection10DependencyV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection10DependencyVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 15OwnedProjection10DependencyV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"$ss7KeyPathCMn" = external global %swift.type_descriptor, align 4
@"got.$ss7KeyPathCMn" = private unnamed_addr constant ptr @"$ss7KeyPathCMn"
@"symbolic _____y_____xG s7KeyPathC 15OwnedProjection6ValuesV" = linkonce_odr hidden constant <{ i8, i32, [1 x i8], i8, i32, [2 x i8], i8 }> <{ i8 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$ss7KeyPathCMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [2 x i8], i8 }>, ptr @"symbolic _____y_____xG s7KeyPathC 15OwnedProjection6ValuesV", i32 0, i32 1) to i64)) to i32), [1 x i8] c"y", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection6ValuesVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, [2 x i8], i8 }>, ptr @"symbolic _____y_____xG s7KeyPathC 15OwnedProjection6ValuesV", i32 0, i32 4) to i64)) to i32), [2 x i8] c"xG", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@5 = private constant [8 x i8] c"keyPath\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s15OwnedProjection10DependencyVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 15OwnedProjection10DependencyV" to i64), i64 ptrtoint (ptr @"$s15OwnedProjection10DependencyVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y_____xG s7KeyPathC 15OwnedProjection6ValuesV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s15OwnedProjection10DependencyVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @5 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s15OwnedProjection10DependencyVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s15OwnedProjection7SettingOSQAAHc" = private constant i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOSQAAMc" to i64), i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOSQAAHc" to i64)) to i32), section "__TEXT, __swift5_proto, regular", no_sanitize_address, align 4
@"$s15OwnedProjection7SettingOSHAAHc" = private constant i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOSHAAMc" to i64), i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOSHAAHc" to i64)) to i32), section "__TEXT, __swift5_proto, regular", no_sanitize_address, align 4
@"$s15OwnedProjection7SettingOHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOMn" to i64), i64 ptrtoint (ptr @"$s15OwnedProjection7SettingOHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s15OwnedProjection6ClientVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection6ClientVMn" to i64), i64 ptrtoint (ptr @"$s15OwnedProjection6ClientVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s15OwnedProjection6ValuesVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection6ValuesVMn" to i64), i64 ptrtoint (ptr @"$s15OwnedProjection6ValuesVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s15OwnedProjection10DependencyVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s15OwnedProjection10DependencyVMn" to i64), i64 ptrtoint (ptr @"$s15OwnedProjection10DependencyVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@__swift_reflection_version = linkonce_odr hidden constant i16 3
@llvm.used = appending global [43 x ptr] [ptr @"$s15OwnedProjection10DependencyV7keyPaths03KeyE0CyAA6ValuesVxGvM", ptr @"$s15OwnedProjection10DependencyV7keyPaths03KeyE0CyAA6ValuesVxGvg", ptr @"$s15OwnedProjection10DependencyV7keyPaths03KeyE0CyAA6ValuesVxGvs", ptr @"$s15OwnedProjection10DependencyVHn", ptr @"$s15OwnedProjection10DependencyVMF", ptr @"$s15OwnedProjection10DependencyVMa", ptr @"$s15OwnedProjection10DependencyVMn", ptr @"$s15OwnedProjection3getyAA6ClientVAA6ValuesV_AA10DependencyVyADGtF", ptr @"$s15OwnedProjection5firstyAA6ClientVAA6ValuesVF", ptr @"$s15OwnedProjection6ClientV4readySbAA7SettingOYbcvg", ptr @"$s15OwnedProjection6ClientVHn", ptr @"$s15OwnedProjection6ClientVMF", ptr @"$s15OwnedProjection6ClientVMa", ptr @"$s15OwnedProjection6ClientVMn", ptr @"$s15OwnedProjection6ClientVN", ptr @"$s15OwnedProjection6ValuesV5firstAA6ClientVvM", ptr @"$s15OwnedProjection6ValuesV5firstAA6ClientVvg", ptr @"$s15OwnedProjection6ValuesV5firstAA6ClientVvs", ptr @"$s15OwnedProjection6ValuesV6secondAA6ClientVvM", ptr @"$s15OwnedProjection6ValuesV6secondAA6ClientVvg", ptr @"$s15OwnedProjection6ValuesV6secondAA6ClientVvs", ptr @"$s15OwnedProjection6ValuesVHn", ptr @"$s15OwnedProjection6ValuesVMF", ptr @"$s15OwnedProjection6ValuesVMa", ptr @"$s15OwnedProjection6ValuesVMn", ptr @"$s15OwnedProjection6ValuesVN", ptr @"$s15OwnedProjection6rebindyyAA10DependencyVyAA6ClientVGzF", ptr @"$s15OwnedProjection6secondyAA6ClientVAA6ValuesVF", ptr @"$s15OwnedProjection7SettingO21__derived_enum_equalsySbAC_ACtFZ", ptr @"$s15OwnedProjection7SettingO4hash4intoys6HasherVz_tF", ptr @"$s15OwnedProjection7SettingO9hashValueSivg", ptr @"$s15OwnedProjection7SettingO9hashValueSivpMV", ptr @"$s15OwnedProjection7SettingOHn", ptr @"$s15OwnedProjection7SettingOMF", ptr @"$s15OwnedProjection7SettingOMa", ptr @"$s15OwnedProjection7SettingOMn", ptr @"$s15OwnedProjection7SettingON", ptr @"$s15OwnedProjection7SettingOSHAAHc", ptr @"$s15OwnedProjection7SettingOSHAAMc", ptr @"$s15OwnedProjection7SettingOSQAAHc", ptr @"$s15OwnedProjection7SettingOSQAAMc", ptr @"$s15OwnedProjection7projectyq_x_s7KeyPathCyxq_Gtr0_lF", ptr @__swift_reflection_version], section "llvm.metadata"

@"$s15OwnedProjection6ClientV4readySbAA7SettingOYbcvpMV" = alias { i32 }, ptr @"$s15OwnedProjection7SettingO9hashValueSivpMV"
@"$s15OwnedProjection6ValuesV5firstAA6ClientVvpMV" = alias { i32 }, ptr @"$s15OwnedProjection7SettingO9hashValueSivpMV"
@"$s15OwnedProjection6ValuesV6secondAA6ClientVvpMV" = alias { i32 }, ptr @"$s15OwnedProjection7SettingO9hashValueSivpMV"
@"$s15OwnedProjection10DependencyV7keyPaths03KeyE0CyAA6ValuesVxGvpMV" = alias { i32 }, ptr @"$s15OwnedProjection7SettingO9hashValueSivpMV"
@"$s15OwnedProjection7SettingON" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr }>, ptr @"$s15OwnedProjection7SettingOMf", i32 0, i32 2)
@"$s15OwnedProjection6ClientVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s15OwnedProjection6ClientVMf", i32 0, i32 2)
@"$s15OwnedProjection6ValuesVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32 }>, ptr @"$s15OwnedProjection6ValuesVMf", i32 0, i32 2)

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i1 @"$s15OwnedProjection7SettingO21__derived_enum_equalsySbAC_ACtFZ"(i8 %0, i8 %1) #0 {
entry:
  %2 = icmp eq i8 %0, %1
  ret i1 %2
}

define swiftcc void @"$s15OwnedProjection7SettingO4hash4intoys6HasherVz_tF"(ptr captures(none) dereferenceable(72) %0, i8 %1) #1 {
entry:
  %2 = zext i8 %1 to i64
  tail call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %2, ptr nonnull swiftself captures(none) dereferenceable(72) %0)
  ret void
}

declare swiftcc void @"$ss6HasherV8_combineyySuF"(i64, ptr swiftself captures(none) dereferenceable(72)) local_unnamed_addr #1

define swiftcc i64 @"$s15OwnedProjection7SettingO9hashValueSivg"(i8 %0) #1 {
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

define linkonce_odr hidden swiftcc i1 @"$s15OwnedProjection7SettingOSQAASQ2eeoiySbx_xtFZTW"(ptr noalias captures(none) dereferenceable(1) %0, ptr noalias captures(none) dereferenceable(1) %1, ptr swiftself %2, ptr %Self, ptr %SelfWitnessTable) #1 {
entry:
  %3 = load i8, ptr %0, align 1
  %4 = load i8, ptr %1, align 1
  %5 = icmp eq i8 %3, %4
  ret i1 %5
}

define linkonce_odr hidden swiftcc i64 @"$s15OwnedProjection7SettingOSHAASH9hashValueSivgTW"(ptr noalias swiftself captures(none) dereferenceable(1) %0, ptr %Self, ptr %SelfWitnessTable) #1 {
entry:
  %1 = alloca %Ts6HasherV, align 8
  %2 = load i8, ptr %0, align 1
  call void @llvm.lifetime.start.p0(i64 72, ptr nonnull %1)
  call swiftcc void @"$ss6HasherV5_seedABSi_tcfC"(ptr noalias nonnull sret(%Ts6HasherV) captures(none) %1, i64 0) #19
  %3 = zext i8 %2 to i64
  call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %3, ptr nonnull swiftself captures(none) dereferenceable(72) %1) #19
  %4 = call swiftcc i64 @"$ss6HasherV9_finalizeSiyF"(ptr nonnull swiftself captures(none) dereferenceable(72) %1) #19
  call void @llvm.lifetime.end.p0(i64 72, ptr nonnull %1)
  ret i64 %4
}

define linkonce_odr hidden swiftcc void @"$s15OwnedProjection7SettingOSHAASH4hash4intoys6HasherVz_tFTW"(ptr captures(none) dereferenceable(72) %0, ptr noalias swiftself captures(none) dereferenceable(1) %1, ptr %Self, ptr %SelfWitnessTable) #1 {
entry:
  %2 = load i8, ptr %1, align 1
  %3 = zext i8 %2 to i64
  tail call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %3, ptr nonnull swiftself captures(none) dereferenceable(72) %0) #19
  ret void
}

define linkonce_odr hidden swiftcc i64 @"$s15OwnedProjection7SettingOSHAASH13_rawHashValue4seedS2i_tFTW"(i64 %0, ptr noalias swiftself captures(none) dereferenceable(1) %1, ptr %Self, ptr %SelfWitnessTable) #1 {
entry:
  %2 = alloca %Ts6HasherV, align 8
  %3 = load i8, ptr %1, align 1
  call void @llvm.lifetime.start.p0(i64 72, ptr nonnull %2)
  call swiftcc void @"$ss6HasherV5_seedABSi_tcfC"(ptr noalias nonnull sret(%Ts6HasherV) captures(none) %2, i64 %0) #19
  %4 = zext i8 %3 to i64
  call swiftcc void @"$ss6HasherV8_combineyySuF"(i64 %4, ptr nonnull swiftself captures(none) dereferenceable(72) %2) #19
  %5 = call swiftcc i64 @"$ss6HasherV9_finalizeSiyF"(ptr nonnull swiftself captures(none) dereferenceable(72) %2) #19
  call void @llvm.lifetime.end.p0(i64 72, ptr nonnull %2)
  ret i64 %5
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc { ptr, ptr } @"$s15OwnedProjection6ClientV4readySbAA7SettingOYbcvg"(ptr %0, ptr %1) #4 {
entry:
  %2 = insertvalue { ptr, ptr } undef, ptr %0, 0
  %3 = insertvalue { ptr, ptr } %2, ptr %1, 1
  %4 = tail call ptr @swift_retain(ptr returned %1) #20
  ret { ptr, ptr } %3
}

; Function Attrs: mustprogress nounwind willreturn
declare ptr @swift_retain(ptr returned) local_unnamed_addr #5

; Function Attrs: mustprogress nounwind willreturn
define swiftcc { ptr, ptr } @"$s15OwnedProjection6ValuesV5firstAA6ClientVvg"(ptr %0, ptr %1, ptr readnone captures(none) %2, ptr readnone captures(none) %3) #4 {
entry:
  %4 = insertvalue { ptr, ptr } undef, ptr %0, 0
  %5 = insertvalue { ptr, ptr } %4, ptr %1, 1
  %6 = tail call ptr @swift_retain(ptr returned %1) #20
  ret { ptr, ptr } %5
}

; Function Attrs: nounwind
define swiftcc void @"$s15OwnedProjection6ValuesV5firstAA6ClientVvs"(ptr %0, ptr %1, ptr swiftself captures(none) dereferenceable(32) initializes((0, 8)) %2) #6 {
entry:
  %.first.read.data = getelementptr inbounds nuw i8, ptr %2, i64 8
  %3 = load ptr, ptr %.first.read.data, align 8
  tail call void @swift_release(ptr %3) #7
  store ptr %0, ptr %2, align 8
  store ptr %1, ptr %.first.read.data, align 8
  ret void
}

; Function Attrs: nounwind
declare void @swift_release(ptr) local_unnamed_addr #7

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s15OwnedProjection6ValuesV5firstAA6ClientVvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(32) %1) #8 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s15OwnedProjection6ValuesV5firstAA6ClientVvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s15OwnedProjection6ValuesV5firstAA6ClientVvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc { ptr, ptr } @"$s15OwnedProjection6ValuesV6secondAA6ClientVvg"(ptr readnone captures(none) %0, ptr readnone captures(none) %1, ptr %2, ptr %3) #4 {
entry:
  %4 = insertvalue { ptr, ptr } undef, ptr %2, 0
  %5 = insertvalue { ptr, ptr } %4, ptr %3, 1
  %6 = tail call ptr @swift_retain(ptr returned %3) #20
  ret { ptr, ptr } %5
}

; Function Attrs: nounwind
define swiftcc void @"$s15OwnedProjection6ValuesV6secondAA6ClientVvs"(ptr %0, ptr %1, ptr swiftself captures(none) dereferenceable(32) initializes((16, 24)) %2) #6 {
entry:
  %.second = getelementptr inbounds nuw i8, ptr %2, i64 16
  %.second.read.data = getelementptr inbounds nuw i8, ptr %2, i64 24
  %3 = load ptr, ptr %.second.read.data, align 8
  tail call void @swift_release(ptr %3) #7
  store ptr %0, ptr %.second, align 8
  store ptr %1, ptr %.second.read.data, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s15OwnedProjection6ValuesV6secondAA6ClientVvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(32) %1) #8 {
coro.return:
  %.second = getelementptr inbounds nuw i8, ptr %1, i64 16
  %2 = insertvalue { ptr, ptr } { ptr @"$s15OwnedProjection6ValuesV6secondAA6ClientVvM.resume.0", ptr poison }, ptr %.second, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s15OwnedProjection6ValuesV6secondAA6ClientVvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc ptr @"$s15OwnedProjection10DependencyV7keyPaths03KeyE0CyAA6ValuesVxGvg"(ptr returned %0, ptr readnone captures(none) %Value) #4 {
entry:
  %1 = tail call ptr @swift_retain(ptr returned %0) #20
  ret ptr %0
}

; Function Attrs: nounwind
define swiftcc void @"$s15OwnedProjection10DependencyV7keyPaths03KeyE0CyAA6ValuesVxGvs"(ptr %0, ptr readnone captures(none) %"Dependency<Value>", ptr swiftself captures(none) dereferenceable(8) %1) #6 {
entry:
  %2 = load ptr, ptr %1, align 8
  tail call void @swift_release(ptr %2) #7
  store ptr %0, ptr %1, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s15OwnedProjection10DependencyV7keyPaths03KeyE0CyAA6ValuesVxGvM"(ptr noalias dereferenceable(32) %0, ptr readnone captures(none) %"Dependency<Value>", ptr swiftself captures(none) dereferenceable(8) %1) #8 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s15OwnedProjection10DependencyV7keyPaths03KeyE0CyAA6ValuesVxGvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s15OwnedProjection10DependencyV7keyPaths03KeyE0CyAA6ValuesVxGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: noinline
define linkonce_odr hidden swiftcc { ptr, ptr } @"$s15OwnedProjection7projectyq_x_s7KeyPathCyxq_Gtr0_lFAA6ValuesV_AA6ClientVTg5"(ptr %0, ptr %1, ptr %2, ptr %3, ptr %4) local_unnamed_addr #9 {
entry:
  %5 = alloca %T15OwnedProjection6ClientV, align 8
  %6 = alloca %T15OwnedProjection6ValuesV, align 8
  call void @llvm.lifetime.start.p0(i64 16, ptr nonnull %5)
  call void @llvm.lifetime.start.p0(i64 32, ptr nonnull %6)
  store ptr %0, ptr %6, align 8
  %.first.read.data = getelementptr inbounds nuw i8, ptr %6, i64 8
  store ptr %1, ptr %.first.read.data, align 8
  %.second = getelementptr inbounds nuw i8, ptr %6, i64 16
  store ptr %2, ptr %.second, align 8
  %.second.read.data = getelementptr inbounds nuw i8, ptr %6, i64 24
  store ptr %3, ptr %.second.read.data, align 8
  call swiftcc void @swift_getAtKeyPath(ptr noalias nonnull sret(%swift.opaque) %5, ptr noalias nonnull %6, ptr %4)
  %7 = load ptr, ptr %5, align 8
  %.read.data = getelementptr inbounds nuw i8, ptr %5, i64 8
  %8 = load ptr, ptr %.read.data, align 8
  call void @llvm.lifetime.end.p0(i64 32, ptr nonnull %6)
  call void @llvm.lifetime.end.p0(i64 16, ptr nonnull %5)
  %9 = insertvalue { ptr, ptr } undef, ptr %7, 0
  %10 = insertvalue { ptr, ptr } %9, ptr %8, 1
  ret { ptr, ptr } %10
}

; Function Attrs: noinline
define swiftcc void @"$s15OwnedProjection7projectyq_x_s7KeyPathCyxq_Gtr0_lF"(ptr noalias sret(%swift.opaque) %0, ptr noalias %1, ptr %2) #9 {
entry:
  tail call swiftcc void @swift_getAtKeyPath(ptr noalias sret(%swift.opaque) %0, ptr noalias %1, ptr %2)
  ret void
}

declare swiftcc void @swift_getAtKeyPath(ptr noalias sret(%swift.opaque), ptr noalias, ptr) local_unnamed_addr #1

; Function Attrs: noinline
define swiftcc { ptr, ptr } @"$s15OwnedProjection5firstyAA6ClientVAA6ValuesVF"(ptr %0, ptr %1, ptr %2, ptr %3) #9 {
  %5 = tail call swiftcc { ptr, ptr } @"$s15OwnedProjection5firstyAA6ClientVAA6ValuesVFTm"(ptr %0, ptr %1, ptr %2, ptr %3, ptr @keypath) #9
  ret { ptr, ptr } %5
}

; Function Attrs: nounwind
declare ptr @swift_getKeyPath(ptr, ptr) local_unnamed_addr #7

; Function Attrs: noinline
define swiftcc { ptr, ptr } @"$s15OwnedProjection6secondyAA6ClientVAA6ValuesVF"(ptr %0, ptr %1, ptr %2, ptr %3) #9 {
  %5 = tail call swiftcc { ptr, ptr } @"$s15OwnedProjection5firstyAA6ClientVAA6ValuesVFTm"(ptr %0, ptr %1, ptr %2, ptr %3, ptr @keypath.2) #9
  ret { ptr, ptr } %5
}

; Function Attrs: noinline
define internal swiftcc { ptr, ptr } @"$s15OwnedProjection5firstyAA6ClientVAA6ValuesVFTm"(ptr %0, ptr %1, ptr %2, ptr %3, ptr %4) #9 {
entry:
  %5 = tail call ptr @swift_getKeyPath(ptr nonnull %4, ptr undef) #7
  %6 = tail call swiftcc { ptr, ptr } @"$s15OwnedProjection7projectyq_x_s7KeyPathCyxq_Gtr0_lFAA6ValuesV_AA6ClientVTg5"(ptr %0, ptr %1, ptr %2, ptr %3, ptr %5)
  tail call void @swift_release(ptr %5) #7
  ret { ptr, ptr } %6
}

; Function Attrs: noinline
define swiftcc { ptr, ptr } @"$s15OwnedProjection3getyAA6ClientVAA6ValuesV_AA10DependencyVyADGtF"(ptr %0, ptr %1, ptr %2, ptr %3, ptr %4) #9 {
entry:
  %5 = tail call swiftcc { ptr, ptr } @"$s15OwnedProjection7projectyq_x_s7KeyPathCyxq_Gtr0_lFAA6ValuesV_AA6ClientVTg5"(ptr %0, ptr %1, ptr %2, ptr %3, ptr %4)
  ret { ptr, ptr } %5
}

; Function Attrs: noinline nounwind
define swiftcc void @"$s15OwnedProjection6rebindyyAA10DependencyVyAA6ClientVGzF"(ptr captures(none) dereferenceable(8) %0) #8 {
entry:
  %1 = tail call ptr @swift_getKeyPath(ptr nonnull @keypath.2, ptr undef) #7
  %2 = load ptr, ptr %0, align 8
  tail call void @swift_release(ptr %2) #7
  store ptr %1, ptr %0, align 8
  ret void
}

; Function Attrs: nofree nosync nounwind memory(none)
define internal swiftcc ptr @"$s15OwnedProjection7SettingOSHAASQWb"(ptr readnone captures(none) %Setting, ptr readnone captures(none) %Setting1, ptr readnone captures(none) %Setting.Hashable) #10 {
entry:
  %0 = tail call ptr @"$s15OwnedProjection7SettingOACSQAAWl"() #21
  ret ptr %0
}

; Function Attrs: nofree noinline nosync nounwind memory(none)
define linkonce_odr hidden ptr @"$s15OwnedProjection7SettingOACSQAAWl"() local_unnamed_addr #11 {
entry:
  %0 = load ptr, ptr @"$s15OwnedProjection7SettingOACSQAAWL", align 8
  %1 = icmp eq ptr %0, null
  br i1 %1, label %cacheIsNull, label %cont

cacheIsNull:                                      ; preds = %entry
  %2 = tail call ptr @swift_getWitnessTable(ptr nonnull @"$s15OwnedProjection7SettingOSQAAMc", ptr nonnull getelementptr inbounds nuw (i8, ptr @"$s15OwnedProjection7SettingOMf", i64 16), ptr undef) #22
  store atomic ptr %2, ptr @"$s15OwnedProjection7SettingOACSQAAWL" release, align 8
  br label %cont

cont:                                             ; preds = %cacheIsNull, %entry
  %3 = phi ptr [ %0, %entry ], [ %2, %cacheIsNull ]
  ret ptr %3
}

; Function Attrs: nofree nounwind memory(read)
declare ptr @swift_getWitnessTable(ptr, ptr, ptr) local_unnamed_addr #12

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy1_1(ptr %0, ptr %1, ptr %2) #6 {
entry:
  %3 = load i8, ptr %1, align 1
  store i8 %3, ptr %0, align 1
  ret ptr %0
}

; Function Attrs: nounwind
define linkonce_odr hidden void @__swift_noop_void_return(ptr %0, ptr %1) #6 {
entry:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s15OwnedProjection7SettingOwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Setting) #13 {
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
define internal void @"$s15OwnedProjection7SettingOwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Setting) #14 {
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
define internal range(i32 0, 256) i32 @"$s15OwnedProjection7SettingOwug"(ptr noalias readonly captures(none) %value, ptr readnone captures(none) %Setting) #13 {
entry:
  %0 = load i8, ptr %value, align 1
  %1 = zext i8 %0 to i32
  ret i32 %1
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal void @"$s15OwnedProjection7SettingOwup"(ptr noalias readnone captures(none) %value, ptr readnone captures(none) %Setting) #0 {
entry:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s15OwnedProjection7SettingOwui"(ptr noalias writeonly captures(none) initializes((0, 1)) %value, i32 %tag, ptr readnone captures(none) %Setting) #14 {
entry:
  %0 = trunc i32 %tag to i8
  store i8 %0, ptr %value, align 1
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s15OwnedProjection7SettingOMa"(i64 %0) #15 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr }>, ptr @"$s15OwnedProjection7SettingOMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nounwind willreturn
define internal noundef ptr @"$s15OwnedProjection6ClientVwCP"(ptr noalias returned writeonly captures(ret: address, provenance) initializes((0, 16)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Client) #4 {
entry:
  %src.read.data = getelementptr inbounds nuw i8, ptr %src, i64 8
  %0 = load ptr, ptr %src.read.data, align 8
  %1 = load <2 x ptr>, ptr %src, align 8
  store <2 x ptr> %1, ptr %dest, align 8
  %2 = tail call ptr @swift_retain(ptr returned %0) #20
  ret ptr %dest
}

; Function Attrs: nounwind
define internal void @"$s15OwnedProjection6ClientVwxx"(ptr noalias readonly captures(none) %object, ptr readnone captures(none) %Client) #6 {
entry:
  %object.read.data = getelementptr inbounds nuw i8, ptr %object, i64 8
  %0 = load ptr, ptr %object.read.data, align 8
  tail call void @swift_release(ptr %0) #7
  ret void
}

; Function Attrs: nounwind
define internal noundef ptr @"$s15OwnedProjection6ClientVwca"(ptr returned captures(ret: address, provenance) initializes((0, 8)) %dest, ptr readonly captures(none) %src, ptr readnone captures(none) %Client) #6 {
entry:
  %src.read.data = getelementptr inbounds nuw i8, ptr %src, i64 8
  %dest.read.data = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %0 = load ptr, ptr %dest.read.data, align 8
  %1 = load ptr, ptr %src.read.data, align 8
  %2 = load <2 x ptr>, ptr %src, align 8
  store <2 x ptr> %2, ptr %dest, align 8
  %3 = tail call ptr @swift_retain(ptr returned %1) #20
  tail call void @swift_release(ptr %0) #7
  ret ptr %dest
}

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy16_8(ptr %0, ptr %1, ptr %2) #6 {
entry:
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(16) %0, ptr noundef nonnull align 8 dereferenceable(16) %1, i64 16, i1 false)
  ret ptr %0
}

; Function Attrs: nounwind
define internal noundef ptr @"$s15OwnedProjection6ClientVwta"(ptr noalias returned captures(ret: address, provenance) initializes((0, 8)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Client) #6 {
entry:
  %dest.read.data = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %0 = load ptr, ptr %dest.read.data, align 8
  %1 = load <2 x ptr>, ptr %src, align 8
  store <2 x ptr> %1, ptr %dest, align 8
  tail call void @swift_release(ptr %0) #7
  ret ptr %dest
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s15OwnedProjection6ClientVwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Client) #13 {
entry:
  %0 = icmp eq i32 %numEmptyCases, 0
  br i1 %0, label %12, label %1

1:                                                ; preds = %entry
  %2 = icmp slt i32 %numEmptyCases, 0
  br i1 %2, label %3, label %is-valid-pointer

3:                                                ; preds = %1
  %4 = getelementptr inbounds nuw i8, ptr %value, i64 16
  %5 = load i8, ptr %4, align 1
  %6 = icmp eq i8 %5, 0
  br i1 %6, label %is-valid-pointer, label %7

7:                                                ; preds = %3
  %8 = load i128, ptr %value, align 1
  %9 = trunc i128 %8 to i32
  %10 = add i32 %9, 2147483647
  br label %12

is-valid-pointer:                                 ; preds = %3, %1
  %11 = load i64, ptr %value, align 8
  %spec.select1 = tail call i64 @llvm.umin.i64(i64 %11, i64 4294967295)
  %spec.select = trunc nuw i64 %spec.select1 to i32
  br label %12

12:                                               ; preds = %entry, %is-valid-pointer, %7
  %13 = phi i32 [ %spec.select, %is-valid-pointer ], [ %10, %7 ], [ -1, %entry ]
  %14 = add i32 %13, 1
  ret i32 %14
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s15OwnedProjection6ClientVwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Client) #14 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 16
  %1 = icmp slt i32 %numEmptyCases, 0
  %2 = icmp sgt i32 %whichCase, -1
  br i1 %2, label %3, label %10

3:                                                ; preds = %entry
  br i1 %1, label %4, label %5

4:                                                ; preds = %3
  store i8 0, ptr %0, align 8
  br label %5

5:                                                ; preds = %3, %4
  %6 = icmp eq i32 %whichCase, 0
  br i1 %6, label %14, label %7

7:                                                ; preds = %5
  %8 = add nsw i32 %whichCase, -1
  %9 = zext nneg i32 %8 to i64
  store i64 %9, ptr %value, align 8
  br label %14

10:                                               ; preds = %entry
  %11 = and i32 %whichCase, 2147483647
  %12 = zext nneg i32 %11 to i128
  store i128 %12, ptr %value, align 8
  br i1 %1, label %13, label %14

13:                                               ; preds = %10
  store i8 1, ptr %0, align 8
  br label %14

14:                                               ; preds = %10, %13, %7, %5
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s15OwnedProjection6ClientVMa"(i64 %0) #15 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s15OwnedProjection6ClientVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nounwind willreturn
define internal nonnull ptr @"$s15OwnedProjection6ValuesVwCP"(ptr noalias writeonly captures(none) initializes((0, 8)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Values) #4 {
entry:
  %0 = load ptr, ptr %src, align 8
  store ptr %0, ptr %dest, align 8
  %1 = getelementptr inbounds nuw i8, ptr %0, i64 16
  %2 = tail call ptr @swift_retain(ptr returned %0) #20
  ret ptr %1
}

; Function Attrs: nounwind
define internal void @"$s15OwnedProjection6ValuesVwxx"(ptr noalias readonly captures(none) %object, ptr readnone captures(none) %Values) #6 {
entry:
  %object.first.read.data = getelementptr inbounds nuw i8, ptr %object, i64 8
  %0 = load ptr, ptr %object.first.read.data, align 8
  tail call void @swift_release(ptr %0) #7
  %object.second.read.data = getelementptr inbounds nuw i8, ptr %object, i64 24
  %1 = load ptr, ptr %object.second.read.data, align 8
  tail call void @swift_release(ptr %1) #7
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define internal noundef ptr @"$s15OwnedProjection6ValuesVwcp"(ptr noalias returned writeonly captures(ret: address, provenance) initializes((0, 32)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Values) #4 {
entry:
  %src.first.read.data = getelementptr inbounds nuw i8, ptr %src, i64 8
  %0 = load ptr, ptr %src.first.read.data, align 8
  %1 = load <2 x ptr>, ptr %src, align 8
  store <2 x ptr> %1, ptr %dest, align 8
  %dest.second = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.second = getelementptr inbounds nuw i8, ptr %src, i64 16
  %src.second.read.data = getelementptr inbounds nuw i8, ptr %src, i64 24
  %2 = load ptr, ptr %src.second.read.data, align 8
  %3 = load <2 x ptr>, ptr %src.second, align 8
  store <2 x ptr> %3, ptr %dest.second, align 8
  %4 = tail call ptr @swift_retain(ptr returned %0) #20
  %5 = tail call ptr @swift_retain(ptr returned %2) #20
  ret ptr %dest
}

; Function Attrs: nounwind
define internal noundef ptr @"$s15OwnedProjection6ValuesVwca"(ptr returned captures(ret: address, provenance) initializes((0, 8), (16, 24)) %dest, ptr readonly captures(none) %src, ptr readnone captures(none) %Values) #6 {
entry:
  %src.first.read.data = getelementptr inbounds nuw i8, ptr %src, i64 8
  %dest.first.read.data = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %0 = load ptr, ptr %dest.first.read.data, align 8
  %1 = load ptr, ptr %src.first.read.data, align 8
  %2 = load <2 x ptr>, ptr %src, align 8
  store <2 x ptr> %2, ptr %dest, align 8
  %3 = tail call ptr @swift_retain(ptr returned %1) #20
  tail call void @swift_release(ptr %0) #7
  %dest.second = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.second = getelementptr inbounds nuw i8, ptr %src, i64 16
  %src.second.read.data = getelementptr inbounds nuw i8, ptr %src, i64 24
  %dest.second.read.data = getelementptr inbounds nuw i8, ptr %dest, i64 24
  %4 = load ptr, ptr %dest.second.read.data, align 8
  %5 = load ptr, ptr %src.second.read.data, align 8
  %6 = load <2 x ptr>, ptr %src.second, align 8
  store <2 x ptr> %6, ptr %dest.second, align 8
  %7 = tail call ptr @swift_retain(ptr returned %5) #20
  tail call void @swift_release(ptr %4) #7
  ret ptr %dest
}

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy32_8(ptr %0, ptr %1, ptr %2) #6 {
entry:
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(32) %0, ptr noundef nonnull align 8 dereferenceable(32) %1, i64 32, i1 false)
  ret ptr %0
}

; Function Attrs: nounwind
define internal noundef ptr @"$s15OwnedProjection6ValuesVwta"(ptr noalias returned captures(ret: address, provenance) initializes((0, 8), (16, 24)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Values) #6 {
entry:
  %dest.first.read.data = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %0 = load ptr, ptr %dest.first.read.data, align 8
  %1 = load <2 x ptr>, ptr %src, align 8
  store <2 x ptr> %1, ptr %dest, align 8
  tail call void @swift_release(ptr %0) #7
  %dest.second = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.second = getelementptr inbounds nuw i8, ptr %src, i64 16
  %dest.second.read.data = getelementptr inbounds nuw i8, ptr %dest, i64 24
  %2 = load ptr, ptr %dest.second.read.data, align 8
  %3 = load <2 x ptr>, ptr %src.second, align 8
  store <2 x ptr> %3, ptr %dest.second, align 8
  tail call void @swift_release(ptr %2) #7
  ret ptr %dest
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s15OwnedProjection6ValuesVwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Values) #13 {
entry:
  %0 = icmp eq i32 %numEmptyCases, 0
  br i1 %0, label %12, label %1

1:                                                ; preds = %entry
  %2 = icmp slt i32 %numEmptyCases, 0
  br i1 %2, label %3, label %is-valid-pointer

3:                                                ; preds = %1
  %4 = getelementptr inbounds nuw i8, ptr %value, i64 32
  %5 = load i8, ptr %4, align 1
  %6 = icmp eq i8 %5, 0
  br i1 %6, label %is-valid-pointer, label %7

7:                                                ; preds = %3
  %8 = load i256, ptr %value, align 1
  %9 = trunc i256 %8 to i32
  %10 = add i32 %9, 2147483647
  br label %12

is-valid-pointer:                                 ; preds = %3, %1
  %11 = load i64, ptr %value, align 8
  %spec.select1 = tail call i64 @llvm.umin.i64(i64 %11, i64 4294967295)
  %spec.select = trunc nuw i64 %spec.select1 to i32
  br label %12

12:                                               ; preds = %entry, %is-valid-pointer, %7
  %13 = phi i32 [ %spec.select, %is-valid-pointer ], [ %10, %7 ], [ -1, %entry ]
  %14 = add i32 %13, 1
  ret i32 %14
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s15OwnedProjection6ValuesVwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Values) #14 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 32
  %1 = icmp slt i32 %numEmptyCases, 0
  %2 = icmp sgt i32 %whichCase, -1
  br i1 %2, label %3, label %10

3:                                                ; preds = %entry
  br i1 %1, label %4, label %5

4:                                                ; preds = %3
  store i8 0, ptr %0, align 8
  br label %5

5:                                                ; preds = %3, %4
  %6 = icmp eq i32 %whichCase, 0
  br i1 %6, label %14, label %7

7:                                                ; preds = %5
  %8 = add nsw i32 %whichCase, -1
  %9 = zext nneg i32 %8 to i64
  store i64 %9, ptr %value, align 8
  br label %14

10:                                               ; preds = %entry
  %11 = and i32 %whichCase, 2147483647
  %12 = zext nneg i32 %11 to i256
  store i256 %12, ptr %value, align 8
  br i1 %1, label %13, label %14

13:                                               ; preds = %10
  store i8 1, ptr %0, align 8
  br label %14

14:                                               ; preds = %10, %13, %7, %5
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s15OwnedProjection6ValuesVMa"(i64 %0) #15 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32 }>, ptr @"$s15OwnedProjection6ValuesVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: nounwind
define internal ptr @"$s15OwnedProjection10DependencyVMi"(ptr %0, ptr %1, ptr %2) #6 {
entry:
  %3 = tail call ptr @swift_allocateGenericValueMetadata(ptr %0, ptr %1, ptr %2, i64 16) #7
  ret ptr %3
}

; Function Attrs: mustprogress nofree noinline nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s15OwnedProjection10DependencyVMa"(i64 %0, ptr readnone %1) #16 {
entry:
  %2 = tail call swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr undef, ptr undef, ptr nonnull @"$s15OwnedProjection10DependencyVMn") #21
  ret %swift.metadata_response %2
}

; Function Attrs: nounwind
declare ptr @swift_allocateGenericValueMetadata(ptr, ptr, ptr, i64) local_unnamed_addr #7

; Function Attrs: mustprogress nofree noinline nounwind willreturn memory(read)
define linkonce_odr hidden swiftcc %swift.metadata_response @__swift_instantiateGenericMetadata(i64 %0, ptr %1, ptr %2, ptr %3, ptr %4) local_unnamed_addr #17 {
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
declare swiftcc %swift.metadata_response @swift_getGenericMetadata(i64, ptr, ptr) local_unnamed_addr #12

; Function Attrs: nocallback nofree nosync nounwind speculatable willreturn memory(none)
declare i64 @llvm.umin.i64(i64, i64) #18

; Function Attrs: mustprogress nounwind willreturn
define internal noundef ptr @"$s15OwnedProjection6ClientVwcp"(ptr noalias returned writeonly captures(ret: address, provenance) initializes((0, 16)) %0, ptr noalias readonly captures(none) %1, ptr readnone captures(none) %2) #4 {
  %4 = tail call noundef ptr @"$s15OwnedProjection6ClientVwCP"(ptr noalias returned writeonly captures(ret: address, provenance) initializes((0, 16)) %0, ptr noalias readonly captures(none) %1, ptr readnone captures(none) %2) #4
  ret ptr %4
}

attributes #0 = { mustprogress nofree norecurse nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #1 = { "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #2 = { mustprogress nocallback nofree nosync nounwind willreturn memory(argmem: readwrite) }
attributes #3 = { mustprogress nocallback nofree nounwind willreturn memory(argmem: readwrite) }
attributes #4 = { mustprogress nounwind willreturn "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #5 = { mustprogress nounwind willreturn }
attributes #6 = { nounwind "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #7 = { nounwind }
attributes #8 = { noinline nounwind "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #9 = { noinline "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #10 = { nofree nosync nounwind memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #11 = { nofree noinline nosync nounwind memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #12 = { nofree nounwind memory(read) }
attributes #13 = { mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #14 = { mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #15 = { mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #16 = { mustprogress nofree noinline nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #17 = { mustprogress nofree noinline nounwind willreturn memory(read) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #18 = { nocallback nofree nosync nounwind speculatable willreturn memory(none) }
attributes #19 = { noinline }
attributes #20 = { nounwind willreturn }
attributes #21 = { nounwind memory(none) }
attributes #22 = { nounwind memory(read) }

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
