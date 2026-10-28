.class public final synthetic Lbs1/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:D

.field public final synthetic z:D


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbs1/a0;->w:Ljava/lang/String;

    iput-object p2, p0, Lbs1/a0;->x:Ljava/lang/String;

    iput-wide p3, p0, Lbs1/a0;->y:D

    iput-wide p5, p0, Lbs1/a0;->z:D

    iput-object p7, p0, Lbs1/a0;->E:Ljava/lang/String;

    iput-object p8, p0, Lbs1/a0;->F:Lkotlin/jvm/functions/Function1;

    iput p9, p0, Lbs1/a0;->G:I

    iput p10, p0, Lbs1/a0;->H:I

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

    iget-object v0, p0, Lbs1/a0;->w:Ljava/lang/String;

    iget-object v1, p0, Lbs1/a0;->x:Ljava/lang/String;

    iget-wide v2, p0, Lbs1/a0;->y:D

    iget-wide v4, p0, Lbs1/a0;->z:D

    iget-object v6, p0, Lbs1/a0;->E:Ljava/lang/String;

    iget-object v7, p0, Lbs1/a0;->F:Lkotlin/jvm/functions/Function1;

    iget v8, p0, Lbs1/a0;->G:I

    iget v9, p0, Lbs1/a0;->H:I

    invoke-static/range {v0 .. v11}, Lbs1/c0;->W(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
