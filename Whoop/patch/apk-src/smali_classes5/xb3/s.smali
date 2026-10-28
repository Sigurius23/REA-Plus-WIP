.class public final Lxb3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxb3/i;


# instance fields
.field public final a:Lxb3/i;

.field public final b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lxb3/i;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxb3/s;->a:Lxb3/i;

    iput-object p2, p0, Lxb3/s;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lo63/h;

    invoke-direct {v0, p0}, Lo63/h;-><init>(Lxb3/s;)V

    return-object v0
.end method
