; ModuleID = '/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3/field-tests/arc-keypath-origin-2026-11-23/fixture/local.ll'
source_filename = "/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3/field-tests/arc-keypath-origin-2026-11-23/fixture/local.ll"
target datalayout = "e-m:o-p270:32:32-p271:32:32-p272:64:64-i64:64-i128:128-n32:64-S128-Fn32"
target triple = "arm64-apple-macosx14.0.0"

%swift.vwtable = type { ptr, ptr, ptr, ptr, ptr, ptr, ptr, ptr, i64, i64, i32, i32 }
%swift.type_descriptor = type opaque
%swift.type_metadata_record = type { i32 }
%swift.type = type { i64 }
%T14KeyPathControl7WrapperV = type <{ %TSu, ptr, %TSu, %TSu, %TSu }>
%TSu = type <{ i64 }>
%T14KeyPathControl6ClientV = type <{ %TSi }>
%TSi = type <{ i64 }>
%swift.metadata_response = type { ptr, i64 }

@keypath_once = private global i64 0, align 8
@"symbolic _____ 14KeyPathControl11EnvironmentV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl11EnvironmentVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14KeyPathControl11EnvironmentV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic _____ 14KeyPathControl6ClientV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14KeyPathControl6ClientV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@keypath = private global <{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }> <{ i32 trunc (i64 sub (i64 ptrtoint (ptr @keypath_once to i64), i64 ptrtoint (ptr @keypath to i64)) to i32), i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr getelementptr (i8, ptr @"symbolic _____ 14KeyPathControl11EnvironmentV", i64 1) to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }>, ptr @keypath, i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr getelementptr (i8, ptr @"symbolic _____ 14KeyPathControl6ClientV", i64 1) to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }>, ptr @keypath, i32 0, i32 3) to i64)) to i32), i32 0, i32 -2147483632, i32 46137344, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvg" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }>, ptr @keypath, i32 0, i32 7) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvpACTK" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }>, ptr @keypath, i32 0, i32 8) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvpACTk" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }>, ptr @keypath, i32 0, i32 9) to i64)) to i32) }>, section "__TEXT,__const", no_sanitize_address, align 8
@"$s14KeyPathControl6ClientV6markerSivpMV" = unnamed_addr constant { i32 } zeroinitializer, align 4
@"$sBi64_WV" = external global ptr, align 8
@.str.14.KeyPathControl = private constant [15 x i8] c"KeyPathControl\00"
@"$s14KeyPathControlMXM" = linkonce_odr hidden constant <{ i32, i32, i32 }> <{ i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.14.KeyPathControl to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32 }>, ptr @"$s14KeyPathControlMXM", i32 0, i32 2) to i64)) to i32) }>, section "__TEXT,__constg_swiftt", align 4
@.str.6.Client = private constant [7 x i8] c"Client\00"
@"$s14KeyPathControl6ClientVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControlMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14KeyPathControl6ClientVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.6.Client to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14KeyPathControl6ClientVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl6ClientVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14KeyPathControl6ClientVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl6ClientVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14KeyPathControl6ClientVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s14KeyPathControl6ClientVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, [4 x i8] }> <{ ptr null, ptr @"$sBi64_WV", i64 512, ptr @"$s14KeyPathControl6ClientVMn", i32 0, [4 x i8] zeroinitializer }>, align 8
@"symbolic Si" = linkonce_odr hidden constant <{ [2 x i8], i8 }> <{ [2 x i8] c"Si", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@0 = private constant [7 x i8] c"marker\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s14KeyPathControl6ClientVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14KeyPathControl6ClientV" to i64), i64 ptrtoint (ptr @"$s14KeyPathControl6ClientVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Si" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl6ClientVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @0 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl6ClientVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@.str.11.Environment = private constant [12 x i8] c"Environment\00"
@"$s14KeyPathControl11EnvironmentVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControlMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14KeyPathControl11EnvironmentVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.11.Environment to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14KeyPathControl11EnvironmentVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl11EnvironmentVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14KeyPathControl11EnvironmentVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl11EnvironmentVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14KeyPathControl11EnvironmentVMn", i32 0, i32 4) to i64)) to i32), i32 1, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s14KeyPathControl11EnvironmentVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, [4 x i8] }> <{ ptr null, ptr @"$sBi64_WV", i64 512, ptr @"$s14KeyPathControl11EnvironmentVMn", i32 0, [4 x i8] zeroinitializer }>, align 8
@1 = private constant [8 x i8] c"storage\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s14KeyPathControl11EnvironmentVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14KeyPathControl11EnvironmentV" to i64), i64 ptrtoint (ptr @"$s14KeyPathControl11EnvironmentVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 1, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14KeyPathControl6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl11EnvironmentVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @1 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl11EnvironmentVMF", i32 0, i32 7) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s14KeyPathControl7WrapperVWV" = internal constant %swift.vwtable { ptr @"$s14KeyPathControl7WrapperVwCP", ptr @"$s14KeyPathControl7WrapperVwxx", ptr @"$s14KeyPathControl7WrapperVwcp", ptr @"$s14KeyPathControl7WrapperVwca", ptr @__swift_memcpy40_8, ptr @"$s14KeyPathControl7WrapperVwta", ptr @"$s14KeyPathControl7WrapperVwet", ptr @"$s14KeyPathControl7WrapperVwst", i64 40, i64 40, i32 196615, i32 2147483647 }, align 8
@.str.7.Wrapper = private constant [8 x i8] c"Wrapper\00"
@"$s14KeyPathControl7WrapperVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControlMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14KeyPathControl7WrapperVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.7.Wrapper to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14KeyPathControl7WrapperVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl7WrapperVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14KeyPathControl7WrapperVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl7WrapperVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s14KeyPathControl7WrapperVMn", i32 0, i32 4) to i64)) to i32), i32 5, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s14KeyPathControl7WrapperVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, i32, i32, i32, i32, [4 x i8] }> <{ ptr null, ptr @"$s14KeyPathControl7WrapperVWV", i64 512, ptr @"$s14KeyPathControl7WrapperVMn", i32 0, i32 8, i32 16, i32 24, i32 32, [4 x i8] zeroinitializer }>, align 8
@"symbolic _____ 14KeyPathControl7WrapperV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl7WrapperVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 14KeyPathControl7WrapperV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic Su" = linkonce_odr hidden constant <{ [2 x i8], i8 }> <{ [2 x i8] c"Su", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@2 = private constant [8 x i8] c"leading\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$ss15WritableKeyPathCMn" = external global %swift.type_descriptor, align 4
@"got.$ss15WritableKeyPathCMn" = private unnamed_addr constant ptr @"$ss15WritableKeyPathCMn"
@"symbolic _____y__________G s15WritableKeyPathC 0bC7Control11EnvironmentV AC6ClientV" = linkonce_odr hidden constant <{ i8, i32, [1 x i8], i8, i32, i8, i32, [1 x i8], i8 }> <{ i8 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"got.$ss15WritableKeyPathCMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y__________G s15WritableKeyPathC 0bC7Control11EnvironmentV AC6ClientV", i32 0, i32 1) to i64)) to i32), [1 x i8] c"y", i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl11EnvironmentVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y__________G s15WritableKeyPathC 0bC7Control11EnvironmentV AC6ClientV", i32 0, i32 4) to i64)) to i32), i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl6ClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, [1 x i8], i8, i32, i8, i32, [1 x i8], i8 }>, ptr @"symbolic _____y__________G s15WritableKeyPathC 0bC7Control11EnvironmentV AC6ClientV", i32 0, i32 6) to i64)) to i32), [1 x i8] c"G", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@3 = private constant [8 x i8] c"keyPath\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@4 = private constant [9 x i8] c"trailing\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@5 = private constant [6 x i8] c"extra\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@6 = private constant [7 x i8] c"extra2\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s14KeyPathControl7WrapperVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 14KeyPathControl7WrapperV" to i64), i64 ptrtoint (ptr @"$s14KeyPathControl7WrapperVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 5, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Su" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl7WrapperVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @2 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl7WrapperVMF", i32 0, i32 7) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____y__________G s15WritableKeyPathC 0bC7Control11EnvironmentV AC6ClientV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl7WrapperVMF", i32 0, i32 9) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @3 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl7WrapperVMF", i32 0, i32 10) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Su" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl7WrapperVMF", i32 0, i32 12) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @4 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl7WrapperVMF", i32 0, i32 13) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Su" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl7WrapperVMF", i32 0, i32 15) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @5 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl7WrapperVMF", i32 0, i32 16) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Su" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl7WrapperVMF", i32 0, i32 18) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @6 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s14KeyPathControl7WrapperVMF", i32 0, i32 19) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s14KeyPathControl6ClientVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl6ClientVMn" to i64), i64 ptrtoint (ptr @"$s14KeyPathControl6ClientVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s14KeyPathControl11EnvironmentVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl11EnvironmentVMn" to i64), i64 ptrtoint (ptr @"$s14KeyPathControl11EnvironmentVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s14KeyPathControl7WrapperVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s14KeyPathControl7WrapperVMn" to i64), i64 ptrtoint (ptr @"$s14KeyPathControl7WrapperVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@__swift_reflection_version = linkonce_odr hidden constant i16 3
@llvm.used = appending global [43 x ptr] [ptr @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvM", ptr @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvg", ptr @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvs", ptr @"$s14KeyPathControl11EnvironmentV7storageAA6ClientVvM", ptr @"$s14KeyPathControl11EnvironmentV7storageAA6ClientVvg", ptr @"$s14KeyPathControl11EnvironmentV7storageAA6ClientVvs", ptr @"$s14KeyPathControl11EnvironmentVHn", ptr @"$s14KeyPathControl11EnvironmentVMF", ptr @"$s14KeyPathControl11EnvironmentVMa", ptr @"$s14KeyPathControl11EnvironmentVMn", ptr @"$s14KeyPathControl11EnvironmentVN", ptr @"$s14KeyPathControl11makeWrapperAA0E0VyF", ptr @"$s14KeyPathControl6ClientV6markerACSi_tcfC", ptr @"$s14KeyPathControl6ClientV6markerSivM", ptr @"$s14KeyPathControl6ClientV6markerSivg", ptr @"$s14KeyPathControl6ClientV6markerSivpMV", ptr @"$s14KeyPathControl6ClientV6markerSivs", ptr @"$s14KeyPathControl6ClientVHn", ptr @"$s14KeyPathControl6ClientVMF", ptr @"$s14KeyPathControl6ClientVMa", ptr @"$s14KeyPathControl6ClientVMn", ptr @"$s14KeyPathControl6ClientVN", ptr @"$s14KeyPathControl7WrapperV03keyB0s08WritableaB0CyAA11EnvironmentVAA6ClientVGvM", ptr @"$s14KeyPathControl7WrapperV03keyB0s08WritableaB0CyAA11EnvironmentVAA6ClientVGvg", ptr @"$s14KeyPathControl7WrapperV03keyB0s08WritableaB0CyAA11EnvironmentVAA6ClientVGvs", ptr @"$s14KeyPathControl7WrapperV5extraSuvM", ptr @"$s14KeyPathControl7WrapperV5extraSuvg", ptr @"$s14KeyPathControl7WrapperV5extraSuvs", ptr @"$s14KeyPathControl7WrapperV6extra2SuvM", ptr @"$s14KeyPathControl7WrapperV6extra2Suvg", ptr @"$s14KeyPathControl7WrapperV6extra2Suvs", ptr @"$s14KeyPathControl7WrapperV7leadingSuvM", ptr @"$s14KeyPathControl7WrapperV7leadingSuvg", ptr @"$s14KeyPathControl7WrapperV7leadingSuvs", ptr @"$s14KeyPathControl7WrapperV8trailingSuvM", ptr @"$s14KeyPathControl7WrapperV8trailingSuvg", ptr @"$s14KeyPathControl7WrapperV8trailingSuvs", ptr @"$s14KeyPathControl7WrapperVHn", ptr @"$s14KeyPathControl7WrapperVMF", ptr @"$s14KeyPathControl7WrapperVMa", ptr @"$s14KeyPathControl7WrapperVMn", ptr @"$s14KeyPathControl7WrapperVN", ptr @__swift_reflection_version], section "llvm.metadata"

@"$s14KeyPathControl11EnvironmentV7storageAA6ClientVvpMV" = alias { i32 }, ptr @"$s14KeyPathControl6ClientV6markerSivpMV"
@"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvpMV" = alias { i32 }, ptr @"$s14KeyPathControl6ClientV6markerSivpMV"
@"$s14KeyPathControl7WrapperV7leadingSuvpMV" = alias { i32 }, ptr @"$s14KeyPathControl6ClientV6markerSivpMV"
@"$s14KeyPathControl7WrapperV03keyB0s08WritableaB0CyAA11EnvironmentVAA6ClientVGvpMV" = alias { i32 }, ptr @"$s14KeyPathControl6ClientV6markerSivpMV"
@"$s14KeyPathControl7WrapperV8trailingSuvpMV" = alias { i32 }, ptr @"$s14KeyPathControl6ClientV6markerSivpMV"
@"$s14KeyPathControl7WrapperV5extraSuvpMV" = alias { i32 }, ptr @"$s14KeyPathControl6ClientV6markerSivpMV"
@"$s14KeyPathControl7WrapperV6extra2SuvpMV" = alias { i32 }, ptr @"$s14KeyPathControl6ClientV6markerSivpMV"
@"$s14KeyPathControl6ClientVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s14KeyPathControl6ClientVMf", i32 0, i32 2)
@"$s14KeyPathControl11EnvironmentVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s14KeyPathControl11EnvironmentVMf", i32 0, i32 2)
@"$s14KeyPathControl7WrapperVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32, i32, i32, i32, [4 x i8] }>, ptr @"$s14KeyPathControl7WrapperVMf", i32 0, i32 2)

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i64 @"$s14KeyPathControl6ClientV6markerSivg"(i64 returned %0) #0 {
entry:
  ret i64 %0
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s14KeyPathControl6ClientV6markerSivM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(8) %1) #1 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s14KeyPathControl6ClientV6markerSivM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s14KeyPathControl6ClientV6markerSivM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i64 @"$s14KeyPathControl6ClientV6markerACSi_tcfC"(i64 returned %0) #0 {
entry:
  ret i64 %0
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc i64 @"$s14KeyPathControl11EnvironmentV7storageAA6ClientVvg"(i64 returned %0) #0 {
entry:
  ret i64 %0
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s14KeyPathControl11EnvironmentV7storageAA6ClientVvs"(i64 %0, ptr swiftself writeonly captures(none) dereferenceable(8) initializes((0, 8)) %1) #2 {
entry:
  store i64 %0, ptr %1, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s14KeyPathControl11EnvironmentV7storageAA6ClientVvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(8) %1) #1 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s14KeyPathControl11EnvironmentV7storageAA6ClientVvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s14KeyPathControl11EnvironmentV7storageAA6ClientVvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc i64 @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvg"(i64 returned %0) #3 {
entry:
  ret i64 %0
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvs"(i64 %0, ptr swiftself writeonly captures(none) dereferenceable(8) initializes((0, 8)) %1) #4 {
entry:
  store i64 %0, ptr %1, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvM"(ptr noalias dereferenceable(32) %0, ptr swiftself dereferenceable(8) %1) #1 {
coro.return:
  %.spill.addr = getelementptr inbounds nuw i8, ptr %0, i64 8
  store ptr %1, ptr %.spill.addr, align 8
  tail call void @llvm.lifetime.start.p0(i64 8, ptr nonnull %0)
  %2 = load i64, ptr %1, align 8
  store i64 %2, ptr %0, align 8
  %3 = insertvalue { ptr, ptr } { ptr @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvM.resume.0", ptr poison }, ptr %0, 1
  ret { ptr, ptr } %3
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(write, argmem: readwrite, inaccessiblemem: none)
define internal swiftcc void @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvM.resume.0"(ptr noalias noundef nonnull align 8 captures(none) dereferenceable(32) %0, i1 %1) #5 {
entryresume.0:
  %.reload.addr = getelementptr inbounds nuw i8, ptr %0, i64 8
  %.reload = load ptr, ptr %.reload.addr, align 8
  %2 = load i64, ptr %0, align 8
  tail call swiftcc void @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvs"(i64 %2, ptr nonnull swiftself captures(none) dereferenceable(8) %.reload)
  tail call void @llvm.lifetime.end.p0(i64 8, ptr nonnull %0)
  ret void
}

; Function Attrs: mustprogress nocallback nofree nosync nounwind willreturn memory(argmem: readwrite)
declare void @llvm.lifetime.start.p0(i64 immarg, ptr captures(none)) #6

; Function Attrs: mustprogress nocallback nofree nosync nounwind willreturn memory(argmem: readwrite)
declare void @llvm.lifetime.end.p0(i64 immarg, ptr captures(none)) #6

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define swiftcc i64 @"$s14KeyPathControl7WrapperV7leadingSuvg"(ptr noalias readonly swiftself captures(none) dereferenceable(40) %0) #7 {
entry:
  %1 = load i64, ptr %0, align 8
  ret i64 %1
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s14KeyPathControl7WrapperV7leadingSuvs"(i64 %0, ptr swiftself writeonly captures(none) dereferenceable(40) initializes((0, 8)) %1) #2 {
entry:
  store i64 %0, ptr %1, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s14KeyPathControl7WrapperV7leadingSuvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(40) %1) #1 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s14KeyPathControl7WrapperV7leadingSuvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s14KeyPathControl7WrapperV7leadingSuvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define swiftcc ptr @"$s14KeyPathControl7WrapperV03keyB0s08WritableaB0CyAA11EnvironmentVAA6ClientVGvg"(ptr noalias readonly swiftself captures(none) dereferenceable(40) %0) #8 {
entry:
  %.keyPath = getelementptr inbounds nuw i8, ptr %0, i64 8
  %1 = load ptr, ptr %.keyPath, align 8
  %2 = tail call ptr @swift_retain(ptr returned %1) #15
  ret ptr %1
}

; Function Attrs: mustprogress nounwind willreturn
declare ptr @swift_retain(ptr returned) local_unnamed_addr #9

; Function Attrs: nounwind
define swiftcc void @"$s14KeyPathControl7WrapperV03keyB0s08WritableaB0CyAA11EnvironmentVAA6ClientVGvs"(ptr %0, ptr swiftself captures(none) dereferenceable(40) %1) #10 {
entry:
  %.keyPath = getelementptr inbounds nuw i8, ptr %1, i64 8
  %2 = load ptr, ptr %.keyPath, align 8
  tail call void @swift_release(ptr %2) #11
  store ptr %0, ptr %.keyPath, align 8
  ret void
}

; Function Attrs: nounwind
declare void @swift_release(ptr) local_unnamed_addr #11

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s14KeyPathControl7WrapperV03keyB0s08WritableaB0CyAA11EnvironmentVAA6ClientVGvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(40) %1) #1 {
coro.return:
  %.keyPath = getelementptr inbounds nuw i8, ptr %1, i64 8
  %2 = insertvalue { ptr, ptr } { ptr @"$s14KeyPathControl7WrapperV03keyB0s08WritableaB0CyAA11EnvironmentVAA6ClientVGvM.resume.0", ptr poison }, ptr %.keyPath, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s14KeyPathControl7WrapperV03keyB0s08WritableaB0CyAA11EnvironmentVAA6ClientVGvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define swiftcc i64 @"$s14KeyPathControl7WrapperV8trailingSuvg"(ptr noalias readonly swiftself captures(none) dereferenceable(40) %0) #7 {
entry:
  %.trailing = getelementptr inbounds nuw i8, ptr %0, i64 16
  %1 = load i64, ptr %.trailing, align 8
  ret i64 %1
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s14KeyPathControl7WrapperV8trailingSuvs"(i64 %0, ptr swiftself writeonly captures(none) dereferenceable(40) initializes((16, 24)) %1) #2 {
entry:
  %.trailing = getelementptr inbounds nuw i8, ptr %1, i64 16
  store i64 %0, ptr %.trailing, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s14KeyPathControl7WrapperV8trailingSuvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(40) %1) #1 {
coro.return:
  %.trailing = getelementptr inbounds nuw i8, ptr %1, i64 16
  %2 = insertvalue { ptr, ptr } { ptr @"$s14KeyPathControl7WrapperV8trailingSuvM.resume.0", ptr poison }, ptr %.trailing, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s14KeyPathControl7WrapperV8trailingSuvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define swiftcc i64 @"$s14KeyPathControl7WrapperV5extraSuvg"(ptr noalias readonly swiftself captures(none) dereferenceable(40) %0) #7 {
entry:
  %.extra = getelementptr inbounds nuw i8, ptr %0, i64 24
  %1 = load i64, ptr %.extra, align 8
  ret i64 %1
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s14KeyPathControl7WrapperV5extraSuvs"(i64 %0, ptr swiftself writeonly captures(none) dereferenceable(40) initializes((24, 32)) %1) #2 {
entry:
  %.extra = getelementptr inbounds nuw i8, ptr %1, i64 24
  store i64 %0, ptr %.extra, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s14KeyPathControl7WrapperV5extraSuvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(40) %1) #1 {
coro.return:
  %.extra = getelementptr inbounds nuw i8, ptr %1, i64 24
  %2 = insertvalue { ptr, ptr } { ptr @"$s14KeyPathControl7WrapperV5extraSuvM.resume.0", ptr poison }, ptr %.extra, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s14KeyPathControl7WrapperV5extraSuvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define swiftcc i64 @"$s14KeyPathControl7WrapperV6extra2Suvg"(ptr noalias readonly swiftself captures(none) dereferenceable(40) %0) #7 {
entry:
  %.extra2 = getelementptr inbounds nuw i8, ptr %0, i64 32
  %1 = load i64, ptr %.extra2, align 8
  ret i64 %1
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s14KeyPathControl7WrapperV6extra2Suvs"(i64 %0, ptr swiftself writeonly captures(none) dereferenceable(40) initializes((32, 40)) %1) #2 {
entry:
  %.extra2 = getelementptr inbounds nuw i8, ptr %1, i64 32
  store i64 %0, ptr %.extra2, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s14KeyPathControl7WrapperV6extra2SuvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(40) %1) #1 {
coro.return:
  %.extra2 = getelementptr inbounds nuw i8, ptr %1, i64 32
  %2 = insertvalue { ptr, ptr } { ptr @"$s14KeyPathControl7WrapperV6extra2SuvM.resume.0", ptr poison }, ptr %.extra2, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s14KeyPathControl7WrapperV6extra2SuvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc void @"$s14KeyPathControl11makeWrapperAA0E0VyF"(ptr noalias writeonly sret(%T14KeyPathControl7WrapperV) captures(none) initializes((0, 40)) %0) #1 {
entry:
  %1 = tail call ptr @swift_getKeyPath(ptr nonnull @keypath, ptr undef) #11
  store i64 17, ptr %0, align 8
  %.keyPath = getelementptr inbounds nuw i8, ptr %0, i64 8
  store ptr %1, ptr %.keyPath, align 8
  %.trailing = getelementptr inbounds nuw i8, ptr %0, i64 16
  store <2 x i64> <i64 23, i64 29>, ptr %.trailing, align 8
  %.extra2 = getelementptr inbounds nuw i8, ptr %0, i64 32
  store i64 31, ptr %.extra2, align 8
  ret void
}

define linkonce_odr hidden swiftcc void @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvpACTK"(ptr noalias sret(%T14KeyPathControl6ClientV) captures(none) %0, ptr noalias captures(none) dereferenceable(8) %1, ptr %2, i64 %3) #12 {
entry:
  %4 = load i64, ptr %1, align 8
  store i64 %4, ptr %0, align 8
  ret void
}

define linkonce_odr hidden swiftcc void @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvpACTk"(ptr noalias captures(none) dereferenceable(8) %0, ptr captures(none) dereferenceable(8) %1, ptr %2, i64 %3) #12 {
entry:
  %4 = load i64, ptr %0, align 8
  tail call swiftcc void @"$s14KeyPathControl11EnvironmentV6clientAA6ClientVvs"(i64 %4, ptr nonnull swiftself captures(none) dereferenceable(8) %1) #16
  ret void
}

; Function Attrs: nounwind
declare ptr @swift_getKeyPath(ptr, ptr) local_unnamed_addr #11

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14KeyPathControl6ClientVMa"(i64 %0) #3 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s14KeyPathControl6ClientVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14KeyPathControl11EnvironmentVMa"(i64 %0) #3 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, [4 x i8] }>, ptr @"$s14KeyPathControl11EnvironmentVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nounwind willreturn
define internal nonnull ptr @"$s14KeyPathControl7WrapperVwCP"(ptr noalias writeonly captures(none) initializes((0, 8)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Wrapper) #8 {
entry:
  %0 = load ptr, ptr %src, align 8
  store ptr %0, ptr %dest, align 8
  %1 = getelementptr inbounds nuw i8, ptr %0, i64 16
  %2 = tail call ptr @swift_retain(ptr returned %0) #15
  ret ptr %1
}

; Function Attrs: mustprogress nocallback nofree nounwind willreturn memory(argmem: readwrite)
declare void @llvm.memcpy.p0.p0.i64(ptr noalias writeonly captures(none), ptr noalias readonly captures(none), i64, i1 immarg) #13

; Function Attrs: nounwind
define internal void @"$s14KeyPathControl7WrapperVwxx"(ptr noalias readonly captures(none) %object, ptr readnone captures(none) %Wrapper) #10 {
entry:
  %object.keyPath = getelementptr inbounds nuw i8, ptr %object, i64 8
  %toDestroy = load ptr, ptr %object.keyPath, align 8
  tail call void @swift_release(ptr %toDestroy) #11
  ret void
}

; Function Attrs: mustprogress nounwind willreturn
define internal noundef ptr @"$s14KeyPathControl7WrapperVwcp"(ptr noalias returned writeonly captures(ret: address, provenance) initializes((0, 40)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Wrapper) #8 {
entry:
  %0 = load i64, ptr %src, align 8
  store i64 %0, ptr %dest, align 8
  %dest.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %src.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 8
  %1 = load ptr, ptr %src.keyPath, align 8
  store ptr %1, ptr %dest.keyPath, align 8
  %dest.trailing = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.trailing = getelementptr inbounds nuw i8, ptr %src, i64 16
  %2 = load <2 x i64>, ptr %src.trailing, align 8
  store <2 x i64> %2, ptr %dest.trailing, align 8
  %dest.extra2 = getelementptr inbounds nuw i8, ptr %dest, i64 32
  %src.extra2 = getelementptr inbounds nuw i8, ptr %src, i64 32
  %3 = load i64, ptr %src.extra2, align 8
  store i64 %3, ptr %dest.extra2, align 8
  %4 = tail call ptr @swift_retain(ptr returned %1) #15
  ret ptr %dest
}

; Function Attrs: nounwind
define internal noundef ptr @"$s14KeyPathControl7WrapperVwca"(ptr returned captures(ret: address, provenance) initializes((0, 8), (16, 40)) %dest, ptr readonly captures(none) %src, ptr readnone captures(none) %Wrapper) #10 {
entry:
  %0 = load i64, ptr %src, align 8
  store i64 %0, ptr %dest, align 8
  %dest.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %src.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 8
  %1 = load ptr, ptr %src.keyPath, align 8
  %oldValue = load ptr, ptr %dest.keyPath, align 8
  store ptr %1, ptr %dest.keyPath, align 8
  %2 = tail call ptr @swift_retain(ptr returned %1) #15
  tail call void @swift_release(ptr %oldValue) #11
  %dest.trailing = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.trailing = getelementptr inbounds nuw i8, ptr %src, i64 16
  %3 = load i64, ptr %src.trailing, align 8
  store i64 %3, ptr %dest.trailing, align 8
  %dest.extra = getelementptr inbounds nuw i8, ptr %dest, i64 24
  %src.extra = getelementptr inbounds nuw i8, ptr %src, i64 24
  %4 = load i64, ptr %src.extra, align 8
  store i64 %4, ptr %dest.extra, align 8
  %dest.extra2 = getelementptr inbounds nuw i8, ptr %dest, i64 32
  %src.extra2 = getelementptr inbounds nuw i8, ptr %src, i64 32
  %5 = load i64, ptr %src.extra2, align 8
  store i64 %5, ptr %dest.extra2, align 8
  ret ptr %dest
}

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy40_8(ptr %0, ptr %1, ptr %2) #10 {
entry:
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(40) %0, ptr noundef nonnull align 8 dereferenceable(40) %1, i64 40, i1 false)
  ret ptr %0
}

; Function Attrs: nounwind
define internal noundef ptr @"$s14KeyPathControl7WrapperVwta"(ptr noalias returned captures(ret: address, provenance) initializes((0, 8), (16, 40)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %Wrapper) #10 {
entry:
  %0 = load i64, ptr %src, align 8
  store i64 %0, ptr %dest, align 8
  %dest.keyPath = getelementptr inbounds nuw i8, ptr %dest, i64 8
  %src.keyPath = getelementptr inbounds nuw i8, ptr %src, i64 8
  %1 = load ptr, ptr %src.keyPath, align 8
  %oldValue = load ptr, ptr %dest.keyPath, align 8
  store ptr %1, ptr %dest.keyPath, align 8
  tail call void @swift_release(ptr %oldValue) #11
  %dest.trailing = getelementptr inbounds nuw i8, ptr %dest, i64 16
  %src.trailing = getelementptr inbounds nuw i8, ptr %src, i64 16
  %2 = load <2 x i64>, ptr %src.trailing, align 8
  store <2 x i64> %2, ptr %dest.trailing, align 8
  %dest.extra2 = getelementptr inbounds nuw i8, ptr %dest, i64 32
  %src.extra2 = getelementptr inbounds nuw i8, ptr %src, i64 32
  %3 = load i64, ptr %src.extra2, align 8
  store i64 %3, ptr %dest.extra2, align 8
  ret ptr %dest
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s14KeyPathControl7WrapperVwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Wrapper) #7 {
entry:
  %0 = icmp eq i32 %numEmptyCases, 0
  br i1 %0, label %12, label %1

1:                                                ; preds = %entry
  %2 = icmp slt i32 %numEmptyCases, 0
  br i1 %2, label %3, label %is-valid-pointer

3:                                                ; preds = %1
  %4 = getelementptr inbounds nuw i8, ptr %value, i64 40
  %5 = load i8, ptr %4, align 1
  %6 = icmp eq i8 %5, 0
  br i1 %6, label %is-valid-pointer, label %7

7:                                                ; preds = %3
  %8 = load i320, ptr %value, align 1
  %9 = trunc i320 %8 to i32
  %10 = add i32 %9, 2147483647
  br label %12

is-valid-pointer:                                 ; preds = %3, %1
  %value.keyPath = getelementptr inbounds nuw i8, ptr %value, i64 8
  %11 = load i64, ptr %value.keyPath, align 8
  %spec.select1 = tail call i64 @llvm.umin.i64(i64 %11, i64 4294967295)
  %spec.select = trunc nuw i64 %spec.select1 to i32
  br label %12

12:                                               ; preds = %entry, %is-valid-pointer, %7
  %13 = phi i32 [ %spec.select, %is-valid-pointer ], [ %10, %7 ], [ -1, %entry ]
  %14 = add i32 %13, 1
  ret i32 %14
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s14KeyPathControl7WrapperVwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Wrapper) #2 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 40
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
  %value.keyPath = getelementptr inbounds nuw i8, ptr %value, i64 8
  %9 = zext nneg i32 %8 to i64
  store i64 %9, ptr %value.keyPath, align 8
  br label %14

10:                                               ; preds = %entry
  %11 = and i32 %whichCase, 2147483647
  %12 = zext nneg i32 %11 to i320
  store i320 %12, ptr %value, align 8
  br i1 %1, label %13, label %14

13:                                               ; preds = %10
  store i8 1, ptr %0, align 8
  br label %14

14:                                               ; preds = %10, %13, %7, %5
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s14KeyPathControl7WrapperVMa"(i64 %0) #3 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32, i32, i32, i32, [4 x i8] }>, ptr @"$s14KeyPathControl7WrapperVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: nocallback nofree nosync nounwind speculatable willreturn memory(none)
declare i64 @llvm.umin.i64(i64, i64) #14

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s14KeyPathControl6ClientV6markerSivs"(i64 %0, ptr swiftself writeonly captures(none) dereferenceable(8) initializes((0, 8)) %1) #2 {
  tail call swiftcc void @"$s14KeyPathControl11EnvironmentV7storageAA6ClientVvs"(i64 %0, ptr swiftself writeonly captures(none) dereferenceable(8) initializes((0, 8)) %1) #2
  ret void
}

attributes #0 = { mustprogress nofree norecurse nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #1 = { noinline nounwind "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #2 = { mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #3 = { mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #4 = { mustprogress nofree noinline norecurse nosync nounwind willreturn memory(argmem: write) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #5 = { mustprogress nofree norecurse nosync nounwind willreturn memory(write, argmem: readwrite, inaccessiblemem: none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #6 = { mustprogress nocallback nofree nosync nounwind willreturn memory(argmem: readwrite) }
attributes #7 = { mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #8 = { mustprogress nounwind willreturn "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #9 = { mustprogress nounwind willreturn }
attributes #10 = { nounwind "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #11 = { nounwind }
attributes #12 = { "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #13 = { mustprogress nocallback nofree nounwind willreturn memory(argmem: readwrite) }
attributes #14 = { nocallback nofree nosync nounwind speculatable willreturn memory(none) }
attributes #15 = { nounwind willreturn }
attributes #16 = { noinline }

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
