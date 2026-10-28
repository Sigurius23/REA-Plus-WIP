.class public final synthetic Lsn/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/w;


# instance fields
.field public final synthetic a:Lsn/h;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lsn/h;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/f;->a:Lsn/h;

    iput-object p2, p0, Lsn/f;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lsn/a;Lrm/o1;)V
    .locals 2

    iget-object v0, p0, Lsn/f;->a:Lsn/h;

    iget-object v1, p0, Lsn/f;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1, p2}, Lsn/h;->q(Ljava/lang/Object;Lsn/a;Lrm/o1;)V

    return-void
.end method
