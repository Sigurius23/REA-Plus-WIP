.class public final synthetic Lbu2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:F

.field public final synthetic w:J

.field public final synthetic x:Lbu2/h;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(JLbu2/h;FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lbu2/i;->w:J

    iput-object p3, p0, Lbu2/i;->x:Lbu2/h;

    iput p4, p0, Lbu2/i;->y:F

    iput p5, p0, Lbu2/i;->z:F

    iput p6, p0, Lbu2/i;->E:F

    iput p7, p0, Lbu2/i;->F:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v6, p0, Lbu2/i;->F:F

    move-object v7, p1

    check-cast v7, Lk2/e;

    iget-wide v0, p0, Lbu2/i;->w:J

    iget-object v2, p0, Lbu2/i;->x:Lbu2/h;

    iget v3, p0, Lbu2/i;->y:F

    iget v4, p0, Lbu2/i;->z:F

    iget v5, p0, Lbu2/i;->E:F

    invoke-static/range {v0 .. v7}, Lbu2/j;->a(JLbu2/h;FFFFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
