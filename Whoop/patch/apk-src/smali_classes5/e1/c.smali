.class public abstract Le1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xa

    const-string v1, "H"

    invoke-static {v0, v1}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Le1/c;->a:Ljava/lang/String;

    invoke-static {v0, v1, v1}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Le1/c;->b:Ljava/lang/String;

    return-void
.end method
