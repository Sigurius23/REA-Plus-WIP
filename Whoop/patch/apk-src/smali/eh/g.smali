.class public final Leh/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final w:Leh/c;


# direct methods
.method public constructor <init>(Leh/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leh/g;->w:Leh/c;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Leh/g;->w:Leh/c;

    invoke-virtual {v0}, Leh/c;->close()V

    return-void
.end method
