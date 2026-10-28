.class public final synthetic Lq11/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lq11/i;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:I

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ILq11/i;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lq11/g;->w:Lq11/i;

    iput-object p1, p0, Lq11/g;->x:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Lq11/g;->y:I

    iput-object p4, p0, Lq11/g;->z:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v4, p1

    check-cast v4, Lc0/i0;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lq11/g;->w:Lq11/i;

    iget-object v1, p0, Lq11/g;->x:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lq11/g;->y:I

    iget-object v3, p0, Lq11/g;->z:Lp1/c1;

    invoke-static/range {v0 .. v6}, Lq11/h;->h(Lq11/i;Lkotlin/jvm/functions/Function1;ILp1/c1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
