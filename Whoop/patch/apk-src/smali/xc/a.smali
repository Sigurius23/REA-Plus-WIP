.class public final Lxc/a;
.super Lyf/s;
.source "SourceFile"

# interfaces
.implements Lve/c;


# instance fields
.field public final y:Lwc/c;


# direct methods
.method public constructor <init>(Lwc/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lyf/s;-><init>(Ljava/io/Closeable;)V

    iput-object p1, p0, Lxc/a;->y:Lwc/c;

    return-void
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxc/a;->y:Lwc/c;

    iget-object v0, v0, Lwc/c;->E:Lve/b;

    invoke-virtual {v0, p1, p2}, Lve/b;->b(Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lxc/a;->y:Lwc/c;

    invoke-virtual {v0}, Lwc/c;->close()V

    return-void
.end method
