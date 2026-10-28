.class public final Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;,
        Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008(\u0008\u0087\u0008\u0018\u0000 \u007f2\u00020\u0001:\u0004\u0080\u0001\u0081\u0001B\u00af\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001b\u00a2\u0006\u0004\u0008%\u0010&B\u00c9\u0002\u0008\u0010\u0012\u0006\u0010(\u001a\u00020\'\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001b\u0012\u0008\u0010*\u001a\u0004\u0018\u00010)\u00a2\u0006\u0004\u0008%\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010-J\u0010\u0010/\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010-J\u0010\u00100\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010-J\u0010\u00101\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010-J\u0010\u00102\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010-J\u0012\u00103\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010-J\u0012\u00104\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010-J\u0012\u00105\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010-J\u0012\u00106\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010-J\u0012\u00107\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010-J\u0012\u00108\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00088\u0010-J\u0012\u00109\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010-J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010-J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010-J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010-J\u0012\u0010=\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010-J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010-J\u0012\u0010A\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008A\u0010>J\u0012\u0010B\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0004\u0008B\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010-J\u0018\u0010E\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u00c6\u0003\u00a2\u0006\u0004\u0008E\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008G\u0010-J\u0012\u0010H\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008H\u0010-J\u0012\u0010I\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008I\u0010-J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008J\u0010-J\u0012\u0010K\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008K\u0010-J\u0018\u0010L\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001bH\u00c6\u0003\u00a2\u0006\u0004\u0008L\u0010FJ\u00ec\u0002\u0010M\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001bH\u00c6\u0001\u00a2\u0006\u0004\u0008M\u0010NJ\u0010\u0010O\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008O\u0010-J\u0010\u0010P\u001a\u00020\'H\u00d6\u0001\u00a2\u0006\u0004\u0008P\u0010QJ\u001a\u0010S\u001a\u00020\u00132\u0008\u0010R\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008S\u0010TJ\'\u0010]\u001a\u00020Z2\u0006\u0010U\u001a\u00020\u00002\u0006\u0010W\u001a\u00020V2\u0006\u0010Y\u001a\u00020XH\u0001\u00a2\u0006\u0004\u0008[\u0010\\R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010^\u001a\u0004\u0008_\u0010-R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010^\u001a\u0004\u0008`\u0010-R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010^\u001a\u0004\u0008a\u0010-R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010^\u001a\u0004\u0008b\u0010-R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010^\u001a\u0004\u0008c\u0010-R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010^\u001a\u0004\u0008d\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010^\u001a\u0004\u0008e\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010^\u001a\u0004\u0008f\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010^\u001a\u0004\u0008g\u0010-R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010^\u001a\u0004\u0008h\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010^\u001a\u0004\u0008i\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010^\u001a\u0004\u0008j\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010^\u001a\u0004\u0008k\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010^\u001a\u0004\u0008l\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010^\u001a\u0004\u0008m\u0010-R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010^\u001a\u0004\u0008n\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010o\u001a\u0004\u0008p\u0010>R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010^\u001a\u0004\u0008q\u0010-R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010^\u001a\u0004\u0008r\u0010-R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010o\u001a\u0004\u0008s\u0010>R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010t\u001a\u0004\u0008u\u0010CR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010^\u001a\u0004\u0008v\u0010-R\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010w\u001a\u0004\u0008x\u0010FR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010^\u001a\u0004\u0008y\u0010-R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010^\u001a\u0004\u0008z\u0010-R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010^\u001a\u0004\u0008{\u0010-R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010^\u001a\u0004\u0008|\u0010-R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010^\u001a\u0004\u0008}\u0010-R\u001f\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010w\u001a\u0004\u0008~\u0010F\u00a8\u0006\u0082\u0001"
    }
    d2 = {
        "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;",
        "",
        "",
        "state",
        "backgroundImageUrl",
        "iconUrl",
        "titleDisplay",
        "descriptionDisplay",
        "buttonDisplay",
        "learnMoreDisplay",
        "learnMoreUrl",
        "learnMoreIcon",
        "privacyPolicyDisplay",
        "privacyPolicyUrl",
        "webAuthorizationUrl",
        "appAuthorizationUrl",
        "statusIcon",
        "statusDisplay",
        "automaticallyImportDisplay",
        "",
        "automaticallyImportEnabled",
        "automaticallyImportDescriptionDisplay",
        "automaticPostDisplay",
        "automaticallyPostEnabled",
        "Lcom/whoop/strava/domain/models/ActivitiesItemResponse;",
        "selectedActivitiesItem",
        "automaticallyPostDescriptionDisplay",
        "",
        "Lcom/whoop/strava/domain/models/ShareableGraphicResponse;",
        "shareableGraphics",
        "shareableGraphicDescriptionDisplay",
        "disconnectBubbleTitleDisplay",
        "disconnectBubbleDescriptionDisplay",
        "disconnectBubbleConfirmButtonDisplay",
        "disconnectBubbleCancelButtonDisplay",
        "Lcom/whoop/strava/domain/models/SelectableActivityResponse;",
        "selectableActivitiesList",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
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
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "()Ljava/lang/Boolean;",
        "component18",
        "component19",
        "component20",
        "component21",
        "()Lcom/whoop/strava/domain/models/ActivitiesItemResponse;",
        "component22",
        "component23",
        "()Ljava/util/List;",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "component29",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$strava_release",
        "(Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getState",
        "getBackgroundImageUrl",
        "getIconUrl",
        "getTitleDisplay",
        "getDescriptionDisplay",
        "getButtonDisplay",
        "getLearnMoreDisplay",
        "getLearnMoreUrl",
        "getLearnMoreIcon",
        "getPrivacyPolicyDisplay",
        "getPrivacyPolicyUrl",
        "getWebAuthorizationUrl",
        "getAppAuthorizationUrl",
        "getStatusIcon",
        "getStatusDisplay",
        "getAutomaticallyImportDisplay",
        "Ljava/lang/Boolean;",
        "getAutomaticallyImportEnabled",
        "getAutomaticallyImportDescriptionDisplay",
        "getAutomaticPostDisplay",
        "getAutomaticallyPostEnabled",
        "Lcom/whoop/strava/domain/models/ActivitiesItemResponse;",
        "getSelectedActivitiesItem",
        "getAutomaticallyPostDescriptionDisplay",
        "Ljava/util/List;",
        "getShareableGraphics",
        "getShareableGraphicDescriptionDisplay",
        "getDisconnectBubbleTitleDisplay",
        "getDisconnectBubbleDescriptionDisplay",
        "getDisconnectBubbleConfirmButtonDisplay",
        "getDisconnectBubbleCancelButtonDisplay",
        "getSelectableActivitiesList",
        "Companion",
        "$serializer",
        "a",
        "strava_release"
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

.field public static final Companion:Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$a;


# instance fields
.field private final appAuthorizationUrl:Ljava/lang/String;

.field private final automaticPostDisplay:Ljava/lang/String;

.field private final automaticallyImportDescriptionDisplay:Ljava/lang/String;

.field private final automaticallyImportDisplay:Ljava/lang/String;

.field private final automaticallyImportEnabled:Ljava/lang/Boolean;

.field private final automaticallyPostDescriptionDisplay:Ljava/lang/String;

.field private final automaticallyPostEnabled:Ljava/lang/Boolean;

.field private final backgroundImageUrl:Ljava/lang/String;

.field private final buttonDisplay:Ljava/lang/String;

.field private final descriptionDisplay:Ljava/lang/String;

.field private final disconnectBubbleCancelButtonDisplay:Ljava/lang/String;

.field private final disconnectBubbleConfirmButtonDisplay:Ljava/lang/String;

.field private final disconnectBubbleDescriptionDisplay:Ljava/lang/String;

.field private final disconnectBubbleTitleDisplay:Ljava/lang/String;

.field private final iconUrl:Ljava/lang/String;

.field private final learnMoreDisplay:Ljava/lang/String;

.field private final learnMoreIcon:Ljava/lang/String;

.field private final learnMoreUrl:Ljava/lang/String;

.field private final privacyPolicyDisplay:Ljava/lang/String;

.field private final privacyPolicyUrl:Ljava/lang/String;

.field private final selectableActivitiesList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/strava/domain/models/SelectableActivityResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedActivitiesItem:Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

.field private final shareableGraphicDescriptionDisplay:Ljava/lang/String;

.field private final shareableGraphics:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/strava/domain/models/ShareableGraphicResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final state:Ljava/lang/String;

.field private final statusDisplay:Ljava/lang/String;

.field private final statusIcon:Ljava/lang/String;

.field private final titleDisplay:Ljava/lang/String;

.field private final webAuthorizationUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->Companion:Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lhb1/l;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lhb1/l;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lhb1/l;

    invoke-direct {v5, v0}, Lhb1/l;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v5, 0x1d

    new-array v5, v5, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v6, 0x1

    aput-object v1, v5, v6

    const/4 v6, 0x2

    aput-object v1, v5, v6

    const/4 v6, 0x3

    aput-object v1, v5, v6

    const/4 v6, 0x4

    aput-object v1, v5, v6

    const/4 v6, 0x5

    aput-object v1, v5, v6

    const/4 v6, 0x6

    aput-object v1, v5, v6

    aput-object v1, v5, v4

    aput-object v1, v5, v0

    const/16 v0, 0x9

    aput-object v1, v5, v0

    const/16 v0, 0xa

    aput-object v1, v5, v0

    const/16 v0, 0xb

    aput-object v1, v5, v0

    const/16 v0, 0xc

    aput-object v1, v5, v0

    const/16 v0, 0xd

    aput-object v1, v5, v0

    const/16 v0, 0xe

    aput-object v1, v5, v0

    const/16 v0, 0xf

    aput-object v1, v5, v0

    const/16 v0, 0x10

    aput-object v1, v5, v0

    const/16 v0, 0x11

    aput-object v1, v5, v0

    const/16 v0, 0x12

    aput-object v1, v5, v0

    const/16 v0, 0x13

    aput-object v1, v5, v0

    const/16 v0, 0x14

    aput-object v1, v5, v0

    const/16 v0, 0x15

    aput-object v1, v5, v0

    const/16 v0, 0x16

    aput-object v3, v5, v0

    const/16 v0, 0x17

    aput-object v1, v5, v0

    const/16 v0, 0x18

    aput-object v1, v5, v0

    const/16 v0, 0x19

    aput-object v1, v5, v0

    const/16 v0, 0x1a

    aput-object v1, v5, v0

    const/16 v0, 0x1b

    aput-object v1, v5, v0

    const/16 v0, 0x1c

    aput-object v2, v5, v0

    sput-object v5, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x1ffc7fff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;->INSTANCE:Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->state:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->backgroundImageUrl:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->iconUrl:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->titleDisplay:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->descriptionDisplay:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->buttonDisplay:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreDisplay:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreUrl:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreIcon:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyDisplay:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyUrl:Ljava/lang/String;

    iput-object p13, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->webAuthorizationUrl:Ljava/lang/String;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->appAuthorizationUrl:Ljava/lang/String;

    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusIcon:Ljava/lang/String;

    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusDisplay:Ljava/lang/String;

    const p2, 0x8000

    and-int/2addr p2, p1

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDisplay:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDisplay:Ljava/lang/String;

    :goto_0
    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportEnabled:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportEnabled:Ljava/lang/Boolean;

    :goto_1
    const/high16 p2, 0x20000

    and-int/2addr p1, p2

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDescriptionDisplay:Ljava/lang/String;

    :goto_2
    move-object/from16 p1, p20

    goto :goto_3

    :cond_3
    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDescriptionDisplay:Ljava/lang/String;

    goto :goto_2

    :goto_3
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticPostDisplay:Ljava/lang/String;

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostEnabled:Ljava/lang/Boolean;

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectedActivitiesItem:Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    move-object/from16 p1, p23

    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostDescriptionDisplay:Ljava/lang/String;

    move-object/from16 p1, p24

    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphics:Ljava/util/List;

    move-object/from16 p1, p25

    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphicDescriptionDisplay:Ljava/lang/String;

    move-object/from16 p1, p26

    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleTitleDisplay:Ljava/lang/String;

    move-object/from16 p1, p27

    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleDescriptionDisplay:Ljava/lang/String;

    move-object/from16 p1, p28

    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleConfirmButtonDisplay:Ljava/lang/String;

    move-object/from16 p1, p29

    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleCancelButtonDisplay:Ljava/lang/String;

    move-object/from16 p1, p30

    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectableActivitiesList:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
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
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/strava/domain/models/ActivitiesItemResponse;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/strava/domain/models/ShareableGraphicResponse;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/strava/domain/models/SelectableActivityResponse;",
            ">;)V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundImageUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonDisplay"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->state:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->backgroundImageUrl:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->iconUrl:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->titleDisplay:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->descriptionDisplay:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->buttonDisplay:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreDisplay:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreUrl:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreIcon:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyDisplay:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyUrl:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->webAuthorizationUrl:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->appAuthorizationUrl:Ljava/lang/String;

    .line 16
    iput-object p14, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusIcon:Ljava/lang/String;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusDisplay:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDisplay:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportEnabled:Ljava/lang/Boolean;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDescriptionDisplay:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticPostDisplay:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostEnabled:Ljava/lang/Boolean;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectedActivitiesItem:Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostDescriptionDisplay:Ljava/lang/String;

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphics:Ljava/util/List;

    move-object/from16 p1, p24

    .line 26
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphicDescriptionDisplay:Ljava/lang/String;

    move-object/from16 p1, p25

    .line 27
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleTitleDisplay:Ljava/lang/String;

    move-object/from16 p1, p26

    .line 28
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleDescriptionDisplay:Ljava/lang/String;

    move-object/from16 p1, p27

    .line 29
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleConfirmButtonDisplay:Ljava/lang/String;

    move-object/from16 p1, p28

    .line 30
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleCancelButtonDisplay:Ljava/lang/String;

    move-object/from16 p1, p29

    .line 31
    iput-object p1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectableActivitiesList:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 32

    const v0, 0x8000

    and-int v0, p30, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object/from16 v18, v1

    goto :goto_0

    :cond_0
    move-object/from16 v18, p16

    :goto_0
    const/high16 v0, 0x10000

    and-int v0, p30, v0

    if-eqz v0, :cond_1

    move-object/from16 v19, v1

    goto :goto_1

    :cond_1
    move-object/from16 v19, p17

    :goto_1
    const/high16 v0, 0x20000

    and-int v0, p30, v0

    if-eqz v0, :cond_2

    move-object/from16 v20, v1

    :goto_2
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-object/from16 v17, p15

    move-object/from16 v21, p19

    move-object/from16 v22, p20

    move-object/from16 v23, p21

    move-object/from16 v24, p22

    move-object/from16 v25, p23

    move-object/from16 v26, p24

    move-object/from16 v27, p25

    move-object/from16 v28, p26

    move-object/from16 v29, p27

    move-object/from16 v30, p28

    move-object/from16 v31, p29

    goto :goto_3

    :cond_2
    move-object/from16 v20, p18

    goto :goto_2

    .line 32
    :goto_3
    invoke-direct/range {v2 .. v31}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/strava/domain/models/ShareableGraphicResponse$$serializer;->INSTANCE:Lcom/whoop/strava/domain/models/ShareableGraphicResponse$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/strava/domain/models/SelectableActivityResponse$$serializer;->INSTANCE:Lcom/whoop/strava/domain/models/SelectableActivityResponse$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p30

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->state:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->backgroundImageUrl:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->iconUrl:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->titleDisplay:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->descriptionDisplay:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->buttonDisplay:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreDisplay:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreUrl:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreIcon:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyDisplay:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyUrl:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->webAuthorizationUrl:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->appAuthorizationUrl:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusIcon:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusDisplay:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDisplay:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p30, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportEnabled:Ljava/lang/Boolean;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p30, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDescriptionDisplay:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p30, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticPostDisplay:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p30, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostEnabled:Ljava/lang/Boolean;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p30, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectedActivitiesItem:Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p30, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostDescriptionDisplay:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p30, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphics:Ljava/util/List;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p30, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphicDescriptionDisplay:Ljava/lang/String;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p30, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleTitleDisplay:Ljava/lang/String;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p30, v16

    move-object/from16 p11, v1

    if-eqz v16, :cond_19

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleDescriptionDisplay:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p30, v16

    move-object/from16 p12, v1

    if-eqz v16, :cond_1a

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleConfirmButtonDisplay:Ljava/lang/String;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p30, v16

    move-object/from16 p13, v1

    if-eqz v16, :cond_1b

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleCancelButtonDisplay:Ljava/lang/String;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p30, v16

    if-eqz v16, :cond_1c

    move-object/from16 p14, v1

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectableActivitiesList:Ljava/util/List;

    move-object/from16 p29, p14

    move-object/from16 p30, v1

    :goto_1c
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move-object/from16 p26, p11

    move-object/from16 p27, p12

    move-object/from16 p28, p13

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_1d

    :cond_1c
    move-object/from16 p30, p29

    move-object/from16 p29, v1

    goto :goto_1c

    :goto_1d
    invoke-virtual/range {p1 .. p30}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$strava_release(Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->state:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->backgroundImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->iconUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->descriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->buttonDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreDisplay:Ljava/lang/String;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xb

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->webAuthorizationUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xc

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->appAuthorizationUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xd

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xe

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xf

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDisplay:Ljava/lang/String;

    if-eqz v3, :cond_1

    :goto_0
    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v2, 0x10

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportEnabled:Ljava/lang/Boolean;

    if-eqz v3, :cond_3

    :goto_1
    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v4, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportEnabled:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v2, 0x11

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDescriptionDisplay:Ljava/lang/String;

    if-eqz v3, :cond_5

    :goto_2
    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDescriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/16 v2, 0x12

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticPostDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostEnabled:Ljava/lang/Boolean;

    const/16 v4, 0x13

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/strava/domain/models/ActivitiesItemResponse$$serializer;->INSTANCE:Lcom/whoop/strava/domain/models/ActivitiesItemResponse$$serializer;

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectedActivitiesItem:Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    const/16 v4, 0x14

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x15

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostDescriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x16

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphics:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x17

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphicDescriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x18

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleTitleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x19

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleDescriptionDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x1a

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleConfirmButtonDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x1b

    iget-object v3, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleCancelButtonDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x1c

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectableActivitiesList:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->state:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->webAuthorizationUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->appAuthorizationUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDescriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticPostDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component21()Lcom/whoop/strava/domain/models/ActivitiesItemResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectedActivitiesItem:Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostDescriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/strava/domain/models/ShareableGraphicResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphics:Ljava/util/List;

    return-object v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphicDescriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component25()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component26()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleDescriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component27()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleConfirmButtonDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component28()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleCancelButtonDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component29()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/strava/domain/models/SelectableActivityResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectableActivitiesList:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->buttonDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;
    .locals 31
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
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/strava/domain/models/ActivitiesItemResponse;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/strava/domain/models/ShareableGraphicResponse;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/strava/domain/models/SelectableActivityResponse;",
            ">;)",
            "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;"
        }
    .end annotation

    const-string v0, "state"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundImageUrl"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconUrl"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleDisplay"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionDisplay"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonDisplay"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v27, p26

    move-object/from16 v28, p27

    move-object/from16 v29, p28

    move-object/from16 v30, p29

    invoke-direct/range {v1 .. v30}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/strava/domain/models/ActivitiesItemResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->state:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->state:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->iconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->iconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->descriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->buttonDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->buttonDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->webAuthorizationUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->webAuthorizationUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->appAuthorizationUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->appAuthorizationUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDescriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDescriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticPostDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticPostDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectedActivitiesItem:Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectedActivitiesItem:Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostDescriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostDescriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphics:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphics:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphicDescriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphicDescriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleTitleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleTitleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleDescriptionDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleDescriptionDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleConfirmButtonDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleConfirmButtonDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleCancelButtonDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleCancelButtonDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectableActivitiesList:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectableActivitiesList:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1e

    return v2

    :cond_1e
    return v0
.end method

.method public final getAppAuthorizationUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->appAuthorizationUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getAutomaticPostDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticPostDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getAutomaticallyImportDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDescriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getAutomaticallyImportDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getAutomaticallyImportEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getAutomaticallyPostDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostDescriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getAutomaticallyPostEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getBackgroundImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->backgroundImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getButtonDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->buttonDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->descriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectBubbleCancelButtonDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleCancelButtonDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectBubbleConfirmButtonDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleConfirmButtonDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectBubbleDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleDescriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisconnectBubbleTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleTitleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getLearnMoreDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getLearnMoreIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getLearnMoreUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrivacyPolicyDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrivacyPolicyUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelectableActivitiesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/strava/domain/models/SelectableActivityResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectableActivitiesList:Ljava/util/List;

    return-object v0
.end method

.method public final getSelectedActivitiesItem()Lcom/whoop/strava/domain/models/ActivitiesItemResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectedActivitiesItem:Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    return-object v0
.end method

.method public final getShareableGraphicDescriptionDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphicDescriptionDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getShareableGraphics()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/strava/domain/models/ShareableGraphicResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphics:Ljava/util/List;

    return-object v0
.end method

.method public final getState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->state:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatusDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatusIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getWebAuthorizationUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->webAuthorizationUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->state:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->backgroundImageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->iconUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->titleDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->descriptionDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->buttonDisplay:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreDisplay:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreIcon:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyDisplay:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyUrl:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->webAuthorizationUrl:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->appAuthorizationUrl:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusIcon:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusDisplay:Ljava/lang/String;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDisplay:Ljava/lang/String;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportEnabled:Ljava/lang/Boolean;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDescriptionDisplay:Ljava/lang/String;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticPostDisplay:Ljava/lang/String;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostEnabled:Ljava/lang/Boolean;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectedActivitiesItem:Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    if-nez v2, :cond_e

    move v2, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Lcom/whoop/strava/domain/models/ActivitiesItemResponse;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostDescriptionDisplay:Ljava/lang/String;

    if-nez v2, :cond_f

    move v2, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphics:Ljava/util/List;

    if-nez v2, :cond_10

    move v2, v3

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphicDescriptionDisplay:Ljava/lang/String;

    if-nez v2, :cond_11

    move v2, v3

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleTitleDisplay:Ljava/lang/String;

    if-nez v2, :cond_12

    move v2, v3

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_12
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleDescriptionDisplay:Ljava/lang/String;

    if-nez v2, :cond_13

    move v2, v3

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_13
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleConfirmButtonDisplay:Ljava/lang/String;

    if-nez v2, :cond_14

    move v2, v3

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_14
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleCancelButtonDisplay:Ljava/lang/String;

    if-nez v2, :cond_15

    move v2, v3

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_15
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectableActivitiesList:Ljava/util/List;

    if-nez v1, :cond_16

    goto :goto_16

    :cond_16
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_16
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 32

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->state:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->backgroundImageUrl:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->iconUrl:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->titleDisplay:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->descriptionDisplay:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->buttonDisplay:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreDisplay:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreUrl:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->learnMoreIcon:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyDisplay:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->privacyPolicyUrl:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->webAuthorizationUrl:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->appAuthorizationUrl:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusIcon:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->statusDisplay:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDisplay:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportEnabled:Ljava/lang/Boolean;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyImportDescriptionDisplay:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticPostDisplay:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostEnabled:Ljava/lang/Boolean;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectedActivitiesItem:Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->automaticallyPostDescriptionDisplay:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphics:Ljava/util/List;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->shareableGraphicDescriptionDisplay:Ljava/lang/String;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleTitleDisplay:Ljava/lang/String;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleDescriptionDisplay:Ljava/lang/String;

    move-object/from16 v27, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleConfirmButtonDisplay:Ljava/lang/String;

    move-object/from16 v28, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->disconnectBubbleCancelButtonDisplay:Ljava/lang/String;

    move-object/from16 v29, v15

    iget-object v15, v0, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->selectableActivitiesList:Ljava/util/List;

    const-string v0, ", backgroundImageUrl="

    move-object/from16 v30, v15

    const-string v15, ", iconUrl="

    move-object/from16 v31, v13

    const-string v13, "StravaBffSettingsResponse(state="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", titleDisplay="

    const-string v2, ", descriptionDisplay="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", buttonDisplay="

    const-string v2, ", learnMoreDisplay="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", learnMoreUrl="

    const-string v2, ", learnMoreIcon="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", privacyPolicyDisplay="

    const-string v2, ", privacyPolicyUrl="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", webAuthorizationUrl="

    const-string v2, ", appAuthorizationUrl="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", statusIcon="

    const-string v2, ", statusDisplay="

    move-object/from16 v3, v31

    invoke-static {v0, v3, v1, v14, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", automaticallyImportDisplay="

    const-string v2, ", automaticallyImportEnabled="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", automaticallyImportDescriptionDisplay="

    const-string v2, ", automaticPostDisplay="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v3, v1, v4, v2, v0}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", automaticallyPostEnabled="

    const-string v2, ", selectedActivitiesItem="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v4, v3, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", automaticallyPostDescriptionDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shareableGraphics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shareableGraphicDescriptionDisplay="

    const-string v2, ", disconnectBubbleTitleDisplay="

    move-object/from16 v3, v24

    move-object/from16 v4, v25

    invoke-static {v1, v4, v2, v0, v3}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", disconnectBubbleDescriptionDisplay="

    const-string v2, ", disconnectBubbleConfirmButtonDisplay="

    move-object/from16 v3, v26

    move-object/from16 v4, v27

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", disconnectBubbleCancelButtonDisplay="

    const-string v2, ", selectableActivitiesList="

    move-object/from16 v3, v28

    move-object/from16 v4, v29

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    move-object/from16 v2, v30

    invoke-static {v0, v2, v1}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
