.class public final Lp6/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/u1;
.implements Lp6/j1;


# static fields
.field public static final a:Lp6/t1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp6/t1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp6/t1;->a:Lp6/t1;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SizeMode.Single"

    return-object v0
.end method
