.class public final Lgb/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# instance fields
.field public final synthetic a:Lgb/q;

.field public final synthetic b:Leb/q;

.field public final synthetic c:Lz1/p;


# direct methods
.method public constructor <init>(Lgb/q;Leb/q;Lz1/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/k;->a:Lgb/q;

    iput-object p2, p0, Lgb/k;->b:Leb/q;

    iput-object p3, p0, Lgb/k;->c:Lz1/p;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    iget-object v0, p0, Lgb/k;->a:Lgb/q;

    invoke-virtual {v0}, Leb/i1;->b()Leb/t;

    move-result-object v0

    iget-object v1, p0, Lgb/k;->b:Leb/q;

    invoke-virtual {v0, v1}, Leb/t;->b(Leb/q;)V

    iget-object v0, p0, Lgb/k;->c:Lz1/p;

    invoke-virtual {v0, v1}, Lz1/p;->remove(Ljava/lang/Object;)Z

    return-void
.end method
