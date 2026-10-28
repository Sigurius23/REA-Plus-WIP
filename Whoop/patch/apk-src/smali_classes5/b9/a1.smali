.class public final Lb9/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb9/t0;


# instance fields
.field public final a:Ll9/x;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/ArrayList;

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Ll9/a;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ll9/x;

    invoke-direct {v0, p1, p2}, Ll9/x;-><init>(Ll9/a;Z)V

    iput-object v0, p0, Lb9/a1;->a:Ll9/x;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lb9/a1;->c:Ljava/util/ArrayList;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/a1;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb9/a1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Lu8/o0;
    .locals 1

    iget-object v0, p0, Lb9/a1;->a:Ll9/x;

    iget-object v0, v0, Ll9/x;->o:Ll9/v;

    return-object v0
.end method
