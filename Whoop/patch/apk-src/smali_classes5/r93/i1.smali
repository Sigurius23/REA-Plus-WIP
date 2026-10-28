.class public final Lr93/i1;
.super Lr93/m1;
.source "SourceFile"


# static fields
.field public static final c:Lr93/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr93/i1;

    const-string v1, "protected"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lr93/m1;-><init>(Ljava/lang/String;Z)V

    sput-object v0, Lr93/i1;->c:Lr93/i1;

    return-void
.end method
