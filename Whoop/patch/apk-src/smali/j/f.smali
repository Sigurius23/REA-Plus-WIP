.class public final Lj/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj/b;

.field public final b:Lk/b;


# direct methods
.method public constructor <init>(Lk/b;Lj/b;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contract"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lj/f;->a:Lj/b;

    iput-object p1, p0, Lj/f;->b:Lk/b;

    return-void
.end method
