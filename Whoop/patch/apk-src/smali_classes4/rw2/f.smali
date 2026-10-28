.class public final Lrw2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrw2/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR(\u0010\u0010\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u000c0\u000b0\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\r\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lrw2/f;",
        "Lrw2/a;",
        "<init>",
        "()V",
        "Lec3/l;",
        "Lqw2/a;",
        "upstream",
        "Lqw2/b;",
        "b",
        "(Lec3/l;)Lec3/l;",
        "",
        "Lj93/d;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "a",
        "Ljava/util/Set;",
        "()Ljava/util/Set;",
        "actionTypes",
        "whoop-action_release"
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
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lj93/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lcom/whoop/whoopaction/domain/models/ReloadAction;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lrw2/f;->a:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lj93/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrw2/f;->a:Ljava/util/Set;

    return-object v0
.end method

.method public b(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrw2/f$a;

    invoke-direct {v0, p1}, Lrw2/f$a;-><init>(Lec3/l;)V

    return-object v0
.end method

.method public bridge interact(Lec3/l;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-super {p0, p1}, Lrw2/a;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
