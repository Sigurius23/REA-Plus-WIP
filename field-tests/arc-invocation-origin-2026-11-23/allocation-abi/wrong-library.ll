; ModuleID = '/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3/field-tests/arc-invocation-origin-2026-11-23/allocation-abi/wrong-library.ll'
source_filename = "/Users/sigur/Desktop/projekte/reverse engineering/workspace-01a14115-4dfe-72d4-b07e-0d1507a1ebf3/field-tests/arc-invocation-origin-2026-11-23/allocation-abi/wrong-library.ll"
target datalayout = "e-m:o-p270:32:32-p271:32:32-p272:64:64-i64:64-i128:128-n32:64-S128-Fn32"
target triple = "arm64-apple-macosx14.0.0"

%swift.vwtable = type { ptr, ptr, ptr, ptr, ptr, ptr, ptr, ptr, i64, i64, i32, i32 }
%swift.type_metadata_record = type { i32 }
%swift.type = type { i64 }
%T20AllocationABIControl11LargeClientV = type <{ %T20AllocationABIControl4PairV, %T20AllocationABIControl4PairV, %T20AllocationABIControl4PairV }>
%T20AllocationABIControl4PairV = type <{ %TSV, %TSv }>
%TSV = type <{ ptr }>
%TSv = type <{ ptr }>
%swift.metadata_response = type { ptr, i64 }

@"$s20AllocationABIControl4PairV4codeSVvpMV" = unnamed_addr constant { i32 } zeroinitializer, align 4
@"$s20AllocationABIControl4PairVWV" = internal constant %swift.vwtable { ptr @__swift_memcpy16_8, ptr @__swift_noop_void_return, ptr @__swift_memcpy16_8, ptr @__swift_memcpy16_8, ptr @__swift_memcpy16_8, ptr @__swift_memcpy16_8, ptr @"$s20AllocationABIControl4PairVwet", ptr @"$s20AllocationABIControl4PairVwst", i64 16, i64 16, i32 7, i32 1 }, align 8
@.str.20.AllocationABIControl = private constant [21 x i8] c"AllocationABIControl\00"
@"$s20AllocationABIControlMXM" = linkonce_odr hidden constant <{ i32, i32, i32 }> <{ i32 0, i32 0, i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.20.AllocationABIControl to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32 }>, ptr @"$s20AllocationABIControlMXM", i32 0, i32 2) to i64)) to i32) }>, section "__TEXT,__constg_swiftt", align 4
@.str.4.Pair = private constant [5 x i8] c"Pair\00"
@"$s20AllocationABIControl4PairVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s20AllocationABIControlMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s20AllocationABIControl4PairVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.4.Pair to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s20AllocationABIControl4PairVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s20AllocationABIControl4PairVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s20AllocationABIControl4PairVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s20AllocationABIControl4PairVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s20AllocationABIControl4PairVMn", i32 0, i32 4) to i64)) to i32), i32 2, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s20AllocationABIControl4PairVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, i32 }> <{ ptr null, ptr @"$s20AllocationABIControl4PairVWV", i64 512, ptr @"$s20AllocationABIControl4PairVMn", i32 0, i32 8 }>, align 8
@"symbolic _____ 20AllocationABIControl4PairV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s20AllocationABIControl4PairVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 20AllocationABIControl4PairV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@"symbolic SV" = linkonce_odr hidden constant <{ [2 x i8], i8 }> <{ [2 x i8] c"SV", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@0 = private constant [5 x i8] c"code\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"symbolic Sv" = linkonce_odr hidden constant <{ [2 x i8], i8 }> <{ [2 x i8] c"Sv", i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@1 = private constant [8 x i8] c"context\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s20AllocationABIControl4PairVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 20AllocationABIControl4PairV" to i64), i64 ptrtoint (ptr @"$s20AllocationABIControl4PairVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 2, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic SV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s20AllocationABIControl4PairVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @0 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s20AllocationABIControl4PairVMF", i32 0, i32 7) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic Sv" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s20AllocationABIControl4PairVMF", i32 0, i32 9) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @1 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s20AllocationABIControl4PairVMF", i32 0, i32 10) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s20AllocationABIControl11LargeClientVWV" = internal constant %swift.vwtable { ptr @"$s20AllocationABIControl11LargeClientVwCP", ptr @__swift_noop_void_return, ptr @__swift_memcpy48_8, ptr @__swift_memcpy48_8, ptr @__swift_memcpy48_8, ptr @__swift_memcpy48_8, ptr @"$s20AllocationABIControl11LargeClientVwet", ptr @"$s20AllocationABIControl11LargeClientVwst", i64 48, i64 48, i32 131079, i32 1 }, align 8
@.str.11.LargeClient = private constant [12 x i8] c"LargeClient\00"
@"$s20AllocationABIControl11LargeClientVMn" = constant <{ i32, i32, i32, i32, i32, i32, i32 }> <{ i32 81, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s20AllocationABIControlMXM" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s20AllocationABIControl11LargeClientVMn", i32 0, i32 1) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @.str.11.LargeClient to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s20AllocationABIControl11LargeClientVMn", i32 0, i32 2) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s20AllocationABIControl11LargeClientVMa" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s20AllocationABIControl11LargeClientVMn", i32 0, i32 3) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s20AllocationABIControl11LargeClientVMF" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i32, i32, i32, i32, i32, i32, i32 }>, ptr @"$s20AllocationABIControl11LargeClientVMn", i32 0, i32 4) to i64)) to i32), i32 3, i32 2 }>, section "__TEXT,__constg_swiftt", align 4
@"$s20AllocationABIControl11LargeClientVMf" = internal constant <{ ptr, ptr, i64, ptr, i32, i32, i32, [4 x i8] }> <{ ptr null, ptr @"$s20AllocationABIControl11LargeClientVWV", i64 512, ptr @"$s20AllocationABIControl11LargeClientVMn", i32 0, i32 16, i32 32, [4 x i8] zeroinitializer }>, align 8
@"symbolic _____ 20AllocationABIControl11LargeClientV" = linkonce_odr hidden constant <{ i8, i32, i8 }> <{ i8 1, i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s20AllocationABIControl11LargeClientVMn" to i64), i64 ptrtoint (ptr getelementptr inbounds (<{ i8, i32, i8 }>, ptr @"symbolic _____ 20AllocationABIControl11LargeClientV", i32 0, i32 1) to i64)) to i32), i8 0 }>, section "__TEXT,__swift5_typeref, regular", no_sanitize_address, align 2
@2 = private constant [2 x i8] c"a\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@3 = private constant [2 x i8] c"b\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@4 = private constant [2 x i8] c"c\00", section "__TEXT,__swift5_reflstr, regular", no_sanitize_address
@"$s20AllocationABIControl11LargeClientVMF" = internal constant { i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 } { i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 20AllocationABIControl11LargeClientV" to i64), i64 ptrtoint (ptr @"$s20AllocationABIControl11LargeClientVMF" to i64)) to i32), i32 0, i16 0, i16 12, i32 3, i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 20AllocationABIControl4PairV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s20AllocationABIControl11LargeClientVMF", i32 0, i32 6) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @2 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s20AllocationABIControl11LargeClientVMF", i32 0, i32 7) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 20AllocationABIControl4PairV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s20AllocationABIControl11LargeClientVMF", i32 0, i32 9) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @3 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s20AllocationABIControl11LargeClientVMF", i32 0, i32 10) to i64)) to i32), i32 2, i32 trunc (i64 sub (i64 ptrtoint (ptr @"symbolic _____ 20AllocationABIControl4PairV" to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s20AllocationABIControl11LargeClientVMF", i32 0, i32 12) to i64)) to i32), i32 trunc (i64 sub (i64 ptrtoint (ptr @4 to i64), i64 ptrtoint (ptr getelementptr inbounds ({ i32, i32, i16, i16, i32, i32, i32, i32, i32, i32, i32, i32, i32, i32 }, ptr @"$s20AllocationABIControl11LargeClientVMF", i32 0, i32 13) to i64)) to i32) }, section "__TEXT,__swift5_fieldmd, regular", no_sanitize_address, align 4
@"$s20AllocationABIControl4PairVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s20AllocationABIControl4PairVMn" to i64), i64 ptrtoint (ptr @"$s20AllocationABIControl4PairVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@"$s20AllocationABIControl11LargeClientVHn" = private constant %swift.type_metadata_record { i32 trunc (i64 sub (i64 ptrtoint (ptr @"$s20AllocationABIControl11LargeClientVMn" to i64), i64 ptrtoint (ptr @"$s20AllocationABIControl11LargeClientVHn" to i64)) to i32) }, section "__TEXT, __swift5_types, regular", no_sanitize_address, align 4
@__swift_reflection_version = linkonce_odr hidden constant i16 3
@llvm.used = appending global [28 x ptr] [ptr @"$s20AllocationABIControl10makeClientyAA05LargeD0VSV_S2VtF", ptr @"$s20AllocationABIControl11LargeClientV1aAA4PairVvM", ptr @"$s20AllocationABIControl11LargeClientV1aAA4PairVvg", ptr @"$s20AllocationABIControl11LargeClientV1aAA4PairVvs", ptr @"$s20AllocationABIControl11LargeClientV1bAA4PairVvM", ptr @"$s20AllocationABIControl11LargeClientV1bAA4PairVvg", ptr @"$s20AllocationABIControl11LargeClientV1bAA4PairVvs", ptr @"$s20AllocationABIControl11LargeClientV1cAA4PairVvM", ptr @"$s20AllocationABIControl11LargeClientV1cAA4PairVvg", ptr @"$s20AllocationABIControl11LargeClientV1cAA4PairVvs", ptr @"$s20AllocationABIControl11LargeClientVHn", ptr @"$s20AllocationABIControl11LargeClientVMF", ptr @"$s20AllocationABIControl11LargeClientVMa", ptr @"$s20AllocationABIControl11LargeClientVMn", ptr @"$s20AllocationABIControl11LargeClientVN", ptr @"$s20AllocationABIControl4PairV4codeSVvM", ptr @"$s20AllocationABIControl4PairV4codeSVvg", ptr @"$s20AllocationABIControl4PairV4codeSVvpMV", ptr @"$s20AllocationABIControl4PairV4codeSVvs", ptr @"$s20AllocationABIControl4PairV7contextSvvM", ptr @"$s20AllocationABIControl4PairV7contextSvvg", ptr @"$s20AllocationABIControl4PairV7contextSvvs", ptr @"$s20AllocationABIControl4PairVHn", ptr @"$s20AllocationABIControl4PairVMF", ptr @"$s20AllocationABIControl4PairVMa", ptr @"$s20AllocationABIControl4PairVMn", ptr @"$s20AllocationABIControl4PairVN", ptr @__swift_reflection_version], section "llvm.metadata"

@"$s20AllocationABIControl4PairV7contextSvvpMV" = alias { i32 }, ptr @"$s20AllocationABIControl4PairV4codeSVvpMV"
@"$s20AllocationABIControl11LargeClientV1aAA4PairVvpMV" = alias { i32 }, ptr @"$s20AllocationABIControl4PairV4codeSVvpMV"
@"$s20AllocationABIControl11LargeClientV1bAA4PairVvpMV" = alias { i32 }, ptr @"$s20AllocationABIControl4PairV4codeSVvpMV"
@"$s20AllocationABIControl11LargeClientV1cAA4PairVvpMV" = alias { i32 }, ptr @"$s20AllocationABIControl4PairV4codeSVvpMV"
@"$s20AllocationABIControl4PairVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32 }>, ptr @"$s20AllocationABIControl4PairVMf", i32 0, i32 2)
@"$s20AllocationABIControl11LargeClientVN" = alias %swift.type, getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32, i32, [4 x i8] }>, ptr @"$s20AllocationABIControl11LargeClientVMf", i32 0, i32 2)

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc ptr @"$s20AllocationABIControl4PairV4codeSVvg"(ptr readnone returned captures(ret: address, provenance) %0, ptr readnone captures(none) %1) #0 {
entry:
  ret ptr %0
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s20AllocationABIControl4PairV4codeSVvs"(ptr %0, ptr swiftself writeonly captures(none) dereferenceable(16) initializes((0, 8)) %1) #1 {
entry:
  store ptr %0, ptr %1, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s20AllocationABIControl4PairV4codeSVvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(16) %1) #2 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s20AllocationABIControl4PairV4codeSVvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s20AllocationABIControl4PairV4codeSVvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define swiftcc ptr @"$s20AllocationABIControl4PairV7contextSvvg"(ptr readnone captures(none) %0, ptr readnone returned captures(ret: address, provenance) %1) #0 {
entry:
  ret ptr %1
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s20AllocationABIControl4PairV7contextSvvs"(ptr %0, ptr swiftself writeonly captures(none) dereferenceable(16) initializes((8, 16)) %1) #1 {
entry:
  %.context = getelementptr inbounds nuw i8, ptr %1, i64 8
  store ptr %0, ptr %.context, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s20AllocationABIControl4PairV7contextSvvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(16) %1) #2 {
coro.return:
  %.context = getelementptr inbounds nuw i8, ptr %1, i64 8
  %2 = insertvalue { ptr, ptr } { ptr @"$s20AllocationABIControl4PairV7contextSvvM.resume.0", ptr poison }, ptr %.context, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s20AllocationABIControl4PairV7contextSvvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define swiftcc { ptr, ptr } @"$s20AllocationABIControl11LargeClientV1aAA4PairVvg"(ptr noalias readonly swiftself captures(none) dereferenceable(48) %0) #3 {
entry:
  %1 = load ptr, ptr %0, align 8
  %.a.context = getelementptr inbounds nuw i8, ptr %0, i64 8
  %2 = load ptr, ptr %.a.context, align 8
  %3 = insertvalue { ptr, ptr } undef, ptr %1, 0
  %4 = insertvalue { ptr, ptr } %3, ptr %2, 1
  ret { ptr, ptr } %4
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s20AllocationABIControl11LargeClientV1aAA4PairVvs"(ptr %0, ptr %1, ptr swiftself writeonly captures(none) dereferenceable(48) initializes((0, 16)) %2) #1 {
entry:
  store ptr %0, ptr %2, align 8
  %.a.context = getelementptr inbounds nuw i8, ptr %2, i64 8
  store ptr %1, ptr %.a.context, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s20AllocationABIControl11LargeClientV1aAA4PairVvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(48) %1) #2 {
coro.return:
  %2 = insertvalue { ptr, ptr } { ptr @"$s20AllocationABIControl11LargeClientV1aAA4PairVvM.resume.0", ptr poison }, ptr %1, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s20AllocationABIControl11LargeClientV1aAA4PairVvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define swiftcc { ptr, ptr } @"$s20AllocationABIControl11LargeClientV1bAA4PairVvg"(ptr noalias readonly swiftself captures(none) dereferenceable(48) %0) #3 {
entry:
  %.b = getelementptr inbounds nuw i8, ptr %0, i64 16
  %1 = load ptr, ptr %.b, align 8
  %.b.context = getelementptr inbounds nuw i8, ptr %0, i64 24
  %2 = load ptr, ptr %.b.context, align 8
  %3 = insertvalue { ptr, ptr } undef, ptr %1, 0
  %4 = insertvalue { ptr, ptr } %3, ptr %2, 1
  ret { ptr, ptr } %4
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s20AllocationABIControl11LargeClientV1bAA4PairVvs"(ptr %0, ptr %1, ptr swiftself writeonly captures(none) dereferenceable(48) initializes((16, 32)) %2) #1 {
entry:
  %.b = getelementptr inbounds nuw i8, ptr %2, i64 16
  store ptr %0, ptr %.b, align 8
  %.b.context = getelementptr inbounds nuw i8, ptr %2, i64 24
  store ptr %1, ptr %.b.context, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s20AllocationABIControl11LargeClientV1bAA4PairVvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(48) %1) #2 {
coro.return:
  %.b = getelementptr inbounds nuw i8, ptr %1, i64 16
  %2 = insertvalue { ptr, ptr } { ptr @"$s20AllocationABIControl11LargeClientV1bAA4PairVvM.resume.0", ptr poison }, ptr %.b, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s20AllocationABIControl11LargeClientV1bAA4PairVvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define swiftcc { ptr, ptr } @"$s20AllocationABIControl11LargeClientV1cAA4PairVvg"(ptr noalias readonly swiftself captures(none) dereferenceable(48) %0) #3 {
entry:
  %.c = getelementptr inbounds nuw i8, ptr %0, i64 32
  %1 = load ptr, ptr %.c, align 8
  %.c.context = getelementptr inbounds nuw i8, ptr %0, i64 40
  %2 = load ptr, ptr %.c.context, align 8
  %3 = insertvalue { ptr, ptr } undef, ptr %1, 0
  %4 = insertvalue { ptr, ptr } %3, ptr %2, 1
  ret { ptr, ptr } %4
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define swiftcc void @"$s20AllocationABIControl11LargeClientV1cAA4PairVvs"(ptr %0, ptr %1, ptr swiftself writeonly captures(none) dereferenceable(48) initializes((32, 48)) %2) #1 {
entry:
  %.c = getelementptr inbounds nuw i8, ptr %2, i64 32
  store ptr %0, ptr %.c, align 8
  %.c.context = getelementptr inbounds nuw i8, ptr %2, i64 40
  store ptr %1, ptr %.c.context, align 8
  ret void
}

; Function Attrs: noinline nounwind
define swiftcc { ptr, ptr } @"$s20AllocationABIControl11LargeClientV1cAA4PairVvM"(ptr noalias dereferenceable(32) %0, ptr swiftself captures(none) dereferenceable(48) %1) #2 {
coro.return:
  %.c = getelementptr inbounds nuw i8, ptr %1, i64 32
  %2 = insertvalue { ptr, ptr } { ptr @"$s20AllocationABIControl11LargeClientV1cAA4PairVvM.resume.0", ptr poison }, ptr %.c, 1
  ret { ptr, ptr } %2
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(none)
define internal swiftcc void @"$s20AllocationABIControl11LargeClientV1cAA4PairVvM.resume.0"(ptr noalias nonnull readnone align 8 captures(none) %0, i1 %1) #0 {
entryresume.0:
  ret void
}

; Function Attrs: noinline
define swiftcc void @"$s20AllocationABIControl10makeClientyAA05LargeD0VSV_S2VtF"(ptr noalias writeonly sret(%T20AllocationABIControl11LargeClientV) captures(none) %0, ptr %1, ptr %2, ptr %3) #4 {
entry:
  %4 = tail call ptr @swift_allocObject(ptr %1, i64 24, i64 7)
  %5 = icmp eq ptr %4, null
  br i1 %5, label %8, label %6

6:                                                ; preds = %entry
  %7 = getelementptr inbounds nuw i8, ptr %4, i64 16
  store ptr %2, ptr %7, align 1
  store ptr %3, ptr %0, align 8
  %.a.context = getelementptr inbounds nuw i8, ptr %0, i64 8
  store ptr %4, ptr %.a.context, align 8
  %.b = getelementptr inbounds nuw i8, ptr %0, i64 16
  store ptr %3, ptr %.b, align 8
  %.b.context = getelementptr inbounds nuw i8, ptr %0, i64 24
  store ptr %4, ptr %.b.context, align 8
  %.c = getelementptr inbounds nuw i8, ptr %0, i64 32
  store ptr %3, ptr %.c, align 8
  %.c.context = getelementptr inbounds nuw i8, ptr %0, i64 40
  store ptr %4, ptr %.c.context, align 8
  ret void

8:                                                ; preds = %entry
  tail call void asm sideeffect "", "n"(i32 0) #12
  tail call void @llvm.trap()
  unreachable
}

; Function Attrs: optsize
declare ptr @swift_allocObject(ptr noundef, i64 noundef, i64 noundef) local_unnamed_addr #5

; Function Attrs: cold noreturn nounwind memory(inaccessiblemem: write)
declare void @llvm.trap() #6

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy16_8(ptr %0, ptr %1, ptr %2) #7 {
entry:
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(16) %0, ptr noundef nonnull align 8 dereferenceable(16) %1, i64 16, i1 false)
  ret ptr %0
}

; Function Attrs: mustprogress nocallback nofree nounwind willreturn memory(argmem: readwrite)
declare void @llvm.memcpy.p0.p0.i64(ptr noalias writeonly captures(none), ptr noalias readonly captures(none), i64, i1 immarg) #8

; Function Attrs: nounwind
define linkonce_odr hidden void @__swift_noop_void_return(ptr %0, ptr %1) #7 {
entry:
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s20AllocationABIControl4PairVwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %Pair) #3 {
entry:
  switch i32 %numEmptyCases, label %0 [
    i32 0, label %12
    i32 1, label %8
  ]

0:                                                ; preds = %entry
  %1 = getelementptr inbounds nuw i8, ptr %value, i64 16
  %2 = load i8, ptr %1, align 1
  %3 = icmp eq i8 %2, 0
  br i1 %3, label %8, label %4

4:                                                ; preds = %0
  %5 = load i128, ptr %value, align 1
  %6 = trunc i128 %5 to i32
  %7 = add i32 %6, 1
  br label %12

8:                                                ; preds = %entry, %0
  %9 = load i64, ptr %value, align 8
  %10 = icmp ne i64 %9, 0
  %11 = sext i1 %10 to i32
  br label %12

12:                                               ; preds = %entry, %8, %4
  %13 = phi i32 [ %11, %8 ], [ %7, %4 ], [ -1, %entry ]
  %14 = add i32 %13, 1
  ret i32 %14
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s20AllocationABIControl4PairVwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %Pair) #1 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 16
  %1 = icmp ugt i32 %numEmptyCases, 1
  %2 = icmp ult i32 %whichCase, 2
  br i1 %2, label %3, label %8

3:                                                ; preds = %entry
  br i1 %1, label %4, label %5

4:                                                ; preds = %3
  store i8 0, ptr %0, align 8
  br label %5

5:                                                ; preds = %3, %4
  %6 = icmp eq i32 %whichCase, 0
  br i1 %6, label %12, label %7

7:                                                ; preds = %5
  store i64 0, ptr %value, align 8
  br label %12

8:                                                ; preds = %entry
  %9 = add i32 %whichCase, -2
  %10 = zext i32 %9 to i128
  store i128 %10, ptr %value, align 8
  br i1 %1, label %11, label %12

11:                                               ; preds = %8
  store i8 1, ptr %0, align 8
  br label %12

12:                                               ; preds = %8, %11, %7, %5
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s20AllocationABIControl4PairVMa"(i64 %0) #9 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32 }>, ptr @"$s20AllocationABIControl4PairVMf", i32 0, i32 2), i64 0 }
}

; Function Attrs: mustprogress nounwind willreturn
define internal nonnull ptr @"$s20AllocationABIControl11LargeClientVwCP"(ptr noalias writeonly captures(none) initializes((0, 8)) %dest, ptr noalias readonly captures(none) %src, ptr readnone captures(none) %LargeClient) #10 {
entry:
  %0 = load ptr, ptr %src, align 8
  store ptr %0, ptr %dest, align 8
  %1 = getelementptr inbounds nuw i8, ptr %0, i64 16
  %2 = tail call ptr @swift_retain(ptr returned %0) #13
  ret ptr %1
}

; Function Attrs: mustprogress nounwind willreturn
declare ptr @swift_retain(ptr returned) local_unnamed_addr #11

; Function Attrs: nounwind
define linkonce_odr hidden ptr @__swift_memcpy48_8(ptr %0, ptr %1, ptr %2) #7 {
entry:
  tail call void @llvm.memcpy.p0.p0.i64(ptr noundef nonnull align 8 dereferenceable(48) %0, ptr noundef nonnull align 8 dereferenceable(48) %1, i64 48, i1 false)
  ret ptr %0
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read)
define internal i32 @"$s20AllocationABIControl11LargeClientVwet"(ptr noalias readonly captures(none) %value, i32 %numEmptyCases, ptr readnone captures(none) %LargeClient) #3 {
entry:
  switch i32 %numEmptyCases, label %0 [
    i32 0, label %12
    i32 1, label %8
  ]

0:                                                ; preds = %entry
  %1 = getelementptr inbounds nuw i8, ptr %value, i64 48
  %2 = load i8, ptr %1, align 1
  %3 = icmp eq i8 %2, 0
  br i1 %3, label %8, label %4

4:                                                ; preds = %0
  %5 = load i384, ptr %value, align 1
  %6 = trunc i384 %5 to i32
  %7 = add i32 %6, 1
  br label %12

8:                                                ; preds = %entry, %0
  %9 = load i64, ptr %value, align 8
  %10 = icmp ne i64 %9, 0
  %11 = sext i1 %10 to i32
  br label %12

12:                                               ; preds = %entry, %8, %4
  %13 = phi i32 [ %11, %8 ], [ %7, %4 ], [ -1, %entry ]
  %14 = add i32 %13, 1
  ret i32 %14
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write)
define internal void @"$s20AllocationABIControl11LargeClientVwst"(ptr noalias writeonly captures(none) %value, i32 %whichCase, i32 %numEmptyCases, ptr readnone captures(none) %LargeClient) #1 {
entry:
  %0 = getelementptr inbounds nuw i8, ptr %value, i64 48
  %1 = icmp ugt i32 %numEmptyCases, 1
  %2 = icmp ult i32 %whichCase, 2
  br i1 %2, label %3, label %8

3:                                                ; preds = %entry
  br i1 %1, label %4, label %5

4:                                                ; preds = %3
  store i8 0, ptr %0, align 8
  br label %5

5:                                                ; preds = %3, %4
  %6 = icmp eq i32 %whichCase, 0
  br i1 %6, label %12, label %7

7:                                                ; preds = %5
  store i64 0, ptr %value, align 8
  br label %12

8:                                                ; preds = %entry
  %9 = add i32 %whichCase, -2
  %10 = zext i32 %9 to i384
  store i384 %10, ptr %value, align 8
  br i1 %1, label %11, label %12

11:                                               ; preds = %8
  store i8 1, ptr %0, align 8
  br label %12

12:                                               ; preds = %8, %11, %7, %5
  ret void
}

; Function Attrs: mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none)
define swiftcc %swift.metadata_response @"$s20AllocationABIControl11LargeClientVMa"(i64 %0) #9 {
entry:
  ret %swift.metadata_response { ptr getelementptr inbounds (<{ ptr, ptr, i64, ptr, i32, i32, i32, [4 x i8] }>, ptr @"$s20AllocationABIControl11LargeClientVMf", i32 0, i32 2), i64 0 }
}

attributes #0 = { mustprogress nofree norecurse nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #1 = { mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: write) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #2 = { noinline nounwind "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #3 = { mustprogress nofree norecurse nosync nounwind willreturn memory(argmem: read) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #4 = { noinline "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #5 = { optsize "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #6 = { cold noreturn nounwind memory(inaccessiblemem: write) }
attributes #7 = { nounwind "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #8 = { mustprogress nocallback nofree nounwind willreturn memory(argmem: readwrite) }
attributes #9 = { mustprogress nofree noinline norecurse nosync nounwind willreturn memory(none) "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #10 = { mustprogress nounwind willreturn "frame-pointer"="non-leaf" "no-trapping-math"="true" "probe-stack"="__chkstk_darwin" "stack-protector-buffer-size"="8" "target-cpu"="apple-m1" "target-features"="+aes,+altnzcv,+bti,+ccdp,+ccidx,+ccpp,+complxnum,+crc,+dit,+dotprod,+flagm,+fp-armv8,+fp16fml,+fptoint,+fullfp16,+jsconv,+lse,+neon,+pauth,+perfmon,+predres,+ras,+rcpc,+rdm,+sb,+sha2,+sha3,+specrestrict,+ssbs,+v8.1a,+v8.2a,+v8.3a,+v8.4a,+v8.5a,+v8a" }
attributes #11 = { mustprogress nounwind willreturn }
attributes #12 = { nounwind }
attributes #13 = { nounwind willreturn }

!llvm.module.flags = !{!0, !1, !2, !3, !4, !5, !6, !7, !8, !9, !10, !11}
!swift.module.flags = !{!12}
!llvm.linker.options = !{!13, !14, !15, !16, !17, !18}

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
!13 = !{!"-lswift_DarwinFoundation2"}
!14 = !{!"-lswiftCore"}
!15 = !{!"-lswift_DarwinFoundation1"}
!16 = !{!"-lswift_Concurrency"}
!17 = !{!"-lswift_StringProcessing"}
!18 = !{!"-lobjc"}
