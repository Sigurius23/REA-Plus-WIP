.class public final synthetic Lim1/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lfm1/d;

.field public final synthetic w:Lm91/u;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lim1/d0;

.field public final synthetic z:Lfm1/a;


# direct methods
.method public synthetic constructor <init>(Lm91/u;Lkotlin/jvm/functions/Function1;Lim1/d0;Lfm1/a;Lfm1/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim1/i0;->w:Lm91/u;

    iput-object p2, p0, Lim1/i0;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lim1/i0;->y:Lim1/d0;

    iput-object p4, p0, Lim1/i0;->z:Lfm1/a;

    iput-object p5, p0, Lim1/i0;->E:Lfm1/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lim1/i0;->w:Lm91/u;

    iget-object v1, p0, Lim1/i0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lim1/i0;->y:Lim1/d0;

    iget-object v3, p0, Lim1/i0;->z:Lfm1/a;

    iget-object v4, p0, Lim1/i0;->E:Lfm1/d;

    invoke-static/range {v0 .. v6}, Lim1/j0;->j(Lm91/u;Lkotlin/jvm/functions/Function1;Lim1/d0;Lfm1/a;Lfm1/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
