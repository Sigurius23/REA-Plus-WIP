.class public final Lai/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lai/d;


# instance fields
.field public final a:Lai/k;

.field public final b:Lai/j;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lai/k;Lai/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lai/f;->a:Lai/k;

    iput-object p2, p0, Lai/f;->b:Lai/j;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lai/f;->c:Ljava/lang/Object;

    return-void
.end method
