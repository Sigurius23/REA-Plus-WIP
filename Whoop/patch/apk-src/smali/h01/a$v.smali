.class final Lh01/a$v;
.super Lh01/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh01/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "v"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\u00ca\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "com/whoop/design/atomic/molecule/card/notification/HomeNotificationCardStyle.HAL",
        "Lh01/a;",
        "Landroidx/compose/ui/Modifier;",
        "w",
        "Landroidx/compose/ui/Modifier;",
        "getStyleModifier",
        "()Landroidx/compose/ui/Modifier;",
        "styleModifier",
        "design_release"
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
.field private final w:Landroidx/compose/ui/Modifier;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    new-instance v4, Ld11/j;

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v0

    invoke-static {v0}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v4, v0, v1, v2, v3}, Ld11/j;-><init>(Lj91/b;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Lh01/a$v$a;->w:Lh01/a$v$a;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v0

    sget-object v5, Lh01/a$v$b;->w:Lh01/a$v$b;

    invoke-static {v5}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    new-array v6, v2, [Ly81/e;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    aput-object v5, v6, v0

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    int-to-float v0, v7

    const/4 v6, 0x4

    int-to-float v10, v6

    mul-float v7, v0, v10

    move-object v0, v3

    new-instance v3, Li91/d;

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v6

    invoke-static {v6}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v6

    invoke-direct {v3, v6, v1, v2, v0}, Li91/d;-><init>(Lj91/b;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v9}, Lh01/a;-><init>(Ljava/lang/String;ILi91/a;Ld11/a;Ljava/util/List;Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lh01/a;->getBackground()Li91/a;

    move-result-object p1

    const/4 p2, 0x3

    int-to-float p2, p2

    mul-float/2addr p2, v10

    invoke-static {p2}, Lt0/j;->e(F)Lt0/i;

    move-result-object p2

    const v1, 0x3dcccccd    # 0.1f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v2, p1, p2, v1}, Li91/c;->d(Landroidx/compose/ui/Modifier;Li91/a;Li2/a1;Ljava/lang/Float;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    iput-object p1, v0, Lh01/a$v;->w:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public getStyleModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    iget-object v0, p0, Lh01/a$v;->w:Landroidx/compose/ui/Modifier;

    return-object v0
.end method
