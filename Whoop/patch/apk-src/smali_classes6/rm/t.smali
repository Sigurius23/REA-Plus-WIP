.class public final Lrm/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/q0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Lrm/o1;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lrm/o1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm/t;->a:Ljava/lang/Object;

    iput-object p2, p0, Lrm/t;->b:Lrm/o1;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrm/t;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Lrm/o1;
    .locals 1

    iget-object v0, p0, Lrm/t;->b:Lrm/o1;

    return-object v0
.end method
