.class public final synthetic Lqi/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/v;


# instance fields
.field public final synthetic a:Lqi/w;

.field public final synthetic b:Lwi/e;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ld1/j;


# direct methods
.method public synthetic constructor <init>(Lqi/w;Lwi/e;Ljava/lang/Object;Ld1/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqi/o;->a:Lqi/w;

    iput-object p2, p0, Lqi/o;->b:Lwi/e;

    iput-object p3, p0, Lqi/o;->c:Ljava/lang/Object;

    iput-object p4, p0, Lqi/o;->d:Ld1/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lqi/o;->c:Ljava/lang/Object;

    iget-object v1, p0, Lqi/o;->d:Ld1/j;

    iget-object v2, p0, Lqi/o;->a:Lqi/w;

    iget-object v3, p0, Lqi/o;->b:Lwi/e;

    invoke-virtual {v2, v3, v0, v1}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    return-void
.end method
