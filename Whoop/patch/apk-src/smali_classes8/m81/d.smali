.class public final synthetic Lm81/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lm81/f;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:I

.field public final synthetic w:Lm81/g;

.field public final synthetic x:J

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lm81/g;JZFLm81/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm81/d;->w:Lm81/g;

    iput-wide p2, p0, Lm81/d;->x:J

    iput-boolean p4, p0, Lm81/d;->y:Z

    iput p5, p0, Lm81/d;->z:F

    iput-object p6, p0, Lm81/d;->E:Lm81/f;

    iput-object p7, p0, Lm81/d;->F:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lm81/d;->G:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lm81/d;->H:I

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

    iget-object v0, p0, Lm81/d;->w:Lm81/g;

    iget-wide v1, p0, Lm81/d;->x:J

    iget-boolean v3, p0, Lm81/d;->y:Z

    iget v4, p0, Lm81/d;->z:F

    iget-object v5, p0, Lm81/d;->E:Lm81/f;

    iget-object v6, p0, Lm81/d;->F:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lm81/d;->G:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Lm81/d;->H:I

    invoke-static/range {v0 .. v10}, Lm81/e;->f(Lm81/g;JZFLm81/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
