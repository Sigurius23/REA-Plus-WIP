.class public final Lcom/whoop/profile/domain/edit/models/EditProfileResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;,
        Lcom/whoop/profile/domain/edit/models/EditProfileResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u00080\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008J\u0008\u0087\u0008\u0018\u0000 \u00a8\u00012\u00020\u0001:\u0004\u00a9\u0001\u00a8\u0001B\u00a7\u0002\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0008\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0$\u0012\u000e\u0008\u0002\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00020$\u00a2\u0006\u0004\u0008(\u0010)B\u00b3\u0002\u0008\u0010\u0012\u0006\u0010*\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u0012\u0008\u0010#\u001a\u0004\u0018\u00010\"\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u000e\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$\u0012\u0008\u0010,\u001a\u0004\u0018\u00010+\u00a2\u0006\u0004\u0008(\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010/J\u0010\u00101\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010/J\u0010\u00102\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010/J\u0012\u00103\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010/J\u0010\u00104\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010/J\u0012\u00105\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010/J\u0010\u00106\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010/J\u0012\u00107\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010/J\u0010\u00108\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u0010\u0010:\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010=J\u0010\u0010>\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010;J\u0010\u0010?\u001a\u00020\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010@J\u0010\u0010A\u001a\u00020\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008A\u0010@J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u0010/J\u0010\u0010C\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008C\u0010/J\u0010\u0010D\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010;J\u0010\u0010E\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008E\u0010;J\u0012\u0010F\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008F\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008H\u0010GJ\u0010\u0010I\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008I\u0010;J\u0010\u0010J\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008J\u0010;J\u0010\u0010K\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008K\u0010;J\u0010\u0010L\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008L\u0010;J\u0012\u0010M\u001a\u0004\u0018\u00010 H\u00c6\u0003\u00a2\u0006\u0004\u0008M\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\"H\u00c6\u0003\u00a2\u0006\u0004\u0008O\u0010PJ\u0016\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020%0$H\u00c6\u0003\u00a2\u0006\u0004\u0008Q\u0010RJ\u0016\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u00020$H\u00c6\u0003\u00a2\u0006\u0004\u0008S\u0010RJ\u00d4\u0002\u0010T\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u000e2\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u000e2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\"2\u000e\u0008\u0002\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0$2\u000e\u0008\u0002\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00020$H\u00c6\u0001\u00a2\u0006\u0004\u0008T\u0010UJ\u0010\u0010V\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008V\u0010/J\u0010\u0010W\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008W\u0010;J\u001a\u0010Y\u001a\u00020\u00102\u0008\u0010X\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008Y\u0010ZJ\'\u0010c\u001a\u00020`2\u0006\u0010[\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^H\u0001\u00a2\u0006\u0004\u0008a\u0010bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010d\u0012\u0004\u0008f\u0010g\u001a\u0004\u0008e\u0010/R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010d\u0012\u0004\u0008i\u0010g\u001a\u0004\u0008h\u0010/R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010d\u0012\u0004\u0008k\u0010g\u001a\u0004\u0008j\u0010/R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010d\u0012\u0004\u0008m\u0010g\u001a\u0004\u0008l\u0010/R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010d\u0012\u0004\u0008o\u0010g\u001a\u0004\u0008n\u0010/R \u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010d\u0012\u0004\u0008q\u0010g\u001a\u0004\u0008p\u0010/R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010d\u0012\u0004\u0008s\u0010g\u001a\u0004\u0008r\u0010/R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010d\u0012\u0004\u0008u\u0010g\u001a\u0004\u0008t\u0010/R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010d\u0012\u0004\u0008w\u0010g\u001a\u0004\u0008v\u0010/R \u0010\r\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010x\u0012\u0004\u0008z\u0010g\u001a\u0004\u0008y\u00109R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010{\u0012\u0004\u0008}\u0010g\u001a\u0004\u0008|\u0010;R#\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0013\n\u0004\u0008\u0011\u0010~\u0012\u0005\u0008\u0080\u0001\u0010g\u001a\u0004\u0008\u007f\u0010=R\"\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u0012\u0010{\u0012\u0005\u0008\u0082\u0001\u0010g\u001a\u0005\u0008\u0081\u0001\u0010;R#\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u0014\u0010\u0083\u0001\u0012\u0005\u0008\u0085\u0001\u0010g\u001a\u0005\u0008\u0084\u0001\u0010@R#\u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u0015\u0010\u0083\u0001\u0012\u0005\u0008\u0087\u0001\u0010g\u001a\u0005\u0008\u0086\u0001\u0010@R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u0016\u0010d\u0012\u0005\u0008\u0089\u0001\u0010g\u001a\u0005\u0008\u0088\u0001\u0010/R\"\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u0017\u0010d\u0012\u0005\u0008\u008b\u0001\u0010g\u001a\u0005\u0008\u008a\u0001\u0010/R\"\u0010\u0018\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u0018\u0010{\u0012\u0005\u0008\u008d\u0001\u0010g\u001a\u0005\u0008\u008c\u0001\u0010;R\"\u0010\u0019\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u0019\u0010{\u0012\u0005\u0008\u008f\u0001\u0010g\u001a\u0005\u0008\u008e\u0001\u0010;R%\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u001a\u0010\u0090\u0001\u0012\u0005\u0008\u0092\u0001\u0010g\u001a\u0005\u0008\u0091\u0001\u0010GR%\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u001b\u0010\u0090\u0001\u0012\u0005\u0008\u0094\u0001\u0010g\u001a\u0005\u0008\u0093\u0001\u0010GR\"\u0010\u001c\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u001c\u0010{\u0012\u0005\u0008\u0096\u0001\u0010g\u001a\u0005\u0008\u0095\u0001\u0010;R\"\u0010\u001d\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u001d\u0010{\u0012\u0005\u0008\u0098\u0001\u0010g\u001a\u0005\u0008\u0097\u0001\u0010;R\"\u0010\u001e\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u001e\u0010{\u0012\u0005\u0008\u009a\u0001\u0010g\u001a\u0005\u0008\u0099\u0001\u0010;R\"\u0010\u001f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u001f\u0010{\u0012\u0005\u0008\u009c\u0001\u0010g\u001a\u0005\u0008\u009b\u0001\u0010;R%\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008!\u0010\u009d\u0001\u0012\u0005\u0008\u009f\u0001\u0010g\u001a\u0005\u0008\u009e\u0001\u0010NR%\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008#\u0010\u00a0\u0001\u0012\u0005\u0008\u00a2\u0001\u0010g\u001a\u0005\u0008\u00a1\u0001\u0010PR)\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0$8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008&\u0010\u00a3\u0001\u0012\u0005\u0008\u00a5\u0001\u0010g\u001a\u0005\u0008\u00a4\u0001\u0010RR)\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00020$8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\'\u0010\u00a3\u0001\u0012\u0005\u0008\u00a7\u0001\u0010g\u001a\u0005\u0008\u00a6\u0001\u0010R\u00a8\u0006\u00aa\u0001"
    }
    d2 = {
        "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;",
        "",
        "",
        "title",
        "avatarUrl",
        "firstName",
        "lastName",
        "username",
        "email",
        "city",
        "country",
        "state",
        "",
        "memberSince",
        "",
        "age",
        "",
        "foundingMember",
        "userId",
        "",
        "height",
        "weight",
        "birthday",
        "unitSystem",
        "heightFeetMinValue",
        "heightFeetMaxValue",
        "heightMetersMinValue",
        "heightMetersMaxValue",
        "weightPoundsMinValue",
        "weightPoundsMaxValue",
        "weightKilogramsMinValue",
        "weightKilogramsMaxValue",
        "Lcom/whoop/profile/domain/models/Gender;",
        "gender",
        "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;",
        "physiologicalBaseline",
        "",
        "Lcom/whoop/profile/domain/edit/models/CountryOption;",
        "countries",
        "lockedFields",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "()D",
        "component11",
        "()I",
        "component12",
        "()Ljava/lang/Boolean;",
        "component13",
        "component14",
        "()F",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "()Ljava/lang/Float;",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "()Lcom/whoop/profile/domain/models/Gender;",
        "component27",
        "()Lcom/whoop/profile/domain/models/PhysiologicalBaseline;",
        "component28",
        "()Ljava/util/List;",
        "component29",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;)Lcom/whoop/profile/domain/edit/models/EditProfileResponse;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$profile_release",
        "(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "getAvatarUrl",
        "getAvatarUrl$annotations",
        "getFirstName",
        "getFirstName$annotations",
        "getLastName",
        "getLastName$annotations",
        "getUsername",
        "getUsername$annotations",
        "getEmail",
        "getEmail$annotations",
        "getCity",
        "getCity$annotations",
        "getCountry",
        "getCountry$annotations",
        "getState",
        "getState$annotations",
        "D",
        "getMemberSince",
        "getMemberSince$annotations",
        "I",
        "getAge",
        "getAge$annotations",
        "Ljava/lang/Boolean;",
        "getFoundingMember",
        "getFoundingMember$annotations",
        "getUserId",
        "getUserId$annotations",
        "F",
        "getHeight",
        "getHeight$annotations",
        "getWeight",
        "getWeight$annotations",
        "getBirthday",
        "getBirthday$annotations",
        "getUnitSystem",
        "getUnitSystem$annotations",
        "getHeightFeetMinValue",
        "getHeightFeetMinValue$annotations",
        "getHeightFeetMaxValue",
        "getHeightFeetMaxValue$annotations",
        "Ljava/lang/Float;",
        "getHeightMetersMinValue",
        "getHeightMetersMinValue$annotations",
        "getHeightMetersMaxValue",
        "getHeightMetersMaxValue$annotations",
        "getWeightPoundsMinValue",
        "getWeightPoundsMinValue$annotations",
        "getWeightPoundsMaxValue",
        "getWeightPoundsMaxValue$annotations",
        "getWeightKilogramsMinValue",
        "getWeightKilogramsMinValue$annotations",
        "getWeightKilogramsMaxValue",
        "getWeightKilogramsMaxValue$annotations",
        "Lcom/whoop/profile/domain/models/Gender;",
        "getGender",
        "getGender$annotations",
        "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;",
        "getPhysiologicalBaseline",
        "getPhysiologicalBaseline$annotations",
        "Ljava/util/List;",
        "getCountries",
        "getCountries$annotations",
        "getLockedFields",
        "getLockedFields$annotations",
        "Companion",
        "$serializer",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/profile/domain/edit/models/EditProfileResponse$Companion;


# instance fields
.field private final age:I

.field private final avatarUrl:Ljava/lang/String;

.field private final birthday:Ljava/lang/String;

.field private final city:Ljava/lang/String;

.field private final countries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/profile/domain/edit/models/CountryOption;",
            ">;"
        }
    .end annotation
.end field

.field private final country:Ljava/lang/String;

.field private final email:Ljava/lang/String;

.field private final firstName:Ljava/lang/String;

.field private final foundingMember:Ljava/lang/Boolean;

.field private final gender:Lcom/whoop/profile/domain/models/Gender;

.field private final height:F

.field private final heightFeetMaxValue:I

.field private final heightFeetMinValue:I

.field private final heightMetersMaxValue:Ljava/lang/Float;

.field private final heightMetersMinValue:Ljava/lang/Float;

.field private final lastName:Ljava/lang/String;

.field private final lockedFields:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final memberSince:D

.field private final physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

.field private final state:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final unitSystem:Ljava/lang/String;

.field private final userId:I

.field private final username:Ljava/lang/String;

.field private final weight:F

.field private final weightKilogramsMaxValue:I

.field private final weightKilogramsMinValue:I

.field private final weightPoundsMaxValue:I

.field private final weightPoundsMinValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->Companion:Lcom/whoop/profile/domain/edit/models/EditProfileResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lqv1/e;

    const/16 v4, 0x9

    invoke-direct {v3, v4}, Lqv1/e;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lqv1/e;

    const/16 v6, 0xa

    invoke-direct {v5, v6}, Lqv1/e;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lqv1/e;

    const/16 v8, 0xb

    invoke-direct {v7, v8}, Lqv1/e;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lqv1/e;

    const/16 v10, 0xc

    invoke-direct {v9, v10}, Lqv1/e;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v9, 0x1d

    new-array v9, v9, [Ll83/h;

    const/4 v11, 0x0

    aput-object v1, v9, v11

    const/4 v11, 0x1

    aput-object v1, v9, v11

    const/4 v11, 0x2

    aput-object v1, v9, v11

    const/4 v11, 0x3

    aput-object v1, v9, v11

    const/4 v11, 0x4

    aput-object v1, v9, v11

    const/4 v11, 0x5

    aput-object v1, v9, v11

    const/4 v11, 0x6

    aput-object v1, v9, v11

    const/4 v11, 0x7

    aput-object v1, v9, v11

    aput-object v1, v9, v0

    aput-object v1, v9, v4

    aput-object v1, v9, v6

    aput-object v1, v9, v8

    aput-object v1, v9, v10

    const/16 v0, 0xd

    aput-object v1, v9, v0

    const/16 v0, 0xe

    aput-object v1, v9, v0

    const/16 v0, 0xf

    aput-object v1, v9, v0

    const/16 v0, 0x10

    aput-object v1, v9, v0

    const/16 v0, 0x11

    aput-object v1, v9, v0

    const/16 v0, 0x12

    aput-object v1, v9, v0

    const/16 v0, 0x13

    aput-object v1, v9, v0

    const/16 v0, 0x14

    aput-object v1, v9, v0

    const/16 v0, 0x15

    aput-object v1, v9, v0

    const/16 v0, 0x16

    aput-object v1, v9, v0

    const/16 v0, 0x17

    aput-object v1, v9, v0

    const/16 v0, 0x18

    aput-object v1, v9, v0

    const/16 v0, 0x19

    aput-object v3, v9, v0

    const/16 v0, 0x1a

    aput-object v5, v9, v0

    const/16 v0, 0x1b

    aput-object v7, v9, v0

    const/16 v0, 0x1c

    aput-object v2, v9, v0

    sput-object v9, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0xde776ac

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;->INSTANCE:Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->title:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->title:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->avatarUrl:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->avatarUrl:Ljava/lang/String;

    :goto_1
    iput-object p4, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->firstName:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lastName:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->username:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->username:Ljava/lang/String;

    :goto_2
    iput-object p7, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->email:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_4

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->city:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p8, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->city:Ljava/lang/String;

    :goto_3
    iput-object p9, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->country:Ljava/lang/String;

    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_5

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->state:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p10, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->state:Ljava/lang/String;

    :goto_4
    iput-wide p11, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->memberSince:D

    iput p13, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->age:I

    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_6

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->foundingMember:Ljava/lang/Boolean;

    :goto_5
    move/from16 p2, p15

    goto :goto_6

    :cond_6
    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->foundingMember:Ljava/lang/Boolean;

    goto :goto_5

    :goto_6
    iput p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->userId:I

    move/from16 p2, p16

    iput p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->height:F

    move/from16 p2, p17

    iput p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weight:F

    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_7

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->birthday:Ljava/lang/String;

    :goto_7
    move-object/from16 p2, p19

    goto :goto_8

    :cond_7
    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->birthday:Ljava/lang/String;

    goto :goto_7

    :goto_8
    iput-object p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->unitSystem:Ljava/lang/String;

    move/from16 p2, p20

    iput p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMinValue:I

    move/from16 p2, p21

    iput p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMaxValue:I

    const/high16 p2, 0x80000

    and-int/2addr p2, p1

    if-nez p2, :cond_8

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMinValue:Ljava/lang/Float;

    goto :goto_9

    :cond_8
    move-object/from16 p2, p22

    iput-object p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMinValue:Ljava/lang/Float;

    :goto_9
    const/high16 p2, 0x100000

    and-int/2addr p2, p1

    if-nez p2, :cond_9

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMaxValue:Ljava/lang/Float;

    :goto_a
    move/from16 p2, p24

    goto :goto_b

    :cond_9
    move-object/from16 p2, p23

    iput-object p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMaxValue:Ljava/lang/Float;

    goto :goto_a

    :goto_b
    iput p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMinValue:I

    move/from16 p2, p25

    iput p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMaxValue:I

    move/from16 p2, p26

    iput p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMinValue:I

    move/from16 p2, p27

    iput p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMaxValue:I

    const/high16 p2, 0x2000000

    and-int/2addr p2, p1

    if-nez p2, :cond_a

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->gender:Lcom/whoop/profile/domain/models/Gender;

    :goto_c
    move-object/from16 p2, p29

    goto :goto_d

    :cond_a
    move-object/from16 p2, p28

    iput-object p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->gender:Lcom/whoop/profile/domain/models/Gender;

    goto :goto_c

    :goto_d
    iput-object p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    move-object/from16 p2, p30

    iput-object p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->countries:Ljava/util/List;

    const/high16 p2, 0x10000000

    and-int/2addr p1, p2

    if-nez p1, :cond_b

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    .line 3
    :goto_e
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lockedFields:Ljava/util/List;

    return-void

    :cond_b
    move-object/from16 p1, p31

    goto :goto_e
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "DI",
            "Ljava/lang/Boolean;",
            "IFF",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "IIII",
            "Lcom/whoop/profile/domain/models/Gender;",
            "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;",
            "Ljava/util/List<",
            "Lcom/whoop/profile/domain/edit/models/CountryOption;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p18

    move-object/from16 v1, p29

    move-object/from16 v2, p30

    const-string v3, "firstName"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "lastName"

    invoke-static {p4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "email"

    invoke-static {p6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "country"

    invoke-static {p8, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "unitSystem"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "countries"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "lockedFields"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->title:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->avatarUrl:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->firstName:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lastName:Ljava/lang/String;

    .line 9
    iput-object p5, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->username:Ljava/lang/String;

    .line 10
    iput-object p6, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->email:Ljava/lang/String;

    .line 11
    iput-object p7, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->city:Ljava/lang/String;

    .line 12
    iput-object p8, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->country:Ljava/lang/String;

    .line 13
    iput-object p9, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->state:Ljava/lang/String;

    .line 14
    iput-wide p10, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->memberSince:D

    move/from16 p1, p12

    .line 15
    iput p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->age:I

    move-object/from16 p1, p13

    .line 16
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->foundingMember:Ljava/lang/Boolean;

    move/from16 p1, p14

    .line 17
    iput p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->userId:I

    move/from16 p1, p15

    .line 18
    iput p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->height:F

    move/from16 p1, p16

    .line 19
    iput p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weight:F

    move-object/from16 p1, p17

    .line 20
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->birthday:Ljava/lang/String;

    .line 21
    iput-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->unitSystem:Ljava/lang/String;

    move/from16 p1, p19

    .line 22
    iput p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMinValue:I

    move/from16 p1, p20

    .line 23
    iput p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMaxValue:I

    move-object/from16 p1, p21

    .line 24
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMinValue:Ljava/lang/Float;

    move-object/from16 p1, p22

    .line 25
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMaxValue:Ljava/lang/Float;

    move/from16 p1, p23

    .line 26
    iput p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMinValue:I

    move/from16 p1, p24

    .line 27
    iput p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMaxValue:I

    move/from16 p1, p25

    .line 28
    iput p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMinValue:I

    move/from16 p1, p26

    .line 29
    iput p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMaxValue:I

    move-object/from16 p1, p27

    .line 30
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->gender:Lcom/whoop/profile/domain/models/Gender;

    move-object/from16 p1, p28

    .line 31
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    .line 32
    iput-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->countries:Ljava/util/List;

    .line 33
    iput-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lockedFields:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 34

    move/from16 v0, p31

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_4

    move-object v12, v2

    goto :goto_4

    :cond_4
    move-object/from16 v12, p9

    :goto_4
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_5

    move-object/from16 v16, v2

    goto :goto_5

    :cond_5
    move-object/from16 v16, p13

    :goto_5
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_6

    move-object/from16 v20, v2

    goto :goto_6

    :cond_6
    move-object/from16 v20, p17

    :goto_6
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_7

    move-object/from16 v24, v2

    goto :goto_7

    :cond_7
    move-object/from16 v24, p21

    :goto_7
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    move-object/from16 v25, v2

    goto :goto_8

    :cond_8
    move-object/from16 v25, p22

    :goto_8
    const/high16 v1, 0x2000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_9

    move-object/from16 v30, v2

    goto :goto_9

    :cond_9
    move-object/from16 v30, p27

    :goto_9
    const/high16 v1, 0x10000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_a

    .line 34
    sget-object v0, Lm83/y;->w:Lm83/y;

    move-object/from16 v33, v0

    :goto_a
    move-object/from16 v3, p0

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v9, p6

    move-object/from16 v11, p8

    move-wide/from16 v13, p10

    move/from16 v15, p12

    move/from16 v17, p14

    move/from16 v18, p15

    move/from16 v19, p16

    move-object/from16 v21, p18

    move/from16 v22, p19

    move/from16 v23, p20

    move/from16 v26, p23

    move/from16 v27, p24

    move/from16 v28, p25

    move/from16 v29, p26

    move-object/from16 v31, p28

    move-object/from16 v32, p29

    goto :goto_b

    :cond_a
    move-object/from16 v33, p30

    goto :goto_a

    .line 35
    :goto_b
    invoke-direct/range {v3 .. v33}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/profile/domain/models/Gender;->Companion:Lcom/whoop/profile/domain/models/Gender$Companion;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/Gender$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;->Companion:Lcom/whoop/profile/domain/models/PhysiologicalBaseline$Companion;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/PhysiologicalBaseline$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/profile/domain/edit/models/CountryOption$$serializer;->INSTANCE:Lcom/whoop/profile/domain/edit/models/CountryOption$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/models/EditProfileResponse;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p31

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->title:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->avatarUrl:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->firstName:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lastName:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->username:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->email:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->city:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->country:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->state:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-wide v11, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->memberSince:D

    goto :goto_9

    :cond_9
    move-wide/from16 v11, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget v13, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->age:I

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->foundingMember:Ljava/lang/Boolean;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->userId:I

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->height:F

    goto :goto_d

    :cond_d
    move/from16 v2, p15

    :goto_d
    move/from16 p2, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weight:F

    goto :goto_e

    :cond_e
    move/from16 v2, p16

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->birthday:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p17

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p31, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->unitSystem:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p18

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p31, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMinValue:I

    goto :goto_11

    :cond_11
    move/from16 v1, p19

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p31, v16

    move/from16 p5, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMaxValue:I

    goto :goto_12

    :cond_12
    move/from16 v1, p20

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p31, v16

    move/from16 p6, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMinValue:Ljava/lang/Float;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p21

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p31, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMaxValue:Ljava/lang/Float;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p22

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p31, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_15

    iget v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMinValue:I

    goto :goto_15

    :cond_15
    move/from16 v1, p23

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p31, v16

    move/from16 p9, v1

    if-eqz v16, :cond_16

    iget v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMaxValue:I

    goto :goto_16

    :cond_16
    move/from16 v1, p24

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p31, v16

    move/from16 p10, v1

    if-eqz v16, :cond_17

    iget v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMinValue:I

    goto :goto_17

    :cond_17
    move/from16 v1, p25

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p31, v16

    move/from16 p11, v1

    if-eqz v16, :cond_18

    iget v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMaxValue:I

    goto :goto_18

    :cond_18
    move/from16 v1, p26

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p31, v16

    move/from16 p12, v1

    if-eqz v16, :cond_19

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->gender:Lcom/whoop/profile/domain/models/Gender;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p27

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p31, v16

    move-object/from16 p13, v1

    if-eqz v16, :cond_1a

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p28

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p31, v16

    move-object/from16 p14, v1

    if-eqz v16, :cond_1b

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->countries:Ljava/util/List;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p29

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p31, v16

    if-eqz v16, :cond_1c

    move-object/from16 p15, v1

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lockedFields:Ljava/util/List;

    move-object/from16 p30, p15

    move-object/from16 p31, v1

    :goto_1c
    move/from16 p16, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move/from16 p20, p5

    move/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move/from16 p24, p9

    move/from16 p25, p10

    move/from16 p26, p11

    move/from16 p27, p12

    move-object/from16 p28, p13

    move-object/from16 p29, p14

    move/from16 p17, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-wide/from16 p11, v11

    move/from16 p13, v13

    move-object/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_1d

    :cond_1c
    move-object/from16 p31, p30

    move-object/from16 p30, v1

    goto :goto_1c

    :goto_1d
    invoke-virtual/range {p1 .. p31}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;)Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAge$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "age"
    .end annotation

    return-void
.end method

.method public static synthetic getAvatarUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "avatar_url"
    .end annotation

    return-void
.end method

.method public static synthetic getBirthday$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "birthday"
    .end annotation

    return-void
.end method

.method public static synthetic getCity$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "city"
    .end annotation

    return-void
.end method

.method public static synthetic getCountries$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "countries"
    .end annotation

    return-void
.end method

.method public static synthetic getCountry$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "country"
    .end annotation

    return-void
.end method

.method public static synthetic getEmail$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "email"
    .end annotation

    return-void
.end method

.method public static synthetic getFirstName$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "first_name"
    .end annotation

    return-void
.end method

.method public static synthetic getFoundingMember$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "founding_member"
    .end annotation

    return-void
.end method

.method public static synthetic getGender$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "gender"
    .end annotation

    return-void
.end method

.method public static synthetic getHeight$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "height"
    .end annotation

    return-void
.end method

.method public static synthetic getHeightFeetMaxValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "height_feet_max_value"
    .end annotation

    return-void
.end method

.method public static synthetic getHeightFeetMinValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "height_feet_min_value"
    .end annotation

    return-void
.end method

.method public static synthetic getHeightMetersMaxValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "height_meters_max_value"
    .end annotation

    return-void
.end method

.method public static synthetic getHeightMetersMinValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "height_meters_min_value"
    .end annotation

    return-void
.end method

.method public static synthetic getLastName$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "last_name"
    .end annotation

    return-void
.end method

.method public static synthetic getLockedFields$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "locked_fields"
    .end annotation

    return-void
.end method

.method public static synthetic getMemberSince$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "member_since"
    .end annotation

    return-void
.end method

.method public static synthetic getPhysiologicalBaseline$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "physiological_baseline"
    .end annotation

    return-void
.end method

.method public static synthetic getState$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "state"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "title"
    .end annotation

    return-void
.end method

.method public static synthetic getUnitSystem$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "unit_system"
    .end annotation

    return-void
.end method

.method public static synthetic getUserId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "user_id"
    .end annotation

    return-void
.end method

.method public static synthetic getUsername$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "username"
    .end annotation

    return-void
.end method

.method public static synthetic getWeight$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "weight"
    .end annotation

    return-void
.end method

.method public static synthetic getWeightKilogramsMaxValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "weight_kilograms_max_value"
    .end annotation

    return-void
.end method

.method public static synthetic getWeightKilogramsMinValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "weight_kilograms_min_value"
    .end annotation

    return-void
.end method

.method public static synthetic getWeightPoundsMaxValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "weight_pounds_max_value"
    .end annotation

    return-void
.end method

.method public static synthetic getWeightPoundsMinValue$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "weight_pounds_min_value"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$profile_release(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->title:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->avatarUrl:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->avatarUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->firstName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lastName:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->username:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->username:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->email:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->city:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->city:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->country:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->state:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->state:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v1, 0x9

    iget-wide v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->memberSince:D

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    const/16 v1, 0xa

    iget v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->age:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->foundingMember:Ljava/lang/Boolean;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->foundingMember:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v1, 0xc

    iget v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->userId:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v1, 0xd

    iget v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->height:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/16 v1, 0xe

    iget v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weight:F

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    const/16 v1, 0xf

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->birthday:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->birthday:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v1, 0x10

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->unitSystem:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x11

    iget v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMinValue:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v1, 0x12

    iget v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMaxValue:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v1, 0x13

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMinValue:Ljava/lang/Float;

    if-eqz v2, :cond_f

    :goto_7
    sget-object v2, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMinValue:Ljava/lang/Float;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v1, 0x14

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMaxValue:Ljava/lang/Float;

    if-eqz v2, :cond_11

    :goto_8
    sget-object v2, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMaxValue:Ljava/lang/Float;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0x15

    iget v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMinValue:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v1, 0x16

    iget v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMaxValue:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v1, 0x17

    iget v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMinValue:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v1, 0x18

    iget v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMaxValue:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v1, 0x19

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->gender:Lcom/whoop/profile/domain/models/Gender;

    if-eqz v2, :cond_13

    :goto_9
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->gender:Lcom/whoop/profile/domain/models/Gender;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v1, 0x1a

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x1b

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->countries:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x1c

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lockedFields:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    :goto_a
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lockedFields:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->memberSince:D

    return-wide v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->age:I

    return v0
.end method

.method public final component12()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->foundingMember:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->userId:I

    return v0
.end method

.method public final component14()F
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->height:F

    return v0
.end method

.method public final component15()F
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weight:F

    return v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->birthday:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->unitSystem:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMinValue:I

    return v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMaxValue:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMinValue:Ljava/lang/Float;

    return-object v0
.end method

.method public final component21()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMaxValue:Ljava/lang/Float;

    return-object v0
.end method

.method public final component22()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMinValue:I

    return v0
.end method

.method public final component23()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMaxValue:I

    return v0
.end method

.method public final component24()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMinValue:I

    return v0
.end method

.method public final component25()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMaxValue:I

    return v0
.end method

.method public final component26()Lcom/whoop/profile/domain/models/Gender;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->gender:Lcom/whoop/profile/domain/models/Gender;

    return-object v0
.end method

.method public final component27()Lcom/whoop/profile/domain/models/PhysiologicalBaseline;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    return-object v0
.end method

.method public final component28()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/profile/domain/edit/models/CountryOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->countries:Ljava/util/List;

    return-object v0
.end method

.method public final component29()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lockedFields:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->city:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->state:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;)Lcom/whoop/profile/domain/edit/models/EditProfileResponse;
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "DI",
            "Ljava/lang/Boolean;",
            "IFF",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "IIII",
            "Lcom/whoop/profile/domain/models/Gender;",
            "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;",
            "Ljava/util/List<",
            "Lcom/whoop/profile/domain/edit/models/CountryOption;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;"
        }
    .end annotation

    const-string v0, "firstName"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastName"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "email"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitSystem"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "countries"

    move-object/from16 v2, p29

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lockedFields"

    move-object/from16 v3, p30

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move-wide/from16 v11, p10

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move/from16 v20, p19

    move/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move/from16 v24, p23

    move/from16 v25, p24

    move/from16 v26, p25

    move/from16 v27, p26

    move-object/from16 v28, p27

    move-object/from16 v29, p28

    move-object/from16 v30, v2

    move-object/from16 v31, v3

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v1 .. v31}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DILjava/lang/Boolean;IFFLjava/lang/String;Ljava/lang/String;IILjava/lang/Float;Ljava/lang/Float;IIIILcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->avatarUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->avatarUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->firstName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->firstName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lastName:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lastName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->username:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->username:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->email:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->email:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->city:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->city:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->country:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->country:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->state:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->state:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->memberSince:D

    iget-wide v5, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->memberSince:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->age:I

    iget v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->age:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->foundingMember:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->foundingMember:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->userId:I

    iget v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->userId:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->height:F

    iget v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->height:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weight:F

    iget v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weight:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->birthday:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->birthday:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->unitSystem:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->unitSystem:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMinValue:I

    iget v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMinValue:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMaxValue:I

    iget v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMaxValue:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMinValue:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMinValue:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMaxValue:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMaxValue:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMinValue:I

    iget v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMinValue:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMaxValue:I

    iget v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMaxValue:I

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMinValue:I

    iget v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMinValue:I

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMaxValue:I

    iget v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMaxValue:I

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->gender:Lcom/whoop/profile/domain/models/Gender;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->gender:Lcom/whoop/profile/domain/models/Gender;

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->countries:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->countries:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lockedFields:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lockedFields:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1e

    return v2

    :cond_1e
    return v0
.end method

.method public final getAge()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->age:I

    return v0
.end method

.method public final getAvatarUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getBirthday()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->birthday:Ljava/lang/String;

    return-object v0
.end method

.method public final getCity()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->city:Ljava/lang/String;

    return-object v0
.end method

.method public final getCountries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/profile/domain/edit/models/CountryOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->countries:Ljava/util/List;

    return-object v0
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->country:Ljava/lang/String;

    return-object v0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->email:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirstName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public final getFoundingMember()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->foundingMember:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getGender()Lcom/whoop/profile/domain/models/Gender;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->gender:Lcom/whoop/profile/domain/models/Gender;

    return-object v0
.end method

.method public final getHeight()F
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->height:F

    return v0
.end method

.method public final getHeightFeetMaxValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMaxValue:I

    return v0
.end method

.method public final getHeightFeetMinValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMinValue:I

    return v0
.end method

.method public final getHeightMetersMaxValue()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMaxValue:Ljava/lang/Float;

    return-object v0
.end method

.method public final getHeightMetersMinValue()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMinValue:Ljava/lang/Float;

    return-object v0
.end method

.method public final getLastName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public final getLockedFields()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lockedFields:Ljava/util/List;

    return-object v0
.end method

.method public final getMemberSince()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->memberSince:D

    return-wide v0
.end method

.method public final getPhysiologicalBaseline()Lcom/whoop/profile/domain/models/PhysiologicalBaseline;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    return-object v0
.end method

.method public final getState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->state:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUnitSystem()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->unitSystem:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->userId:I

    return v0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeight()F
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weight:F

    return v0
.end method

.method public final getWeightKilogramsMaxValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMaxValue:I

    return v0
.end method

.method public final getWeightKilogramsMinValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMinValue:I

    return v0
.end method

.method public final getWeightPoundsMaxValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMaxValue:I

    return v0
.end method

.method public final getWeightPoundsMinValue()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMinValue:I

    return v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->title:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->avatarUrl:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->firstName:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lastName:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->username:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->email:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->city:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->country:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->state:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-wide v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->memberSince:D

    invoke-static {v0, v2, v3, v4}, Lhc3/i;->a(IID)I

    move-result v0

    iget v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->age:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->foundingMember:Ljava/lang/Boolean;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->userId:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->height:F

    invoke-static {v3, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weight:F

    invoke-static {v3, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->birthday:Ljava/lang/String;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->unitSystem:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMinValue:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMaxValue:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMinValue:Ljava/lang/Float;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMaxValue:Ljava/lang/Float;

    if-nez v3, :cond_8

    move v3, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMinValue:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMaxValue:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMinValue:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMaxValue:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->gender:Lcom/whoop/profile/domain/models/Gender;

    if-nez v3, :cond_9

    move v3, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    if-nez v3, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->countries:Ljava/util/List;

    invoke-static {v0, v2, v1}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lockedFields:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 33

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->title:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->avatarUrl:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->firstName:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lastName:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->username:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->email:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->city:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->country:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->state:Ljava/lang/String;

    iget-wide v10, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->memberSince:D

    iget v12, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->age:I

    iget-object v13, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->foundingMember:Ljava/lang/Boolean;

    iget v14, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->userId:I

    iget v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->height:F

    move/from16 v16, v15

    iget v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weight:F

    move/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->birthday:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->unitSystem:Ljava/lang/String;

    move-object/from16 v19, v15

    iget v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMinValue:I

    move/from16 v20, v15

    iget v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightFeetMaxValue:I

    move/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMinValue:Ljava/lang/Float;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->heightMetersMaxValue:Ljava/lang/Float;

    move-object/from16 v23, v15

    iget v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMinValue:I

    move/from16 v24, v15

    iget v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightPoundsMaxValue:I

    move/from16 v25, v15

    iget v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMinValue:I

    move/from16 v26, v15

    iget v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->weightKilogramsMaxValue:I

    move/from16 v27, v15

    iget-object v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->gender:Lcom/whoop/profile/domain/models/Gender;

    move-object/from16 v28, v15

    iget-object v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->physiologicalBaseline:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    move-object/from16 v29, v15

    iget-object v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->countries:Ljava/util/List;

    move-object/from16 v30, v15

    iget-object v15, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->lockedFields:Ljava/util/List;

    const-string v0, ", avatarUrl="

    move-object/from16 v31, v15

    const-string v15, ", firstName="

    move/from16 v32, v14

    const-string v14, "EditProfileResponse(title="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastName="

    const-string v2, ", username="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", email="

    const-string v2, ", city="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", country="

    const-string v2, ", state="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", memberSince="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", age="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", foundingMember="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", birthday="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", unitSystem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", heightFeetMinValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", heightFeetMaxValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", heightMetersMinValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", heightMetersMaxValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", weightPoundsMinValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", weightPoundsMaxValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", weightKilogramsMinValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", weightKilogramsMaxValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", gender="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", physiologicalBaseline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", countries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lockedFields="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
