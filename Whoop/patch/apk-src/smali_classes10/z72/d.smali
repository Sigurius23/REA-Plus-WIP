.class public final synthetic Lz72/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic w:Lw72/g$c;

.field public final synthetic x:J

.field public final synthetic y:F

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lw72/g$c;JFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz72/d;->w:Lw72/g$c;

    iput-wide p2, p0, Lz72/d;->x:J

    iput p4, p0, Lz72/d;->y:F

    iput-object p5, p0, Lz72/d;->z:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lz72/d;->E:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Lz72/d;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lz72/d;->w:Lw72/g$c;

    iget-wide v1, p0, Lz72/d;->x:J

    iget v3, p0, Lz72/d;->y:F

    iget-object v4, p0, Lz72/d;->z:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lz72/d;->E:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Lz72/d;->F:I

    invoke-static/range {v0 .. v8}, Lz72/g;->t(Lw72/g$c;JFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
