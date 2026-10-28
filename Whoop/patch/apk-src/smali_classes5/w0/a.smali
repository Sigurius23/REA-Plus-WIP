.class public final Lw0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La0/q0;

.field public final b:La0/q0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La0/q0;

    invoke-direct {v0}, La0/q0;-><init>()V

    iput-object v0, p0, Lw0/a;->a:La0/q0;

    new-instance v0, La0/q0;

    invoke-direct {v0}, La0/q0;-><init>()V

    iput-object v0, p0, Lw0/a;->b:La0/q0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lw0/a;->a:La0/q0;

    sget-object v1, Lx0/f;->b:Lx0/f;

    invoke-virtual {v0, v1}, La0/q0;->a(Ljava/lang/Object;)V

    return-void
.end method
