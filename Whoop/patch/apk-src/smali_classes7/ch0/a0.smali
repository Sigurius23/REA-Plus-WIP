.class public final synthetic Lch0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Lzg0/d;

.field public final synthetic x:Lm91/u;

.field public final synthetic y:F

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lzg0/d;Lm91/u;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/a0;->w:Lzg0/d;

    iput-object p2, p0, Lch0/a0;->x:Lm91/u;

    iput p3, p0, Lch0/a0;->y:F

    iput-object p4, p0, Lch0/a0;->z:Ljava/lang/String;

    iput-object p5, p0, Lch0/a0;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lch0/a0;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lch0/a0;->G:Lkotlin/jvm/functions/Function1;

    iput p8, p0, Lch0/a0;->H:I

    iput p9, p0, Lch0/a0;->I:I

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

    iget-object v0, p0, Lch0/a0;->w:Lzg0/d;

    iget-object v1, p0, Lch0/a0;->x:Lm91/u;

    iget v2, p0, Lch0/a0;->y:F

    iget-object v3, p0, Lch0/a0;->z:Ljava/lang/String;

    iget-object v4, p0, Lch0/a0;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lch0/a0;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lch0/a0;->G:Lkotlin/jvm/functions/Function1;

    iget v7, p0, Lch0/a0;->H:I

    iget v8, p0, Lch0/a0;->I:I

    invoke-static/range {v0 .. v10}, Lch0/c0;->r(Lzg0/d;Lm91/u;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
