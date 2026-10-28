.class final Lai2/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lai2/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008R\u0017\u0010\r\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\n\u0010\u000cR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0016\u001a\u0004\u0008\u000f\u0010\u0017R\u001d\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0016\u001a\u0004\u0008\u001a\u0010\u0017\u00a8\u0006\u001c"
    }
    d2 = {
        "Lai2/k$a;",
        "",
        "Loh2/a;",
        "acquisitionInfo",
        "<init>",
        "(Loh2/a;)V",
        "a",
        "Loh2/a;",
        "()Loh2/a;",
        "Lst0/v;",
        "b",
        "Lst0/v;",
        "()Lst0/v;",
        "deviceType",
        "Lcu0/c;",
        "c",
        "Lcu0/c;",
        "d",
        "()Lcu0/c;",
        "rev1StrapInfo",
        "",
        "Lnt0/h;",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "rev1Packets",
        "Lgu0/c;",
        "e",
        "rev2Rows",
        "strap-history-sync_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Loh2/a;

.field private final b:Lst0/v;

.field private final c:Lcu0/c;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnt0/h;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgu0/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Loh2/a;)V
    .locals 2

    const-string v0, "acquisitionInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lai2/k$a;->a:Loh2/a;

    sget-object v0, Lst0/v;->Companion:Lst0/v$a;

    invoke-virtual {p1}, Loh2/a;->g()B

    move-result v1

    invoke-virtual {v0, v1}, Lst0/v$a;->e(B)Lst0/v;

    move-result-object v0

    iput-object v0, p0, Lai2/k$a;->b:Lst0/v;

    invoke-static {p1}, Lai2/l;->a(Loh2/a;)Lcu0/c;

    move-result-object p1

    iput-object p1, p0, Lai2/k$a;->c:Lcu0/c;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lai2/k$a;->d:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lai2/k$a;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Loh2/a;
    .locals 1

    iget-object v0, p0, Lai2/k$a;->a:Loh2/a;

    return-object v0
.end method

.method public final b()Lst0/v;
    .locals 1

    iget-object v0, p0, Lai2/k$a;->b:Lst0/v;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnt0/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lai2/k$a;->d:Ljava/util/List;

    return-object v0
.end method

.method public final d()Lcu0/c;
    .locals 1

    iget-object v0, p0, Lai2/k$a;->c:Lcu0/c;

    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lgu0/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lai2/k$a;->e:Ljava/util/List;

    return-object v0
.end method
