.class public abstract Ld33/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld33/e;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lj53/f;
    .locals 1

    sget-object v0, Lj53/c;->a:Lj53/c;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld33/e;->a:Ljava/lang/String;

    return-object v0
.end method
