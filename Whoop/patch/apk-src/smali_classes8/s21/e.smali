.class public final synthetic Ls21/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(IIJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls21/e;->w:I

    iput p2, p0, Ls21/e;->x:I

    iput-wide p3, p0, Ls21/e;->y:J

    iput-wide p5, p0, Ls21/e;->z:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v6, p1

    check-cast v6, Ll0/v;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v0, p0, Ls21/e;->w:I

    iget v1, p0, Ls21/e;->x:I

    iget-wide v2, p0, Ls21/e;->y:J

    iget-wide v4, p0, Ls21/e;->z:J

    invoke-static/range {v0 .. v8}, Ls21/g;->d(IIJJLl0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
