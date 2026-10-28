.class public final synthetic Lrm1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Lm91/n;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZLm91/n;Lc93/m;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lrm1/d;->w:Z

    iput-object p2, p0, Lrm1/d;->x:Lm91/n;

    iput-object p3, p0, Lrm1/d;->y:Lc93/m;

    iput-object p4, p0, Lrm1/d;->z:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v4, p1

    check-cast v4, Lc0/o;

    move-object v5, p2

    check-cast v5, Lm91/n;

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v0, p0, Lrm1/d;->w:Z

    iget-object v1, p0, Lrm1/d;->x:Lm91/n;

    iget-object v2, p0, Lrm1/d;->y:Lc93/m;

    iget-object v3, p0, Lrm1/d;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v7}, Lrm1/f;->c(ZLm91/n;Lc93/m;Lkotlin/jvm/functions/Function1;Lc0/o;Lm91/n;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
