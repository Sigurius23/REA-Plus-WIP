.class public final synthetic Lvn1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic F:Lvn1/i;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Lm91/n;

.field public final synthetic x:Lm91/n;

.field public final synthetic y:I

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lm91/n;Lm91/n;ILkotlin/jvm/functions/Function1;Lc93/m;Lvn1/i;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn1/n;->w:Lm91/n;

    iput-object p2, p0, Lvn1/n;->x:Lm91/n;

    iput p3, p0, Lvn1/n;->y:I

    iput-object p4, p0, Lvn1/n;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lvn1/n;->E:Lc93/m;

    iput-object p6, p0, Lvn1/n;->F:Lvn1/i;

    iput-object p7, p0, Lvn1/n;->G:Lkotlin/jvm/functions/Function1;

    iput p8, p0, Lvn1/n;->H:I

    iput p9, p0, Lvn1/n;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lvn1/n;->w:Lm91/n;

    iget-object v1, p0, Lvn1/n;->x:Lm91/n;

    iget v2, p0, Lvn1/n;->y:I

    iget-object v3, p0, Lvn1/n;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lvn1/n;->E:Lc93/m;

    iget-object v5, p0, Lvn1/n;->F:Lvn1/i;

    iget-object v6, p0, Lvn1/n;->G:Lkotlin/jvm/functions/Function1;

    iget v7, p0, Lvn1/n;->H:I

    iget v8, p0, Lvn1/n;->I:I

    invoke-static/range {v0 .. v10}, Lvn1/p;->k(Lm91/n;Lm91/n;ILkotlin/jvm/functions/Function1;Lc93/m;Lvn1/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
