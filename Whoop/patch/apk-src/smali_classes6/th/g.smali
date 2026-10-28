.class public final Lth/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final w:Lth/c;


# direct methods
.method public constructor <init>(Lth/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lth/g;->w:Lth/c;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lth/g;->w:Lth/c;

    invoke-virtual {v0}, Lth/c;->close()V

    return-void
.end method
