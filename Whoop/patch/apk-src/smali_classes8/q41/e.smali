.class public final synthetic Lq41/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:F

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:F

.field public final synthetic x:Z

.field public final synthetic y:F

.field public final synthetic z:Lq41/c;


# direct methods
.method public synthetic constructor <init>(FZFLq41/c;Lkotlin/jvm/functions/Function1;FLp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lq41/e;->w:F

    iput-boolean p2, p0, Lq41/e;->x:Z

    iput p3, p0, Lq41/e;->y:F

    iput-object p4, p0, Lq41/e;->z:Lq41/c;

    iput-object p5, p0, Lq41/e;->E:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Lq41/e;->F:F

    iput-object p7, p0, Lq41/e;->G:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v7, p1

    check-cast v7, Ll0/v;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v0, p0, Lq41/e;->w:F

    iget-boolean v1, p0, Lq41/e;->x:Z

    iget v2, p0, Lq41/e;->y:F

    iget-object v3, p0, Lq41/e;->z:Lq41/c;

    iget-object v4, p0, Lq41/e;->E:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Lq41/e;->F:F

    iget-object v6, p0, Lq41/e;->G:Lp1/c1;

    invoke-static/range {v0 .. v9}, Lq41/f;->c(FZFLq41/c;Lkotlin/jvm/functions/Function1;FLp1/c1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
