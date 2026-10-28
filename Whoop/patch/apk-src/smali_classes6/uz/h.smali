.class public final Luz/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx40/b;


# instance fields
.field public final synthetic w:Lbc3/m;


# direct methods
.method public constructor <init>(Lbc3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luz/h;->w:Lbc3/m;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lu40/g;

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Luz/s;

    iget-object p1, p1, Lu40/g;->a:Ljava/lang/String;

    invoke-direct {v0, p1}, Luz/s;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Luz/h;->w:Lbc3/m;

    invoke-virtual {p1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
