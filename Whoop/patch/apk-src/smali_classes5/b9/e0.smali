.class public final Lb9/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb9/t0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Lu8/o0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ll9/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/e0;->a:Ljava/lang/Object;

    iget-object p1, p2, Ll9/x;->o:Ll9/v;

    iput-object p1, p0, Lb9/e0;->b:Lu8/o0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb9/e0;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Lu8/o0;
    .locals 1

    iget-object v0, p0, Lb9/e0;->b:Lu8/o0;

    return-object v0
.end method
