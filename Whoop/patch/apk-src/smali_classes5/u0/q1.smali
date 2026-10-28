.class public final Lu0/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/a1;


# instance fields
.field public final synthetic a:Li2/j;


# direct methods
.method public constructor <init>(Li2/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/q1;->a:Li2/j;

    return-void
.end method


# virtual methods
.method public final a(JLy3/m;Ly3/c;)Li2/p0;
    .locals 0

    new-instance p1, Li2/m0;

    iget-object p2, p0, Lu0/q1;->a:Li2/j;

    invoke-direct {p1, p2}, Li2/m0;-><init>(Li2/s0;)V

    return-object p1
.end method
