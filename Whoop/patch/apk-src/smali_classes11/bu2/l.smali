.class public final synthetic Lbu2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FFFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lbu2/l;->w:F

    iput p2, p0, Lbu2/l;->x:F

    iput p3, p0, Lbu2/l;->y:F

    iput p4, p0, Lbu2/l;->z:F

    iput p5, p0, Lbu2/l;->E:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v4, p0, Lbu2/l;->E:F

    move-object v5, p1

    check-cast v5, Lk2/e;

    iget v0, p0, Lbu2/l;->w:F

    iget v1, p0, Lbu2/l;->x:F

    iget v2, p0, Lbu2/l;->y:F

    iget v3, p0, Lbu2/l;->z:F

    invoke-static/range {v0 .. v5}, Lbu2/m;->b(FFFFFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
