.class public final Luc3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc3/e;


# static fields
.field public static final w:Luc3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luc3/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Luc3/d;->w:Luc3/d;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    const-string v0, "expected an Int value"

    return-object v0
.end method
