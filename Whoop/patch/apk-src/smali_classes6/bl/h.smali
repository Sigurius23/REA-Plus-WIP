.class public final Lbl/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lul/b;


# instance fields
.field public final w:Ljava/security/MessageDigest;

.field public final x:Lul/d;


# direct methods
.method public constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lul/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lbl/h;->x:Lul/d;

    iput-object p1, p0, Lbl/h;->w:Ljava/security/MessageDigest;

    return-void
.end method


# virtual methods
.method public final b()Lul/d;
    .locals 1

    iget-object v0, p0, Lbl/h;->x:Lul/d;

    return-object v0
.end method
