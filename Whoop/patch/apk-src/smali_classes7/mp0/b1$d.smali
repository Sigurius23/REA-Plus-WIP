.class public final Lmp0/b1$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf93/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmp0/b1;-><init>(Lcom/whoop/coaching/sleepcoach/wizard/b;Lz82/e;Lsr2/y;Lbc3/c0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lf93/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0004H\u0096\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u00042\u0006\u0010\u0008\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\"\u0010\u0008\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u0006\u0010\u000e\"\u0004\u0008\n\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "mp0/b1$d",
        "Lf93/d;",
        "",
        "thisRef",
        "Lj93/z;",
        "property",
        "getValue",
        "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;",
        "value",
        "Ll83/a0;",
        "setValue",
        "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V",
        "w",
        "Ljava/lang/Object;",
        "()Ljava/lang/Object;",
        "(Ljava/lang/Object;)V",
        "feature_release"
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
.field private w:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnp0/m;"
        }
    .end annotation
.end field

.field final synthetic x:Lmp0/b1;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lmp0/b1;)V
    .locals 0

    iput-object p2, p0, Lmp0/b1$d;->x:Lmp0/b1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp0/b1$d;->w:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lj93/z;",
            ")",
            "Lnp0/m;"
        }
    .end annotation

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lmp0/b1$d;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lj93/z;",
            "Lnp0/m;",
            ")V"
        }
    .end annotation

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lmp0/b1$d;->w:Ljava/lang/Object;

    check-cast p3, Lnp0/m;

    iget-object p1, p0, Lmp0/b1$d;->x:Lmp0/b1;

    invoke-virtual {p1}, Lmp0/b1;->H()Landroidx/lifecycle/p0;

    move-result-object p2

    iget-object p3, p0, Lmp0/b1$d;->x:Lmp0/b1;

    invoke-virtual {p3}, Lmp0/b1;->G()Lnp0/m;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lmp0/b1;->w(Lmp0/b1;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    return-void
.end method
