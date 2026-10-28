.class public final Lr93/e1;
.super Lr93/m1;
.source "SourceFile"


# static fields
.field public static final c:Lr93/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr93/e1;

    const-string v1, "invisible_fake"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr93/m1;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lr93/e1;->c:Lr93/e1;

    return-void
.end method
