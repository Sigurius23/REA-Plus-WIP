.class public final Lov1/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u001d\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lov1/b;",
        "Landroidx/lifecycle/w1;",
        "Llv1/c;",
        "interactor",
        "<init>",
        "(Llv1/c;)V",
        "Lov1/a;",
        "viewEvent",
        "Llv1/a;",
        "o",
        "(Lov1/a;)Llv1/a;",
        "Lbc3/k1;",
        "n",
        "(Lov1/a;)Lbc3/k1;",
        "w",
        "Llv1/c;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/l;",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel;",
        "y",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "member-data-export_release"
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
.field private final w:Llv1/c;

.field private final x:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final y:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llv1/c;)V
    .locals 3

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lov1/b;->w:Llv1/c;

    const/4 p1, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-static {v1, v1, p1, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lov1/b;->x:Lec3/o1;

    new-instance v0, Lov1/b$b;

    invoke-direct {v0, p1, p0}, Lov1/b$b;-><init>(Lec3/l;Lov1/b;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    sget-object v1, Lec3/z1;->a:Lec3/b2;

    const/4 v2, 0x1

    invoke-static {v0, p1, v1, v2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lov1/b;->y:Lec3/l;

    return-void
.end method

.method public static final synthetic g(Lov1/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lov1/b;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lov1/b;)Llv1/c;
    .locals 0

    iget-object p0, p0, Lov1/b;->w:Llv1/c;

    return-object p0
.end method

.method public static final synthetic l(Lov1/b;Lov1/a;)Llv1/a;
    .locals 0

    invoke-direct {p0, p1}, Lov1/b;->o(Lov1/a;)Llv1/a;

    move-result-object p0

    return-object p0
.end method

.method private final o(Lov1/a;)Llv1/a;
    .locals 1

    instance-of v0, p1, Lov1/a$a;

    if-eqz v0, :cond_0

    sget-object p1, Llv1/a$a;->a:Llv1/a$a;

    return-object p1

    :cond_0
    instance-of v0, p1, Lov1/a$b;

    if-eqz v0, :cond_1

    new-instance v0, Llv1/a$b;

    check-cast p1, Lov1/a$b;

    invoke-virtual {p1}, Lov1/a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Llv1/a$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lov1/b;->y:Lec3/l;

    return-object v0
.end method

.method public final n(Lov1/a;)Lbc3/k1;
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lov1/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lov1/b$a;-><init>(Lov1/b;Lov1/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    return-object p1
.end method
