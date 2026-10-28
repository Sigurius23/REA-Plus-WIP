.class public final synthetic Lu31/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:F


# direct methods
.method public synthetic constructor <init>(FFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu31/d;->w:F

    iput p2, p0, Lu31/d;->x:F

    iput p3, p0, Lu31/d;->y:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lu31/d;->y:F

    check-cast p1, Li2/g0;

    iget v1, p0, Lu31/d;->w:F

    iget v2, p0, Lu31/d;->x:F

    invoke-static {v1, v2, v0, p1}, Lu31/e;->g(FFFLi2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
