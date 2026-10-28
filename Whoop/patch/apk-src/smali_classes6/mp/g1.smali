.class public final Lmp/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmp/f1;


# static fields
.field public static final a:Lf93/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Lmp/p;->y:I

    sget-object v0, Lmp/z;->I:[Ljava/lang/Object;

    new-instance v0, Lmp/c0;

    const-string v1, "FIDO"

    invoke-direct {v0, v1}, Lmp/c0;-><init>(Ljava/lang/Object;)V

    new-instance v0, Lf93/a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lmp/g1;->a:Lf93/a;

    return-void
.end method
