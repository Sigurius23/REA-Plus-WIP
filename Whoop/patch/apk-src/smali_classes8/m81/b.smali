.class public final synthetic Lm81/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lm81/f;

.field public final synthetic F:Lm81/f;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:I

.field public final synthetic y:J

.field public final synthetic z:Ly3/f;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm81/b;->w:Ljava/util/List;

    iput p2, p0, Lm81/b;->x:I

    iput-wide p3, p0, Lm81/b;->y:J

    iput-object p5, p0, Lm81/b;->z:Ly3/f;

    iput-object p6, p0, Lm81/b;->E:Lm81/f;

    iput-object p7, p0, Lm81/b;->F:Lm81/f;

    iput-object p8, p0, Lm81/b;->G:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lm81/b;->H:I

    iput p10, p0, Lm81/b;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v0, p0, Lm81/b;->w:Ljava/util/List;

    iget v1, p0, Lm81/b;->x:I

    iget-wide v2, p0, Lm81/b;->y:J

    iget-object v4, p0, Lm81/b;->z:Ly3/f;

    iget-object v5, p0, Lm81/b;->E:Lm81/f;

    iget-object v6, p0, Lm81/b;->F:Lm81/f;

    iget-object v7, p0, Lm81/b;->G:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Lm81/b;->H:I

    iget v9, p0, Lm81/b;->I:I

    invoke-static/range {v0 .. v11}, Lm81/e;->i(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
