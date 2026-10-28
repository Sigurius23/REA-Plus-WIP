.class public final synthetic Lst1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:F

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FFFFJF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lst1/d;->w:F

    iput p2, p0, Lst1/d;->x:F

    iput p3, p0, Lst1/d;->y:F

    iput p4, p0, Lst1/d;->z:F

    iput-wide p5, p0, Lst1/d;->E:J

    iput p7, p0, Lst1/d;->F:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v6, p0, Lst1/d;->F:F

    move-object v7, p1

    check-cast v7, Lk2/e;

    iget v0, p0, Lst1/d;->w:F

    iget v1, p0, Lst1/d;->x:F

    iget v2, p0, Lst1/d;->y:F

    iget v3, p0, Lst1/d;->z:F

    iget-wide v4, p0, Lst1/d;->E:J

    invoke-static/range {v0 .. v7}, Lst1/f;->b(FFFFJFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
