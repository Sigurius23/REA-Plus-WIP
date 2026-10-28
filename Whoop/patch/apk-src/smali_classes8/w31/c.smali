.class public final synthetic Lw31/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(FFZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw31/c;->w:F

    iput p2, p0, Lw31/c;->x:F

    iput-boolean p3, p0, Lw31/c;->y:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lw31/c;->y:Z

    check-cast p1, Lk2/c;

    iget v1, p0, Lw31/c;->w:F

    iget v2, p0, Lw31/c;->x:F

    invoke-static {v1, v2, v0, p1}, Lw31/e;->d(FFZLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
