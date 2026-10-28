.class public final synthetic Lly0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:I

.field public final synthetic y:Ly2/j1;


# direct methods
.method public synthetic constructor <init>(ZILy2/j1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lly0/d;->w:Z

    iput p2, p0, Lly0/d;->x:I

    iput-object p3, p0, Lly0/d;->y:Ly2/j1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lly0/d;->y:Ly2/j1;

    check-cast p1, Ly2/i1;

    iget-boolean v1, p0, Lly0/d;->w:Z

    iget v2, p0, Lly0/d;->x:I

    invoke-static {v1, v2, v0, p1}, Lly0/e;->d(ZILy2/j1;Ly2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
