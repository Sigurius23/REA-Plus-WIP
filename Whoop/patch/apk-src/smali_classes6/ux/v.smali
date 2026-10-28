.class public final Lux/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lux/w;


# instance fields
.field public final a:Lj/d;


# direct methods
.method public constructor <init>(Lj/d;)V
    .locals 1

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lux/v;->a:Lj/d;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lyx/b;

    iget-object v0, p0, Lux/v;->a:Lj/d;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void
.end method
