.class public final Lxb3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxb3/i;


# instance fields
.field public final a:Lxb3/i;

.field public final b:Z

.field public final c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lxb3/i;ZLkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "predicate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxb3/f;->a:Lxb3/i;

    iput-boolean p2, p0, Lxb3/f;->b:Z

    iput-object p3, p0, Lxb3/f;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lxb3/e;

    invoke-direct {v0, p0}, Lxb3/e;-><init>(Lxb3/f;)V

    return-object v0
.end method
