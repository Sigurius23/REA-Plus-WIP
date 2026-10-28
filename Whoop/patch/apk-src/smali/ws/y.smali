.class public final Lws/y;
.super Lgs/b;
.source "SourceFile"


# instance fields
.field public final b:Lws/z;

.field public final c:Lro/i;

.field public final d:Lro/i;

.field public final e:Lro/i;

.field public final f:Lro/i;

.field public final g:Lro/i;

.field public final h:Lro/i;


# direct methods
.method public constructor <init>(Lws/z;Lro/i;Lro/i;Lro/i;Lro/i;Lro/i;Lro/i;)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lgs/b;-><init>(I)V

    iput-object p1, p0, Lws/y;->b:Lws/z;

    iput-object p2, p0, Lws/y;->d:Lro/i;

    iput-object p3, p0, Lws/y;->e:Lro/i;

    iput-object p4, p0, Lws/y;->c:Lro/i;

    iput-object p5, p0, Lws/y;->f:Lro/i;

    iput-object p6, p0, Lws/y;->g:Lro/i;

    iput-object p7, p0, Lws/y;->h:Lro/i;

    return-void
.end method


# virtual methods
.method public final X()Lgs/b;
    .locals 1

    iget-object v0, p0, Lws/y;->b:Lws/z;

    return-object v0
.end method
